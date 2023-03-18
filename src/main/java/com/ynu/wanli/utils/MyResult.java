package com.ynu.wanli.utils;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import java.io.Serializable;


@Data
public class MyResult implements Serializable {
    private String code = "200";//默认是操作成功
    private String msg = "操作成功！";
    private Object data;//结果对象
    //对象——》json字符串——》工具方法
    public String toJsonString(){
        return JSON.toJSONString(this);
    }
    //json字符串——》对象-工具方法
    public MyResult toMyResultFromJsonString(String jsonStr){
        return (MyResult) JSON.parse(jsonStr);
    }
}
