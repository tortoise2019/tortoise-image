package xyz.songhg.tortoise.image.entity.dto;

import lombok.Data;
import xyz.songhg.tortoise.image.entity.Image;

import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/10/7 21:04
 */

@Data
public class AtlasDto {
    private String id;
    private String name;
    private String describe;
    private Date createTime;
    private int imageNum;
    private List<ImageDto> images;
}
