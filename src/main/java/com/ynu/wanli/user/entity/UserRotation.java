/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy  All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.util.Date;
import java.io.Serializable;

import lombok.Data;

@Data
public class UserRotation implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer rotationID;
    private String rotationLocation;
    private String rotationUrl;
    private String rotationState;
    private Date rotationCreateTime;
    private Date rotationUpdateTime;
}