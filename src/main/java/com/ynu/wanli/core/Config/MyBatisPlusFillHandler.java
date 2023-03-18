//package com.ynu.wanli.core.Config;
//import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
//import org.apache.ibatis.logging.stdout.StdOutImpl;
//import org.apache.ibatis.reflection.MetaObject;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDateTime;
//import java.util.Date;
//
///**
// * 模块名称：
// * 模块类型：
// * 编码人：刘彬
// * 生成时间：2023/3/7
// * 联系电话：
// * */
//@Component
//public class MyBatisPlusFillHandler implements MetaObjectHandler {
//    @Override
//    public void insertFill(MetaObject metaObject) {
//        this.strictInsertFill(metaObject,"createTime",LocalDateTime.class,LocalDateTime.now());
//        this.strictInsertFill(metaObject,"updateTime",LocalDateTime.class,LocalDateTime.now());
//    }
//
//    @Override
//    public void updateFill(MetaObject metaObject) {
//
//        this.strictUpdateFill(metaObject,"updateTime",LocalDateTime.class,LocalDateTime.now());
//    }
//}
