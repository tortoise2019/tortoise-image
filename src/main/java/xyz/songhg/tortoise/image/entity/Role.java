package xyz.songhg.tortoise.image.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/9/26 23:27
 */
@Data
@Document(collection = "tbl_role")
public class Role {
    @Id
    private String id;

    @Indexed(unique = true, direction = IndexDirection.DESCENDING)
    private String role;
}
