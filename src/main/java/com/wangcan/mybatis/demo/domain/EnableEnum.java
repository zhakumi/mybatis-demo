package com.wangcan.mybatis.demo.domain;

public enum EnableEnum {
    FALSE(0,Boolean.FALSE),
    TURE(1,Boolean.TRUE);
    private Integer value;
    private Boolean caption;

    EnableEnum(Integer value,Boolean caption){
        this.value=value;
        this.caption=caption;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Boolean getCaption() {
        return caption;
    }

    public void setCaption(Boolean caption) {
        this.caption = caption;
    }
}
