package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class G6survey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("g6Q1")
    private String g6Q1;
    @Column("g6Q2")
    private String g6Q2;
    @Column("g6Q3")
    private String g6Q3;
    @Column("g6Q4")
    private String g6Q4;
    @Column("g6Q5")
    private String g6Q5;
    @Column("g6Q6")
    private String g6Q6;
    @Column("g6Q7")
    private String g6Q7;
    @Column("g6Q8")
    private String g6Q8;
    @Column("g6Q9")
    private String g6Q9;
    @Column("g6Q10")
    private String g6Q10;

}
