package com.looop.ncis.S01D0603.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "M_OPERATOR_MANAGE")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "LOGIN_PASSWORD")
    private String loginPassword;

    @Column(name = "PASSWORD_SETTING_DATE")
    private LocalDateTime passwordSettingDate;

    @Column(name = "GROUP_ID")
    private Long groupId;

    @Column(name = "ACCOUNT_ID")
    private String accountId;

    @Column(name = "LAST_LOGIN_DATE_TIME")
    private LocalDateTime lastLoginDateTime;

    @Column(name = "LOGIN_ERROR_COUNT")
    private Integer loginErrorCount;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "REGISTER_DATE_TIME")
    private LocalDateTime registerDateTime;

    @Column(name = "REGISTER_USER")
    private String registerUser;

    @Column(name = "UPDATE_DATE_TIME")
    private LocalDateTime updateDateTime;

    @Column(name = "UPDATE_USER")
    private String updateUser;

}