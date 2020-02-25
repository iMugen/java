package com.itheima.ssm.mapper;

import com.itheima.ssm.po.Stu;

public interface StuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stu record);

    int insertSelective(Stu record);

    Stu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stu record);

    int updateByPrimaryKey(Stu record);
}