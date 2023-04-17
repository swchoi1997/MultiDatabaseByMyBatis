package com.example.multidatabasetestmybatis.test2.domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface Test2Mapper {

    @Select("SELECT * FROM test2 where id = #{id}")
    Test2 findById(@Param("id") Long id);
}
