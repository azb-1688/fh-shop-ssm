package com.fh.shop.category.common;

public enum ResponseEnum {
    ERROR(-1,"error"),
    USERNAME_USERPWD_IS_Empty(1,"用户名或者密码为空或验证码为空"),
    USERNAME_IS_ERROR(2,"用户名错误"),
    USERPWD_ERROR(3,"密码错误"),
    USER_IS_EXIST(4,"用户名已存在"),
    CODR_ID_ERROR(5,"验证码错误"),
    SUCCESS(200,"ok");

    private int code;
    private String msg;

    private ResponseEnum(int code, String msg){
        this.code=code;
        this.msg=msg;

    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
