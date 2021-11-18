package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class G2survey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("g2Q1")
    private String g2Q1;
    @Column("g2Q2")
    private String g2Q2;
    @Column("g2Q3")
    private String g2Q3;
    @Column("g2Q4")
    private String g2Q4;
    @Column("g2Q5")
    private String g2Q5;
    @Column("g2Q6")
    private String g2Q6;
    @Column("g2Q7")
    private String g2Q7;
    @Column("g2Q8")
    private String g2Q8;
    @Column("g2Q9")
    private String g2Q9;
    @Column("g2Q10")
    private String g2Q10;

}
