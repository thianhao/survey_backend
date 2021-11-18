package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class G7survey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("g7Q1")
    private String g7Q1;
    @Column("g7Q2")
    private String g7Q2;
    @Column("g7Q3")
    private String g7Q3;
    @Column("g7Q4")
    private String g7Q4;
    @Column("g7Q5")
    private String g7Q5;
    @Column("g7Q6")
    private String g7Q6;
    @Column("g7Q7")
    private String g7Q7;
    @Column("g7Q8")
    private String g7Q8;
    @Column("g7Q9")
    private String g7Q9;
    @Column("g7Q10")
    private String g7Q10;

}
