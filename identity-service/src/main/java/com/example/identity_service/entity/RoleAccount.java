package com.example.identity_service.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "roleaccount")
public class RoleAccount implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RoleID")
    private Integer RoleID;
    @Column(name = "RoleName", length = 50)
    private String RoleName;
}

