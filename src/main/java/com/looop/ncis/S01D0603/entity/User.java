package com.looop.ncis.S01D0603.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "M_OPERATOR_MANAGE")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", length = 256, nullable = false)
    private String userId;

    @Column(name = "login_password", nullable = false)
    private String loginPassword;

    @Column(name = "password_setting_date", length = 100)
    private String passwordSettingDate;

    @Column(name = "group_id", length = 100)
    private String groupId;

    @Column(name = "account_id")
    private String accountId;

    @Column(name = "last_login_date_time")
    private LocalDateTime lastLoginDateTime;

    @Column(name = "login_error_count")
    private Integer loginErrorCount;

    @Column(name = "status", length = 100)
    private String status;

    @Column(name = "user_name", length = 102)
    private String userName;

    @Column(name = "register_date_time", updatable = false)
    private LocalDateTime registerDateTime;

    @Column(name = "register_user", updatable = false)
    private String registerUser;

    @Column(name = "update_date_time")
    private LocalDateTime updateDateTime;

    @Column(name = "update_user")
    private String updateUser;

}