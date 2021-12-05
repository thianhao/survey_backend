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


    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid the userid to set
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return String return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return String return the bQ1
     */
    public String getBQ1() {
        return bQ1;
    }

    /**
     * @param bQ1 the bQ1 to set
     */
    public void setBQ1(String bQ1) {
        this.bQ1 = bQ1;
    }

    /**
     * @return String return the bQ2
     */
    public String getBQ2() {
        return bQ2;
    }

    /**
     * @param bQ2 the bQ2 to set
     */
    public void setBQ2(String bQ2) {
        this.bQ2 = bQ2;
    }

    /**
     * @return String return the bQ3
     */
    public String getBQ3() {
        return bQ3;
    }

    /**
     * @param bQ3 the bQ3 to set
     */
    public void setBQ3(String bQ3) {
        this.bQ3 = bQ3;
    }

    /**
     * @return String return the bQ4
     */
    public String getBQ4() {
        return bQ4;
    }

    /**
     * @param bQ4 the bQ4 to set
     */
    public void setBQ4(String bQ4) {
        this.bQ4 = bQ4;
    }

    /**
     * @return String return the bQ5
     */
    public String getBQ5() {
        return bQ5;
    }

    /**
     * @param bQ5 the bQ5 to set
     */
    public void setBQ5(String bQ5) {
        this.bQ5 = bQ5;
    }

    /**
     * @return String return the bQ6
     */
    public String getBQ6() {
        return bQ6;
    }

    /**
     * @param bQ6 the bQ6 to set
     */
    public void setBQ6(String bQ6) {
        this.bQ6 = bQ6;
    }

    /**
     * @return String return the bQ7
     */
    public String getBQ7() {
        return bQ7;
    }

    /**
     * @param bQ7 the bQ7 to set
     */
    public void setBQ7(String bQ7) {
        this.bQ7 = bQ7;
    }

    /**
     * @return String return the bQ8
     */
    public String getBQ8() {
        return bQ8;
    }

    /**
     * @param bQ8 the bQ8 to set
     */
    public void setBQ8(String bQ8) {
        this.bQ8 = bQ8;
    }

    /**
     * @return String return the bQ9
     */
    public String getBQ9() {
        return bQ9;
    }

    /**
     * @param bQ9 the bQ9 to set
     */
    public void setBQ9(String bQ9) {
        this.bQ9 = bQ9;
    }

    /**
     * @return String return the bQ10
     */
    public String getBQ10() {
        return bQ10;
    }

    /**
     * @param bQ10 the bQ10 to set
     */
    public void setBQ10(String bQ10) {
        this.bQ10 = bQ10;
    }

    /**
     * @return String return the bQ11
     */
    public String getBQ11() {
        return bQ11;
    }

    /**
     * @param bQ11 the bQ11 to set
     */
    public void setBQ11(String bQ11) {
        this.bQ11 = bQ11;
    }

    /**
     * @return String return the bQ12
     */
    public String getBQ12() {
        return bQ12;
    }

    /**
     * @param bQ12 the bQ12 to set
     */
    public void setBQ12(String bQ12) {
        this.bQ12 = bQ12;
    }

    /**
     * @return String return the bQ13
     */
    public String getBQ13() {
        return bQ13;
    }

    /**
     * @param bQ13 the bQ13 to set
     */
    public void setBQ13(String bQ13) {
        this.bQ13 = bQ13;
    }

    /**
     * @return String return the bQ14
     */
    public String getBQ14() {
        return bQ14;
    }

    /**
     * @param bQ14 the bQ14 to set
     */
    public void setBQ14(String bQ14) {
        this.bQ14 = bQ14;
    }

    /**
     * @return String return the bQ15
     */
    public String getBQ15() {
        return bQ15;
    }

    /**
     * @param bQ15 the bQ15 to set
     */
    public void setBQ15(String bQ15) {
        this.bQ15 = bQ15;
    }

    /**
     * @return String return the bQ16
     */
    public String getBQ16() {
        return bQ16;
    }

    /**
     * @param bQ16 the bQ16 to set
     */
    public void setBQ16(String bQ16) {
        this.bQ16 = bQ16;
    }

    /**
     * @return String return the bQ17
     */
    public String getBQ17() {
        return bQ17;
    }

    /**
     * @param bQ17 the bQ17 to set
     */
    public void setBQ17(String bQ17) {
        this.bQ17 = bQ17;
    }

    /**
     * @return String return the bQ18
     */
    public String getBQ18() {
        return bQ18;
    }

    /**
     * @param bQ18 the bQ18 to set
     */
    public void setBQ18(String bQ18) {
        this.bQ18 = bQ18;
    }

    /**
     * @return String return the bQ19
     */
    public String getBQ19() {
        return bQ19;
    }

    /**
     * @param bQ19 the bQ19 to set
     */
    public void setBQ19(String bQ19) {
        this.bQ19 = bQ19;
    }

    /**
     * @return String return the bQ20
     */
    public String getBQ20() {
        return bQ20;
    }

    /**
     * @param bQ20 the bQ20 to set
     */
    public void setBQ20(String bQ20) {
        this.bQ20 = bQ20;
    }

    /**
     * @return String return the bQ21
     */
    public String getBQ21() {
        return bQ21;
    }

    /**
     * @param bQ21 the bQ21 to set
     */
    public void setBQ21(String bQ21) {
        this.bQ21 = bQ21;
    }

    /**
     * @return String return the bQ22
     */
    public String getBQ22() {
        return bQ22;
    }

    /**
     * @param bQ22 the bQ22 to set
     */
    public void setBQ22(String bQ22) {
        this.bQ22 = bQ22;
    }

    /**
     * @return String return the bQ23
     */
    public String getBQ23() {
        return bQ23;
    }

    /**
     * @param bQ23 the bQ23 to set
     */
    public void setBQ23(String bQ23) {
        this.bQ23 = bQ23;
    }

    /**
     * @return String return the bQ24
     */
    public String getBQ24() {
        return bQ24;
    }

    /**
     * @param bQ24 the bQ24 to set
     */
    public void setBQ24(String bQ24) {
        this.bQ24 = bQ24;
    }

    /**
     * @return String return the bQ25
     */
    public String getBQ25() {
        return bQ25;
    }

    /**
     * @param bQ25 the bQ25 to set
     */
    public void setBQ25(String bQ25) {
        this.bQ25 = bQ25;
    }

    /**
     * @return String return the bQ26
     */
    public String getBQ26() {
        return bQ26;
    }

    /**
     * @param bQ26 the bQ26 to set
     */
    public void setBQ26(String bQ26) {
        this.bQ26 = bQ26;
    }

    /**
     * @return String return the bQ27
     */
    public String getBQ27() {
        return bQ27;
    }

    /**
     * @param bQ27 the bQ27 to set
     */
    public void setBQ27(String bQ27) {
        this.bQ27 = bQ27;
    }

    /**
     * @return String return the bQ28
     */
    public String getBQ28() {
        return bQ28;
    }

    /**
     * @param bQ28 the bQ28 to set
     */
    public void setBQ28(String bQ28) {
        this.bQ28 = bQ28;
    }

    /**
     * @return String return the bQ29
     */
    public String getBQ29() {
        return bQ29;
    }

    /**
     * @param bQ29 the bQ29 to set
     */
    public void setBQ29(String bQ29) {
        this.bQ29 = bQ29;
    }

    /**
     * @return String return the bQ30
     */
    public String getBQ30() {
        return bQ30;
    }

    /**
     * @param bQ30 the bQ30 to set
     */
    public void setBQ30(String bQ30) {
        this.bQ30 = bQ30;
    }

    /**
     * @return String return the bQ31
     */
    public String getBQ31() {
        return bQ31;
    }

    /**
     * @param bQ31 the bQ31 to set
     */
    public void setBQ31(String bQ31) {
        this.bQ31 = bQ31;
    }

    /**
     * @return String return the bQ32
     */
    public String getBQ32() {
        return bQ32;
    }

    /**
     * @param bQ32 the bQ32 to set
     */
    public void setBQ32(String bQ32) {
        this.bQ32 = bQ32;
    }

    /**
     * @return String return the bQ33
     */
    public String getBQ33() {
        return bQ33;
    }

    /**
     * @param bQ33 the bQ33 to set
     */
    public void setBQ33(String bQ33) {
        this.bQ33 = bQ33;
    }

    /**
     * @return String return the bQ34
     */
    public String getBQ34() {
        return bQ34;
    }

    /**
     * @param bQ34 the bQ34 to set
     */
    public void setBQ34(String bQ34) {
        this.bQ34 = bQ34;
    }

    /**
     * @return String return the bQ35
     */
    public String getBQ35() {
        return bQ35;
    }

    /**
     * @param bQ35 the bQ35 to set
     */
    public void setBQ35(String bQ35) {
        this.bQ35 = bQ35;
    }

    /**
     * @return String return the bQ36
     */
    public String getBQ36() {
        return bQ36;
    }

    /**
     * @param bQ36 the bQ36 to set
     */
    public void setBQ36(String bQ36) {
        this.bQ36 = bQ36;
    }

    /**
     * @return String return the bQ37
     */
    public String getBQ37() {
        return bQ37;
    }

    /**
     * @param bQ37 the bQ37 to set
     */
    public void setBQ37(String bQ37) {
        this.bQ37 = bQ37;
    }

    /**
     * @return String return the bQ38
     */
    public String getBQ38() {
        return bQ38;
    }

    /**
     * @param bQ38 the bQ38 to set
     */
    public void setBQ38(String bQ38) {
        this.bQ38 = bQ38;
    }

    /**
     * @return String return the bQ39
     */
    public String getBQ39() {
        return bQ39;
    }

    /**
     * @param bQ39 the bQ39 to set
     */
    public void setBQ39(String bQ39) {
        this.bQ39 = bQ39;
    }

    /**
     * @return String return the bQ40
     */
    public String getBQ40() {
        return bQ40;
    }

    /**
     * @param bQ40 the bQ40 to set
     */
    public void setBQ40(String bQ40) {
        this.bQ40 = bQ40;
    }

    /**
     * @return String return the bQ41
     */
    public String getBQ41() {
        return bQ41;
    }

    /**
     * @param bQ41 the bQ41 to set
     */
    public void setBQ41(String bQ41) {
        this.bQ41 = bQ41;
    }

    /**
     * @return String return the bQ42
     */
    public String getBQ42() {
        return bQ42;
    }

    /**
     * @param bQ42 the bQ42 to set
     */
    public void setBQ42(String bQ42) {
        this.bQ42 = bQ42;
    }

    /**
     * @return String return the bQ43
     */
    public String getBQ43() {
        return bQ43;
    }

    /**
     * @param bQ43 the bQ43 to set
     */
    public void setBQ43(String bQ43) {
        this.bQ43 = bQ43;
    }

    /**
     * @return String return the bQ44
     */
    public String getBQ44() {
        return bQ44;
    }

    /**
     * @param bQ44 the bQ44 to set
     */
    public void setBQ44(String bQ44) {
        this.bQ44 = bQ44;
    }

    /**
     * @return String return the bQ45
     */
    public String getBQ45() {
        return bQ45;
    }

    /**
     * @param bQ45 the bQ45 to set
     */
    public void setBQ45(String bQ45) {
        this.bQ45 = bQ45;
    }

    /**
     * @return String return the bQ46
     */
    public String getBQ46() {
        return bQ46;
    }

    /**
     * @param bQ46 the bQ46 to set
     */
    public void setBQ46(String bQ46) {
        this.bQ46 = bQ46;
    }

    /**
     * @return String return the bQ47
     */
    public String getBQ47() {
        return bQ47;
    }

    /**
     * @param bQ47 the bQ47 to set
     */
    public void setBQ47(String bQ47) {
        this.bQ47 = bQ47;
    }

    /**
     * @return String return the bQ48
     */
    public String getBQ48() {
        return bQ48;
    }

    /**
     * @param bQ48 the bQ48 to set
     */
    public void setBQ48(String bQ48) {
        this.bQ48 = bQ48;
    }

    /**
     * @return String return the bQ49
     */
    public String getBQ49() {
        return bQ49;
    }

    /**
     * @param bQ49 the bQ49 to set
     */
    public void setBQ49(String bQ49) {
        this.bQ49 = bQ49;
    }

    /**
     * @return String return the bQ50
     */
    public String getBQ50() {
        return bQ50;
    }

    /**
     * @param bQ50 the bQ50 to set
     */
    public void setBQ50(String bQ50) {
        this.bQ50 = bQ50;
    }

    /**
     * @return String return the bQ51
     */
    public String getBQ51() {
        return bQ51;
    }

    /**
     * @param bQ51 the bQ51 to set
     */
    public void setBQ51(String bQ51) {
        this.bQ51 = bQ51;
    }

    /**
     * @return String return the bQ52
     */
    public String getBQ52() {
        return bQ52;
    }

    /**
     * @param bQ52 the bQ52 to set
     */
    public void setBQ52(String bQ52) {
        this.bQ52 = bQ52;
    }

    /**
     * @return String return the bQ53
     */
    public String getBQ53() {
        return bQ53;
    }

    /**
     * @param bQ53 the bQ53 to set
     */
    public void setBQ53(String bQ53) {
        this.bQ53 = bQ53;
    }

}
