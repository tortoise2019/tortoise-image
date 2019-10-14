package xyz.songhg.tortoise.image.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import xyz.songhg.tortoise.image.entity.Atlas;
import xyz.songhg.tortoise.image.entity.dto.AtlasDto;
import xyz.songhg.tortoise.image.entity.dto.PageDto;
import xyz.songhg.tortoise.image.repository.AtlasRepoistory;
import xyz.songhg.tortoise.image.repository.ImageRepoistory;
import xyz.songhg.tortoise.image.service.AtlasService;

import java.util.List;

/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/10/7 23:05
 */
public class AtlasServiceImpl implements AtlasService {

    @Autowired
    private AtlasRepoistory atlasRepoistory;

    @Autowired
    private ImageRepoistory imageRepoistory;


    @Override
    public Atlas saveAtlas(Atlas atlas) {
        return atlasRepoistory.save(atlas);
    }

    @Override
    public void removeAtlas(String id) {
        int imageCount = imageRepoistory.count();

    }

    @Override
    public AtlasDto findAtlasById(String id, PageDto page) {
        return null;
    }

    @Override
    public List<AtlasDto> listAtlasByUserId(String userId) {
        return null;
    }
}
