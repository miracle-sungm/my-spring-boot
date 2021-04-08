package com.miracle.springframework.boot.common;

/**
 * @author : sungm
 * @date : 2021-03-16 15:19
 */
public class ResultDTO {

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultDTO() {
    }

    private ResultDTO(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResultDTO of() {
        return new ResultDTO();
    }

    public static ResultDTO of(String code) {
        return new ResultDTO(code, null);
    }

    public static ResultDTO of(String code, String message) {
        return new ResultDTO(code, message);
    }

    @Override
    public String toString() {
        return "ResultDTO{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
