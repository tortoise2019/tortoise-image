package xyz.songhg.tortoise.image.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/10/5 9:37
 */
@Data
@Document(collection = "tbl_atlas")
public class Atlas {
    @Id
    private String id;
    /**
     * 名称
     */
    private String name;
    /**
     * 描述
     */
    private String describe;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 创建日期
     */
    @Field("create_time")
    private Date createTime;
    /**
     * 是否共享
     */
    private Boolean Share;
}
