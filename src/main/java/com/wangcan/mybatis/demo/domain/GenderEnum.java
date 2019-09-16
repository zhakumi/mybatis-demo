package com.wangcan.mybatis.demo.domain;

import lombok.Data;

public enum GenderEnum {
    MALE(1, "男"),
    FEMAL(2, "女"),
    UNKONW(0, "未知");

    private Integer value;
    private String caption;

    GenderEnum(Integer value, String caption) {
        this.value = value;
        this.caption = caption;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
