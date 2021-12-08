package com.claim.apply.entity.enums;

/**
 * @author rui.chi
 * @version 1.0
 * @Description
 * @date 2021/12/8 13:36
 */
public enum StatusCode {

    OK(200, "请求成功"),
    /**
     * 验证token错误
     */
    VERIFY_TOKEN_ERROR(401, "token失效"),
    FAILURE(404, "失败"),
    /**
     * 系统错误
     */
    SYSTEM_ERROR(999, "系统错误"),

    // 40xxx 客户端不合法的请求
    INVALID_MODEL_FIELDS(40001, "字段校验非法"),

    /**
     * 参数类型非法，常见于SpringMVC中String无法找到对应的enum而抛出的异常
     */
    INVALID_PARAMS_CONVERSION(40002, "参数类型非法");


    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    private final int code;

    private final String message;

    StatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
