package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class G5survey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("g5Q1")
    private String g5Q1;
    @Column("g5Q2")
    private String g5Q2;
    @Column("g5Q3")
    private String g5Q3;
    @Column("g5Q4")
    private String g5Q4;
    @Column("g5Q5")
    private String g5Q5;
    @Column("g5Q6")
    private String g5Q6;
    @Column("g5Q7")
    private String g5Q7;
    @Column("g5Q8")
    private String g5Q8;
    @Column("g5Q9")
    private String g5Q9;
    @Column("g5Q10")
    private String g5Q10;

}
