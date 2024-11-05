package com.example.identity_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "familytree")
public class FamilyTree {
    @Id
    @Column(name = "CodeID", length = 20)
    private String CodeID;
    @Column(name = "TreeName", length = 30)
    private String TreeName;
    @Column(name = "Ethnicity", length = 45)
    private String Ethnicity;
    @Column(name = "DeathAnniversary")
    private Date DeathAnniversary;

    @Column(name = "MemberId")
    private Integer MemberId;
}
