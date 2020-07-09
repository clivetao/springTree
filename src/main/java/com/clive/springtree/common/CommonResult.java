package com.clive.springtree.common;

import org.omg.CORBA.PUBLIC_MEMBER;

public class CommonResult<T> {
    private long code;
    private String message;
    private T data;
    public CommonResult() {
    }
    public CommonResult(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 返回成功
     * @param data
     * @param <T>
     * @return
     */
    public static <T>CommonResult<T> success(T data){
        return new CommonResult<>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),data);
    }

    public static <T>CommonResult<T> success(String message,T data){
        return new CommonResult<>(ResultCode.SUCCESS.getCode(),message,data);
    }

    /**
     * 请求失败
     * @param <T>
     * @return
     */

    public static <T>CommonResult<T> fail(){
        return new CommonResult<>(ResultCode.FAILED.getCode(),ResultCode.FAILED.getMessage(),null);
    }

    public static <T>CommonResult<T> fail(String message){
        return new CommonResult<>(ResultCode.FAILED.getCode(),message,null);
    }

    /**
     * 没有相关权限
     * @param <T>
     * @return
     */
    public static <T>CommonResult<T> unauthorized(){
        return new CommonResult<>(ResultCode.UNAUTHORIZED.getCode(),ResultCode.UNAUTHORIZED.getMessage(),null);
    }
    public static <T>CommonResult<T> unauthorized(String message){
        return new CommonResult<>(ResultCode.UNAUTHORIZED.getCode(),message,null);
    }


    /**
     * 参数验证失败
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> validate_fail(){
        return new CommonResult<>(ResultCode.VALIDATE_FAILED.getCode(),ResultCode.VALIDATE_FAILED.getMessage(),null);
    }

    public static <T> CommonResult<T> validate_fail(String message){
        return new CommonResult<>(ResultCode.VALIDATE_FAILED.getCode(),message,null);
    }


    /**
     * token已经过期
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> forbidden(){
        return new CommonResult<>(ResultCode.FORBIDDEN.getCode(),ResultCode.FORBIDDEN.getMessage(),null);
    }

    public static <T> CommonResult<T> forbidden(String message){
        return new CommonResult<>(ResultCode.FORBIDDEN.getCode(),message,null);
    }

}
