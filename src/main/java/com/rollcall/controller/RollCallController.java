package com.rollcall.controller;

import com.rollcall.service.RollCallService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/rollcall")
public class RollCallController {

    @Resource
    private RollCallService rollCallService;

    @PostMapping("rollcall")
    public String rollCall() {
        try {
            String name = rollCallService.getStudent();
            return name;
        } catch (Exception e) {
            return "异常，查询失败！";
        }
    }
}
