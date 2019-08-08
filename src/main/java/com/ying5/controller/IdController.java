package com.ying5.controller;

import com.ying5.util.RedisBloomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/id")
public class IdController {

    @Autowired
    RedisBloomUtil redisBloomUtil;

    @RequestMapping("/add")
    public boolean add(@RequestParam(value = "key")String key,
                       @RequestBody List<String> value){

        redisBloomUtil.add(key,value.toArray(new String[0]));
        return true;
    }

    @RequestMapping("/exists")
    public boolean exist(@RequestParam(value = "key")String key,
                         @RequestParam(value = "value")String value){
        return redisBloomUtil.exists(key,value);
    }
}
