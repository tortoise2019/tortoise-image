package xyz.songhg.tortoise.image.service;

import xyz.songhg.tortoise.image.entity.Atlas;
import xyz.songhg.tortoise.image.entity.dto.AtlasDto;
import xyz.songhg.tortoise.image.entity.dto.PageDto;

import java.util.List;

/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/10/7 20:44
 */
public interface AtlasService {

    Atlas saveAtlas(Atlas atlas);

    void removeAtlas(String id);

    AtlasDto findAtlasById(String id, PageDto page);

    List<AtlasDto> listAtlasByUserId(String userId);

}
