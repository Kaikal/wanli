/**
 * @Copyright: 华为昆明数字经济学院-JAVA课程-高靖博 @Copy  All rights reserved.
 */
package com.ynu.wanli.user.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer userMessId;
    private String userId;
    private String userMessStateIcon;
    private String userMessState;
    private String userTitle;
    private String userText;
}