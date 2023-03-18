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
import java.util.List;

/**
 * 模块名称：接收分页的结果DTO
 * 模块类型：
 * 编码人：高靖博
 * 创建时间：2023/3/1
 * 联系电话：18587388612
 */
@Data
public class MyPager<T> implements Serializable {

    private int page;//结果的页码
    private int pageSize;//每页显示行数
    private List<T> rows;//分页当前页的结果集
    private long total;//不分页所有数据总和（用于页码生成）

}
