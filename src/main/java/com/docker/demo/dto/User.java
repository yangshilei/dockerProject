package com.docker.demo.dto;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

@Data
public class User {

    private String username;

    private Integer age;

    @Override
    public String toString () {
        return JSONObject.toJSONString(this);
    }

}
