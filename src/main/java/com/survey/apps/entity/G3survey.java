package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class G3survey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("g3Q1")
    private String g3Q1;
    @Column("g3Q2")
    private String g3Q2;
    @Column("g3Q3")
    private String g3Q3;
    @Column("g3Q4")
    private String g3Q4;
    @Column("g3Q5")
    private String g3Q5;
    @Column("g3Q6")
    private String g3Q6;
    @Column("g3Q7")
    private String g3Q7;
    @Column("g3Q8")
    private String g3Q8;
    @Column("g3Q9")
    private String g3Q9;
    @Column("g3Q10")
    private String g3Q10;

}
