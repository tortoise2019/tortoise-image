package xyz.songhg.tortoise.image.factory.impl;

import xyz.songhg.tortoise.image.entity.Image;
import xyz.songhg.tortoise.image.entity.dto.ImageDto;
import xyz.songhg.tortoise.image.factory.DtoConvertFactory;

/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/10/7 21:56
 */
public class ImageDtoConvertFactory implements DtoConvertFactory<ImageDto, Image> {
    @Override
    public ImageDto convertToDto(Image image) {
        ImageDto imageDto = new ImageDto();
        imageDto.setContent(image.getContent());
        imageDto.setId(image.getId());
        imageDto.setContentType(image.getContentType());
        imageDto.setName(image.getName());
        imageDto.setSize(image.getSize());
        imageDto.setUploadTime(image.getUploadTime());
        imageDto.setUrl(image.getUrl());
        imageDto.setDiscribe(image.getDiscribe());
        return imageDto;
    }

    @Override
    public Image convertToEntity(ImageDto imageDto) {
        return null;
    }
}
