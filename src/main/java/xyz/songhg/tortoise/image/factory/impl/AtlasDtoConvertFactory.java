package xyz.songhg.tortoise.image.factory.impl;

import xyz.songhg.tortoise.image.entity.Atlas;
import xyz.songhg.tortoise.image.entity.dto.AtlasDto;
import xyz.songhg.tortoise.image.factory.DtoConvertFactory;

/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/10/7 21:48
 */
public class AtlasDtoConvertFactory implements DtoConvertFactory<AtlasDto, Atlas> {
    @Override
    public AtlasDto convertToDto(Atlas atlas) {
        AtlasDto atlasDto = new AtlasDto();
        atlasDto.setId(atlas.getId());
        atlasDto.setCreateTime(atlas.getCreateTime());
        atlasDto.setDescribe(atlas.getDescribe());
        atlasDto.setName(atlas.getName());
        return atlasDto;
    }

    @Override
    public Atlas convertToEntity(AtlasDto atlasDto) {
        Atlas atlas = new Atlas();
        atlas.setName(atlasDto.getName());
        atlas.setId(atlasDto.getId());
        atlas.setDescribe(atlasDto.getDescribe());
        return atlas;
    }
}
