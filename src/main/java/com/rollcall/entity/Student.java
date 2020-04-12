package com.rollcall.entity;

/**
 * 点名系统 学生实体类
 */
public class Student {
    /**
     * 学生编号
     */
    private String code;
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 点名次数
     */
    private int count;
    /**
     * 点名时间
     */
    private String time;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
