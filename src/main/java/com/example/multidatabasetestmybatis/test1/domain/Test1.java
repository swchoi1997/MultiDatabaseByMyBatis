package com.example.multidatabasetestmybatis.test1.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Test1 {

    private Long id;
    private String test1;

    public Test1() {

    }

    public Test1(Long id, String test1) {
        this.id = id;
        this.test1 = test1;
    }
}
