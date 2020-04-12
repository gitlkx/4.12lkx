package com.redis.controller;

import com.redis.service.RedisService;
import com.util.AppResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping("/redis")
public class RedisController {
    private RedisService redisService;
    @PostMapping("redisSet")
    public AppResponse redisSet (String key,String value,int time){
        try{
            return redisService.redisSet(key,value,time);
        }catch (Exception e){
            System.out.println(e.toString());
            throw e;
        }
    }
}
