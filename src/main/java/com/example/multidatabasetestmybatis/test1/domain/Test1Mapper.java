package com.example.multidatabasetestmybatis.test1.domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Test1Mapper {

    @Select("SELECT * FROM test1 WHERE id = #{id}")
    Test1 findById(@Param("id") Long id);
}
