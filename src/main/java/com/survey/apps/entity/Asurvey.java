package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class Asurvey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;
    @Column("aq1")
    private String aq1;
    @Column("aq2")
    private String aq2;
    @Column("aq3")
    private String aq3;
    @Column("aq4")
    private String aq4;
    @Column("aq5")
    private String aq5;
    @Column("aq6")
    private String aq6;
    @Column("aq7")
    private String aq7;
    @Column("aq8")
    private String aq8;
    @Column("aq9")
    private String aq9;
    @Column("aq10")
    private String aq10;
    @Column("aq11")
    private String aq11;
    @Column("aq12")
    private String aq12;
    @Column("aq13")
    private String aq13;
    @Column("aq14")
    private String aq14;
    @Column("aq15")
    private String aq15;
    @Column("aq16")
    private String aq16;

    public Asurvey(String userid, String time, String aq1, String aq2, String aq3, String aq4, String aq5,
                   String aq6, String aq7, String aq8, String aq9, String aq10, String aq11, String aq12,
                   String aq13, String aq14, String aq15, String aq16) {
        this.userid = userid;
        this.time = time;
        this.aq1 = aq1;
        this.aq2 = aq2;
        this.aq3 = aq3;
        this.aq4 = aq4;
        this.aq5 = aq5;
        this.aq6 = aq6;
        this.aq7 = aq7;
        this.aq8 = aq8;
        this.aq9 = aq9;
        this.aq10 = aq10;
        this.aq11 = aq11;
        this.aq12 = aq12;
        this.aq13 = aq13;
        this.aq14 = aq14;
        this.aq15 = aq15;
        this.aq16 = aq16;
    }
}
