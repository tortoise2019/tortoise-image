package xyz.songhg.tortoise.image.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import xyz.songhg.tortoise.image.entity.Image;

import java.util.List;


/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/10/7 17:30
 */
@Repository
public class ImageRepoistory  {

    @Autowired
    private MongoTemplate mongoTemplate;

    public Image saveImage(Image image) {
        return mongoTemplate.save(image);
    }

    public long removeImageById(String id) {
        Query query = new Query(new Criteria("id").is(id));
        return mongoTemplate.remove(query, Image.class).getDeletedCount();
    }

    public long removeImageByIds(List<String> ids) {
        Query query = new Query(new Criteria("id").in(ids));
        return mongoTemplate.remove(query, Image.class).getDeletedCount();
    }

    public long removeImageByAtlasId(String atlasId) {
        Query query = new Query(new Criteria("atlasId").is(atlasId));
        return mongoTemplate.remove(query, Image.class).getDeletedCount();
    }

    public long updateImage(Image image) {
        Query query = new Query(new Criteria("id").is(image.getId()));
        Update update = new Update().set("name", image.getName())
                .set("discribe", image.getDiscribe())
                .set("url", image.getUrl())
                .set("share", image.getShare());
        return mongoTemplate.updateFirst(query, update, Image.class).getModifiedCount();
    }

    public Image findImageById(String id) {
        Query query = new Query(new Criteria("id").is(id));
        return mongoTemplate.findOne(query, Image.class);
    }

    public List<Image> findImageByAtlasId(String atlasId) {
        Query query = new Query(new Criteria("atlasId").is(atlasId))
                .with(Sort.by(Sort.Order.desc("create_time")));
        List<Image> images = mongoTemplate.find(query, Image.class);
        return images;
    }

    public List<Image> findImageByAtlasIdAndShare(String atlasId, Boolean share) {
        Query query = new Query(new Criteria("atlasId").is(atlasId).and("share").is(share))
                .with(Sort.by(Sort.Order.desc("create_time")));
        List<Image> images = mongoTemplate.find(query, Image.class);
        return images;
    }

    public long countImageByAtlasId(String atlasId) {
        Criteria criteria = new Criteria("atlasId").is(atlasId);
        Query query = new Query(criteria);
        return mongoTemplate.count(query, Image.class);
    }

    public long countImageByAtlasIdAndShare(String atlasId, Boolean share) {
        Criteria criteria = new Criteria("atlasId").is(atlasId).and("share").is(share);
        Query query = new Query(criteria);
        return mongoTemplate.count(query, Image.class);
    }
}
