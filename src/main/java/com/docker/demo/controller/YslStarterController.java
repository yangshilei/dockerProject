package com.docker.demo.controller;

import com.docker.demo.dto.Result;
import com.example.yslspringbootstarter.service.YslService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@Slf4j
@RequestMapping("/ysl")
@RestController
public class YslStarterController {

    @Autowired
    YslService yslService;

    @ApiOperation(value = "自定义starter",notes = "自定义starter")
    @GetMapping("/ysl/starter")
    Result getYslStarter(){
        log.info("开始测试");
        String s = yslService.yslSay();
        return Result.ok(s);
    }
}
