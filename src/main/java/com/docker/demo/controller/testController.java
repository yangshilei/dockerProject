package com.docker.demo.controller;

import com.docker.demo.dto.Result;
import com.docker.demo.dto.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@Slf4j
@RequestMapping("/docker")
@RestController
public class testController {

    @ApiOperation(value = "测试docker模块", notes = "测试docker模块")
    @GetMapping("/test")
    Result getTest(){
        User user = new User();
        user.setUsername("yangshilei");
        user.setAge(18);
        return Result.ok(user);
    }

}
