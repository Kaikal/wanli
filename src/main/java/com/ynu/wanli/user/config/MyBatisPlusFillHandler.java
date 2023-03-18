package com.ynu.wanli.user.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyBatisPlusFillHandler implements MetaObjectHandler {

    //当触发新增填充策略时会调用的方法
    @Override
    public void insertFill(MetaObject metaObject) {
        //要给表中的insertTime字段设置一个当前系统时间
        setFieldValByName("insertTime",new Date(),metaObject);

    }

    //当触发修改填充策略时会调用的方法
    @Override
    public void updateFill(MetaObject metaObject) {
        //要给表中的insertTime字段设置一个当前系统时间
        setFieldValByName("updateTime",new Date(),metaObject);
    }
}