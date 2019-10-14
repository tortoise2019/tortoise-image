package xyz.songhg.tortoise.image.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import xyz.songhg.tortoise.image.entity.Atlas;

import java.util.List;


/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/10/7 17:33
 */
@Repository
public class AtlasRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Atlas saveAtlas(Atlas atlas) {
       return mongoTemplate.save(atlas);
    }

    public long updateAtlas(Atlas atlas) {
        Query query = new Query(new Criteria("id").is(atlas.getId()));
        Update update = new Update().set("name", atlas.getName())
                .set("describe", atlas.getDescribe())
                .set("share", atlas.getShare());
        return mongoTemplate.upsert(query, update, Atlas.class).getModifiedCount();
    }

    public long removeAtlas(String id) {
        Query query = new Query(new Criteria("id").is(id));
        return mongoTemplate.remove(query, Atlas.class).getDeletedCount();
    }

    List<Atlas> findAtlasByUserId(String userId) {
        Query query = new Query(new Criteria("userId").is(userId))
                .with(Sort.by(Sort.Order.desc("create_time")));

        List<Atlas> atlases = mongoTemplate.find(query, Atlas.class);
        return atlases;
    }


}
