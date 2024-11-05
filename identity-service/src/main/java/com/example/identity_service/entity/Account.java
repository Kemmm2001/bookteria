package com.example.identity_service.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "account")
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AccountID")
    private Integer AccountID;
    @Column(name = "Username", length = 100, nullable = true)
    private String Username;
    @Column(name = "Password", length = 100, nullable = true)
    private String Password;
    @Column(name = "Email", length = 150, nullable = true, unique = true)
    private String Email;
    @Column(name = "CodeID", length = 20)
    private String CodeID;
    @Column(name = "RoleID")
    private Integer RoleID;
    @Column(name = "FreeSMS")
    private Integer FreeSMS;
    @Column(name = "FreeEmail")
    private Integer FreeEmail;
    @Column(name = "TotalMoney", nullable = true)
    private Double TotalMoney;
    @Column(name = "IsActive")
    private Boolean IsActive;
}
