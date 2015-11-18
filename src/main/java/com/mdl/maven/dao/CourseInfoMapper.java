package com.mdl.maven.dao;

import com.mdl.maven.model.CourseInfo;

public interface CourseInfoMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(CourseInfo record);

    int insertSelective(CourseInfo record);

    CourseInfo selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(CourseInfo record);

    int updateByPrimaryKey(CourseInfo record);
}