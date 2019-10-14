package xyz.songhg.tortoise.image.factory;

/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/10/7 21:44
 */
public interface DtoConvertFactory<T, S> {
    T convertToDto(S s);

    S convertToEntity(T t);
}
