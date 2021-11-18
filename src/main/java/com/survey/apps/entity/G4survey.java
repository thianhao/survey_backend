package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class G4survey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("g4Q1")
    private String g4Q1;
    @Column("g4Q2")
    private String g4Q2;
    @Column("g4Q3")
    private String g4Q3;
    @Column("g4Q4")
    private String g4Q4;
    @Column("g4Q5")
    private String g4Q5;
    @Column("g4Q6")
    private String g4Q6;
    @Column("g4Q7")
    private String g4Q7;
    @Column("g4Q8")
    private String g4Q8;
    @Column("g4Q9")
    private String g4Q9;
    @Column("g4Q10")
    private String g4Q10;

}
