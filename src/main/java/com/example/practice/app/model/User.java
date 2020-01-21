package com.example.practice.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
// 未使用
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ユーザID */
    private String userId;

    /** ユーザ名称 */
    private String userName;

    /** パスワード */
    private String password;

    /** email */
    private String email;

    private Date createTime;
}