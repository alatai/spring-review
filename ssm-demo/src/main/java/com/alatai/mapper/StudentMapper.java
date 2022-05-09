package com.alatai.mapper;

import com.alatai.entity.Student;

import java.util.List;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/12 15:12
 */
public interface StudentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> selectAll();
}
