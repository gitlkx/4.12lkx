package com.rollcall.dao;

import com.rollcall.entity.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RollCallDao {
    /**
     * 随机获取一个学生
     * @return
     */
    Student getStudent();

    /**
     * 更新学生答题次数
     * @param student
     */
    void updateCallCount(Student student);

    /**
     * 保存点名记录
     * @param student
     */
    void saveHistory(Student student);

}
