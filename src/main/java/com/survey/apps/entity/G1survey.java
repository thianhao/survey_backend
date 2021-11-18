package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class G1survey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("g1Q1")
    private String g1Q1;
    @Column("g1Q2")
    private String g1Q2;
    @Column("g1Q3")
    private String g1Q3;
    @Column("g1Q4")
    private String g1Q4;
    @Column("g1Q5")
    private String g1Q5;
    @Column("g1Q6")
    private String g1Q6;
    @Column("g1Q7")
    private String g1Q7;
    @Column("g1Q8")
    private String g1Q8;
    @Column("g1Q9")
    private String g1Q9;
    @Column("g1Q10")
    private String g1Q10;

    @Column("g1Q11")
    private String g1Q11;

}
