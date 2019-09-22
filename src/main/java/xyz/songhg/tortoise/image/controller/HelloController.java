package xyz.songhg.tortoise.image.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: songhaigang
 * Created in 2019/9/22 13:26
 */
@RestController
@RequestMapping("/hello")
@Api
public class HelloController {

    @ApiOperation(value = "hello")
    @GetMapping
    public String hello() {
        return "Hello Tortoise Image";
    }
}
