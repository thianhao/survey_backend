package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class Csurvey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("cQ1")
    private String cQ1;
    @Column("cQ2")
    private String cQ2;
    @Column("cQ3")
    private String cQ3;
    @Column("cQ4")
    private String cQ4;
    @Column("cQ5")
    private String cQ5;
    @Column("cQ6")
    private String cQ6;
    @Column("cQ7")
    private String cQ7;
    @Column("cQ8")
    private String cQ8;
    @Column("cQ9")
    private String cQ9;
    @Column("cQ10")
    private String cQ10;

    @Column("cQ11")
    private String cQ11;
    @Column("cQ12")
    private String cQ12;
    @Column("cQ13")
    private String cQ13;
    @Column("cQ14")
    private String cQ14;
    @Column("cQ15")
    private String cQ15;
    @Column("cQ16")
    private String cQ16;
    @Column("cQ17")
    private String cQ17;
    @Column("cQ18")
    private String cQ18;
    @Column("cQ19")
    private String cQ19;
    @Column("cQ20")
    private String cQ20;

    @Column("cQ21")
    private String cQ21;
    @Column("cQ22")
    private String cQ22;
    @Column("cQ23")
    private String cQ23;
    @Column("cQ24")
    private String cQ24;
    @Column("cQ25")
    private String cQ25;
    @Column("cQ26")
    private String cQ26;
    @Column("cQ27")
    private String cQ27;
    @Column("cQ28")
    private String cQ28;
    @Column("cQ29")
    private String cQ29;
    @Column("cQ30")
    private String cQ30;

    @Column("cQ31")
    private String cQ31;
    @Column("cQ32")
    private String cQ32;
    @Column("cQ33")
    private String cQ33;
    @Column("cQ34")
    private String cQ34;
    @Column("cQ35")
    private String cQ35;
    @Column("cQ36")
    private String cQ36;
    @Column("cQ37")
    private String cQ37;
    @Column("cQ38")
    private String cQ38;
    @Column("cQ39")
    private String cQ39;
    @Column("cQ40")
    private String cQ40;

    @Column("cQ41")
    private String cQ41;
    @Column("cQ42")
    private String cQ42;
    @Column("cQ43")
    private String cQ43;
    @Column("cQ44")
    private String cQ44;
    @Column("cQ45")
    private String cQ45;
    @Column("cQ46")
    private String cQ46;
    @Column("cQ47")
    private String cQ47;
    @Column("cQ48")
    private String cQ48;
    @Column("cQ49")
    private String cQ49;
    @Column("cQ50")
    private String cQ50;

    @Column("cQ51")
    private String cQ51;
    @Column("cQ52")
    private String cQ52;
    @Column("cQ53")
    private String cQ53;
    @Column("cQ54")
    private String cQ54;
    @Column("cQ55")
    private String cQ55;
    @Column("cQ56")
    private String cQ56;
    @Column("cQ57")
    private String cQ57;
    @Column("cQ58")
    private String cQ58;
    @Column("cQ59")
    private String cQ59;
    @Column("cQ60")
    private String cQ60;

}
