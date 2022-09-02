package com.fan.mall.util.common;

import java.io.Serializable;

public class RespResult<T>  implements Serializable {

        //响应数据结果集
        private T data;

    /**
     * 状态码
     * 20000操作成功
     * 50000操作失败
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String message;

    public RespResult() {
    }

    public RespResult(RespCode respCode) {
        this.code = respCode.getCode();
        this.message = respCode.getMessage();
    }

    public RespResult(T data,RespCode respCode){
        this.data = data;
        this.code = respCode.getCode();
        this.message = respCode.getMessage();
    }

    /**
     * 自定义异常
     * @param code
     * @param message
     * @return
     */
    public static RespResult secByError(Integer code,String message){
        RespResult err = new RespResult();
        err.setCode(code);
        err.setMessage(message);

        return err;
    }


    public static RespResult ok(){
        return new RespResult(RespCode.SUCCESS);
    }

    public static RespResult ok(Object data){
        return new RespResult(null, RespCode.SUCCESS);
    }

    public static RespResult error(){
        return new RespResult(RespCode.ERROR);
    }

    public static RespResult error(String message){
        return secByError(RespCode.ERROR.getCode(), message);
    }

    public static RespResult error(RespCode respCode){
        return  new RespResult(respCode);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
