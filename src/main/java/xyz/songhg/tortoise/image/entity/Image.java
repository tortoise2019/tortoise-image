package xyz.songhg.tortoise.image.entity;

import lombok.Data;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/10/5 9:56
 */

@Data
@Document(collection = "tbl_image")
public class Image {
    @Id
    private String id;

    /**
     * 相册ID
     */
    private String atlasId;
    /**
     * 文件名
     */
    private String name;
    /**
     * 描述
     */
    private String discribe;
    /**
     * 文件类型
     */
    private String contentType;
    /**
     * 文件内容
     */
    private Binary content;
    /**
     * 文件大小
     */
    private long size;
    /**
     * 上传日期
     */
    private Date uploadTime;
    /**
     * md5 签名
     */
    private String md5;
    /**
     * 文件路径
     */
    private String url;
    /**
     * 是否共享
     */
    private Boolean share;

}
