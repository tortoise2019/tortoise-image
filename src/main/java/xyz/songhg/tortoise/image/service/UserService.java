package xyz.songhg.tortoise.image.service;

import xyz.songhg.tortoise.image.entity.User;

import java.util.List;

/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/9/26 22:29
 */
public interface UserService {
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    List<User> findUsers();
}
