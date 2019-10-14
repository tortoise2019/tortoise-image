package xyz.songhg.tortoise.image.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/9/24 22:58
 */
@Document
@Data
public class User {
    @Id
    private String Id;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING)
    private String username;
    private String password;

    @DBRef
    private Set<Role> roles;
}
