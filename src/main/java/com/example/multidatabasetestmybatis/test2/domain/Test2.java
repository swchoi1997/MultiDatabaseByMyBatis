package com.example.multidatabasetestmybatis.test2.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Test2 {

    private Long id;
    private String test1;

    public Test2() {

    }

    public Test2(Long id, String test1) {
        this.id = id;
        this.test1 = test1;
    }
}
