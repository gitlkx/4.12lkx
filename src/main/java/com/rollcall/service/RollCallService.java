package com.rollcall.service;

import com.rollcall.dao.RollCallDao;
import com.rollcall.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RollCallService {
    @Resource
    private RollCallDao rollCallDao;

    /**
     * 随机抽取一个学生
     *
     * @return
     */
    public String getStudent() {
        Student student = rollCallDao.getStudent();
        rollCallDao.updateCallCount(student);
        rollCallDao.saveHistory(student);
        return student.getName();
    }
}
