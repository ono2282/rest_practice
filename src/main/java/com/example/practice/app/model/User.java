package com.example.practice.app.model;

import java.io.Serializable;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
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
    // getter/setter記載略
}