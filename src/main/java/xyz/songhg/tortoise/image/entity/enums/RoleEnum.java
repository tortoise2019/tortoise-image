package xyz.songhg.tortoise.image.entity.enums;

/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/9/25 23:52
 */
public enum RoleEnum {
    ROL_ADMIN(5),
    ROL_USER(3),
    ROL_VISITOR(1);

    private final int role;

    RoleEnum(int role) {
        this.role = role;
    }
}
