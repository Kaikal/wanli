package com.ynu.wanli.core.dto;

/**
 * 模块名称：
 * 模块类型：
 * 编码人：刘彬
 * 生成时间：2023/3/6
 * 联系电话：
 * */

import lombok.Data;

import java.io.Serializable;

/**
 * 模块名称：用于接收分页查询参数
 * 模块类型：
 * 编码人：高靖博
 * 创建时间：2023/3/1
 * 联系电话：18587388612
 */
@Data
public class MyPageBand implements Serializable {

    private int page;
    private int size;

}
