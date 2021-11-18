package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class Bsurvey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("bQ1")
    private String bQ1;
    @Column("bQ2")
    private String bQ2;
    @Column("bQ3")
    private String bQ3;
    @Column("bQ4")
    private String bQ4;
    @Column("bQ5")
    private String bQ5;
    @Column("bQ6")
    private String bQ6;
    @Column("bQ7")
    private String bQ7;
    @Column("bQ8")
    private String bQ8;
    @Column("bQ9")
    private String bQ9;
    @Column("bQ10")
    private String bQ10;

    @Column("bQ11")
    private String bQ11;
    @Column("bQ12")
    private String bQ12;
    @Column("bQ13")
    private String bQ13;
    @Column("bQ14")
    private String bQ14;
    @Column("bQ15")
    private String bQ15;
    @Column("bQ16")
    private String bQ16;
    @Column("bQ17")
    private String bQ17;
    @Column("bQ18")
    private String bQ18;
    @Column("bQ19")
    private String bQ19;
    @Column("bQ20")
    private String bQ20;

    @Column("bQ21")
    private String bQ21;
    @Column("bQ22")
    private String bQ22;
    @Column("bQ23")
    private String bQ23;
    @Column("bQ24")
    private String bQ24;
    @Column("bQ25")
    private String bQ25;
    @Column("bQ26")
    private String bQ26;
    @Column("bQ27")
    private String bQ27;
    @Column("bQ28")
    private String bQ28;
    @Column("bQ29")
    private String bQ29;
    @Column("bQ30")
    private String bQ30;

    @Column("bQ31")
    private String bQ31;
    @Column("bQ32")
    private String bQ32;
    @Column("bQ33")
    private String bQ33;
    @Column("bQ34")
    private String bQ34;
    @Column("bQ35")
    private String bQ35;
    @Column("bQ36")
    private String bQ36;
    @Column("bQ37")
    private String bQ37;
    @Column("bQ38")
    private String bQ38;
    @Column("bQ39")
    private String bQ39;
    @Column("bQ40")
    private String bQ40;

    @Column("bQ41")
    private String bQ41;
    @Column("bQ42")
    private String bQ42;
    @Column("bQ43")
    private String bQ43;
    @Column("bQ44")
    private String bQ44;
    @Column("bQ45")
    private String bQ45;
    @Column("bQ46")
    private String bQ46;
    @Column("bQ47")
    private String bQ47;
    @Column("bQ48")
    private String bQ48;
    @Column("bQ49")
    private String bQ49;
    @Column("bQ50")
    private String bQ50;

    @Column("bQ51")
    private String bQ51;
    @Column("bQ52")
    private String bQ52;
    @Column("bQ53")
    private String bQ53;

}
