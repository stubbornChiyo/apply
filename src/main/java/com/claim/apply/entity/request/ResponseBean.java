package com.claim.apply.entity.request;

import com.claim.apply.entity.enums.StatusCode;
import lombok.Data;
import lombok.ToString;

/**
 * @author rui.chi
 * @version 1.0
 * @Description
 * @date 2021/12/8 13:32
 */
@ToString
@Data
public class ResponseBean<T>{
    private Integer code;

    private T data;

    private String message;

    private boolean success;

    private String requestId;

    public ResponseBean() {
    }

    public ResponseBean(boolean success) {
        this.success = success;
        if (this.success) {
            setCode(StatusCode.OK.getCode());
            setMessage(StatusCode.OK.getMessage());
        }
    }

    public ResponseBean(StatusCode statusCode) {
        this.success = (StatusCode.OK.getCode() == statusCode.getCode());
        this.code = statusCode.getCode();
        this.message = statusCode.getMessage();
    }

    public ResponseBean(StatusCode statusCode, String message) {
        this.success = (StatusCode.OK == statusCode);
        this.code = statusCode.getCode();
        this.message = message;
    }

    public ResponseBean(int statusCode, String message, boolean success) {
        this.success = success;
        this.code = statusCode;
        this.message = message;
    }

    public ResponseBean(T data) {
        this(true);
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
        if (this.success) {
            setCode(StatusCode.OK.getCode());
            setMessage(StatusCode.OK.getMessage());
        }
    }
}
