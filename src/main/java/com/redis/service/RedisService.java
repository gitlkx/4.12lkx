package com.redis.service;

import com.util.AppResponse;
import com.util.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedisService {
    @Autowired
    private RedisOperator redisOperator;
//    public AppResponse Set(String key,String value){
//        key = "asdasdasdas";
//        value = "wtfdasd";
//        redisOperator.set(key,value);
//        return AppResponse.success("操作成功");
//    }
    public AppResponse redisSet(String key,String value,int time){
        redisOperator.set(key,value,time);
        return AppResponse.success("操作成功");
    }
}
