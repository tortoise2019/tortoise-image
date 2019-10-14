package xyz.songhg.tortoise.image.entity.dto;

import lombok.Data;
import org.bson.types.Binary;

import java.util.Date;

/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/10/7 21:09
 */
@Data
public class ImageDto {
    private String id;
    private String name;
    private String discribe;
    private String contentType;
    private Binary content;
    private long size;
    private Date uploadTime;
    private String url;
}
