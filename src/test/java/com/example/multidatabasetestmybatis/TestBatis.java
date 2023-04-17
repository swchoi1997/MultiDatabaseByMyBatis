package com.example.multidatabasetestmybatis;

import com.example.multidatabasetestmybatis.test1.domain.Test1;
import com.example.multidatabasetestmybatis.test1.domain.Test1Mapper;
import com.example.multidatabasetestmybatis.test2.domain.Test2;
import com.example.multidatabasetestmybatis.test2.domain.Test2Mapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestBatis {

    @Autowired
    private Test1Mapper test1Mapper;
    @Autowired
    private Test2Mapper test2Mapper;


    @Test
    public void test1() {
        Test1 result = test1Mapper.findById(1L);
        System.out.println(result.getTest1());
        Assertions.assertThat(result.getTest1()).isEqualTo("hello");

        result = test1Mapper.findById(2L);
        System.out.println(result.getTest1());
        Assertions.assertThat(result.getTest1()).isEqualTo("spring");
    }

    @Test
    public void test2(){
        Test2 resul2 = test2Mapper.findById(1L);
        System.out.println(resul2.getTest1());
        Assertions.assertThat(resul2.getTest1()).isEqualTo("hello");

        resul2 = test2Mapper.findById(2L);
        System.out.println(resul2.getTest1());
        Assertions.assertThat(resul2.getTest1()).isEqualTo("swm");
    }
}
