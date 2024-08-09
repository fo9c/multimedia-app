package cn.fo9c.multimedia_main.utils;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;

@Data
// Serializable接口用于序列化对象，使其能够在网络上传输
// <T>表示泛型方法,用于表示Result能处理任意类型的数据
public class ResponseResult<T> implements Serializable {
    static private final Integer SUCCESS = 200;
    static private final Integer ERROR = 500;

    // 自定义Result类，用于封装返回结果
    private Integer status;  // 程序完成状态编码  默认0成功，1和其它数字为失败
    private Object data;     // 封装的数据

    public static <T> ResponseResult<T> success() {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.status = SUCCESS;
        responseResult.data = new ArrayList<>();
        return responseResult;
    }

    public static <T> ResponseResult<T> success(Object Data) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.status = SUCCESS;
        responseResult.data = Data;
        return responseResult;
    }


    public static <T> ResponseResult<T> error() {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.status = ERROR;
        responseResult.data = new ArrayList<>();
        return responseResult;
    }

    public static <T> ResponseResult<T> error(String msg) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.status = ERROR;
        responseResult.data = new ArrayList<>();
        return responseResult;
    }

    public static <T> ResponseResult<T> error(String msg, Object Data) {
        ResponseResult<T> responseResult = new ResponseResult<>();
        responseResult.status = ERROR;
        responseResult.data = Data;
        return responseResult;
    }
}