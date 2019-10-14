package xyz.songhg.tortoise.image.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import xyz.songhg.tortoise.image.entity.User;

import java.util.List;


/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/9/26 23:43
 */
public class UserRepository  {

    @Autowired
    private MongoTemplate mongoTemplate;

    public User saveUser(User user) {
        return mongoTemplate.save(user);
    }

    public long removeUser(String username) {
        Query query = new Query(new Criteria("username").is(username));
        return mongoTemplate.remove(query, User.class).getDeletedCount();
    }

    public long updateUser(User user) {
        Query query = new Query(new Criteria("id").is(user.getId()));
        Update update = new Update().set("username", user.getUsername())
                .set("password", user.getPassword())
                .set("roles", user.getRoles());
        return mongoTemplate.updateFirst(query, update, User.class).getModifiedCount();
    }

    public User findUserByUsername(String username) {
        Query query = new Query(new Criteria("username").is(username));
        return mongoTemplate.findOne(query, User.class);
    }

    public List<User> findAllUser() {
        return mongoTemplate.findAll(User.class);
    }
}
