package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class Fsurvey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("fQ1")
    private String fQ1;
    @Column("fQ2")
    private String fQ2;
    @Column("fQ3")
    private String fQ3;
    @Column("fQ4")
    private String fQ4;
    @Column("fQ5")
    private String fQ5;
    @Column("fQ6")
    private String fQ6;
    @Column("fQ7")
    private String fQ7;
    @Column("fQ8")
    private String fQ8;
    @Column("fQ9")
    private String fQ9;
    @Column("fQ10")
    private String fQ10;

    @Column("fQ11")
    private String fQ11;
    @Column("fQ12")
    private String fQ12;
    @Column("fQ13")
    private String fQ13;
    @Column("fQ14")
    private String fQ14;
    @Column("fQ15")
    private String fQ15;
    @Column("fQ16")
    private String fQ16;
    @Column("fQ17")
    private String fQ17;
    @Column("fQ18")
    private String fQ18;
    @Column("fQ19")
    private String fQ19;
    @Column("fQ20")
    private String fQ20;

    @Column("fQ21")
    private String fQ21;

}
