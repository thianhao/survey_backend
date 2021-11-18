package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class Dsurvey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("dQ1")
    private String dQ1;
    @Column("dQ2")
    private String dQ2;
    @Column("dQ3")
    private String dQ3;
    @Column("dQ4")
    private String dQ4;
    @Column("dQ5")
    private String dQ5;
    @Column("dQ6")
    private String dQ6;
    @Column("dQ7")
    private String dQ7;
    @Column("dQ8")
    private String dQ8;
    @Column("dQ9")
    private String dQ9;
    @Column("dQ10")
    private String dQ10;

    @Column("dQ11")
    private String dQ11;
    @Column("dQ12")
    private String dQ12;
    @Column("dQ13")
    private String dQ13;
    @Column("dQ14")
    private String dQ14;
    @Column("dQ15")
    private String dQ15;
    @Column("dQ16")
    private String dQ16;

}
