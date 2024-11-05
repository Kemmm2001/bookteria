package com.example.identity_service.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "familymember")
public class FamilyMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MemberID")
    private Integer MemberID;
    @Column(name = "ParentID")
    private Integer ParentID;
    @Column(name = "MarriageID")
    private Integer MarriageID;
    @Column(name = "MemberName", length = 255)
    private String MemberName;
    @Column(name = "NickName", length = 255)
    private String NickName;
    @Column(name = "HasNickName")
    private Boolean HasNickName;
    @Column(name = "BirthOrder")
    private Integer BirthOrder;
    @Column(name = "Origin")
    private String Origin;
    @Column(name = "NationalityID")
    private Integer NationalityID;
    @Column(name = "ReligionID")
    private Integer ReligionID;
    @Column(name = "Dob")
    private Date Dob;
    @Column(name = "LunarDob")
    private Date LunarDob;
    @Column(name = "BirthPlace")
    private String BirthPlace;
    @Column(name = "IsDead")
    private Integer IsDead;
    @Column(name = "Dod")
    private Date Dod;
    @Column(name = "PlaceOfDeath")
    private String PlaceOfDeath;
    @Column(name = "GraveSite")
    private String GraveSite;
    @Column(name = "Note")
    private String Note;
    @Column(name = "Generation")
    private Integer Generation;
    @Column(name = "BloodType", length = 3)
    private String BloodType;
    @Column(name = "Male")
    private Boolean Male;
    @Column(name = "CodeID", length = 20)
    private String CodeID;
    @Column(name = "Image")
    private String Image;
    @Column(name = "LunarDod")
    private Date LunarDod;
}
