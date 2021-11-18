package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class Esurvey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("eQ1")
    private String eQ1;
    @Column("eQ2")
    private String eQ2;
    @Column("eQ3")
    private String eQ3;
    @Column("eQ4")
    private String eQ4;
    @Column("eQ5")
    private String eQ5;
    @Column("eQ6")
    private String eQ6;
    @Column("eQ7")
    private String eQ7;
    @Column("eQ8")
    private String eQ8;
    @Column("eQ9")
    private String eQ9;
    @Column("eQ10")
    private String eQ10;

    @Column("eQ11")
    private String eQ11;
    @Column("eQ12")
    private String eQ12;
    @Column("eQ13")
    private String eQ13;
    @Column("eQ14")
    private String eQ14;
    @Column("eQ15")
    private String eQ15;
    @Column("eQ16")
    private String eQ16;
    @Column("eQ17")
    private String eQ17;
    @Column("eQ18")
    private String eQ18;
    @Column("eQ19")
    private String eQ19;
    @Column("eQ20")
    private String eQ20;

    @Column("eQ21")
    private String eQ21;
    @Column("eQ22")
    private String eQ22;
    @Column("eQ23")
    private String eQ23;
    @Column("eQ24")
    private String eQ24;
    @Column("eQ25")
    private String eQ25;
    @Column("eQ26")
    private String eQ26;
    @Column("eQ27")
    private String eQ27;
    @Column("eQ28")
    private String eQ28;
    @Column("eQ29")
    private String eQ29;
    @Column("eQ30")
    private String eQ30;

    @Column("eQ31")
    private String eQ31;
    @Column("eQ32")
    private String eQ32;
    @Column("eQ33")
    private String eQ33;
    @Column("eQ34")
    private String eQ34;
    @Column("eQ35")
    private String eQ35;

}
