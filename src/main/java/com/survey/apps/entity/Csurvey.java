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
     * @return String return the cQ1
     */
    public String getCQ1() {
        return cQ1;
    }

    /**
     * @param cQ1 the cQ1 to set
     */
    public void setCQ1(String cQ1) {
        this.cQ1 = cQ1;
    }

    /**
     * @return String return the cQ2
     */
    public String getCQ2() {
        return cQ2;
    }

    /**
     * @param cQ2 the cQ2 to set
     */
    public void setCQ2(String cQ2) {
        this.cQ2 = cQ2;
    }

    /**
     * @return String return the cQ3
     */
    public String getCQ3() {
        return cQ3;
    }

    /**
     * @param cQ3 the cQ3 to set
     */
    public void setCQ3(String cQ3) {
        this.cQ3 = cQ3;
    }

    /**
     * @return String return the cQ4
     */
    public String getCQ4() {
        return cQ4;
    }

    /**
     * @param cQ4 the cQ4 to set
     */
    public void setCQ4(String cQ4) {
        this.cQ4 = cQ4;
    }

    /**
     * @return String return the cQ5
     */
    public String getCQ5() {
        return cQ5;
    }

    /**
     * @param cQ5 the cQ5 to set
     */
    public void setCQ5(String cQ5) {
        this.cQ5 = cQ5;
    }

    /**
     * @return String return the cQ6
     */
    public String getCQ6() {
        return cQ6;
    }

    /**
     * @param cQ6 the cQ6 to set
     */
    public void setCQ6(String cQ6) {
        this.cQ6 = cQ6;
    }

    /**
     * @return String return the cQ7
     */
    public String getCQ7() {
        return cQ7;
    }

    /**
     * @param cQ7 the cQ7 to set
     */
    public void setCQ7(String cQ7) {
        this.cQ7 = cQ7;
    }

    /**
     * @return String return the cQ8
     */
    public String getCQ8() {
        return cQ8;
    }

    /**
     * @param cQ8 the cQ8 to set
     */
    public void setCQ8(String cQ8) {
        this.cQ8 = cQ8;
    }

    /**
     * @return String return the cQ9
     */
    public String getCQ9() {
        return cQ9;
    }

    /**
     * @param cQ9 the cQ9 to set
     */
    public void setCQ9(String cQ9) {
        this.cQ9 = cQ9;
    }

    /**
     * @return String return the cQ10
     */
    public String getCQ10() {
        return cQ10;
    }

    /**
     * @param cQ10 the cQ10 to set
     */
    public void setCQ10(String cQ10) {
        this.cQ10 = cQ10;
    }

    /**
     * @return String return the cQ11
     */
    public String getCQ11() {
        return cQ11;
    }

    /**
     * @param cQ11 the cQ11 to set
     */
    public void setCQ11(String cQ11) {
        this.cQ11 = cQ11;
    }

    /**
     * @return String return the cQ12
     */
    public String getCQ12() {
        return cQ12;
    }

    /**
     * @param cQ12 the cQ12 to set
     */
    public void setCQ12(String cQ12) {
        this.cQ12 = cQ12;
    }

    /**
     * @return String return the cQ13
     */
    public String getCQ13() {
        return cQ13;
    }

    /**
     * @param cQ13 the cQ13 to set
     */
    public void setCQ13(String cQ13) {
        this.cQ13 = cQ13;
    }

    /**
     * @return String return the cQ14
     */
    public String getCQ14() {
        return cQ14;
    }

    /**
     * @param cQ14 the cQ14 to set
     */
    public void setCQ14(String cQ14) {
        this.cQ14 = cQ14;
    }

    /**
     * @return String return the cQ15
     */
    public String getCQ15() {
        return cQ15;
    }

    /**
     * @param cQ15 the cQ15 to set
     */
    public void setCQ15(String cQ15) {
        this.cQ15 = cQ15;
    }

    /**
     * @return String return the cQ16
     */
    public String getCQ16() {
        return cQ16;
    }

    /**
     * @param cQ16 the cQ16 to set
     */
    public void setCQ16(String cQ16) {
        this.cQ16 = cQ16;
    }

    /**
     * @return String return the cQ17
     */
    public String getCQ17() {
        return cQ17;
    }

    /**
     * @param cQ17 the cQ17 to set
     */
    public void setCQ17(String cQ17) {
        this.cQ17 = cQ17;
    }

    /**
     * @return String return the cQ18
     */
    public String getCQ18() {
        return cQ18;
    }

    /**
     * @param cQ18 the cQ18 to set
     */
    public void setCQ18(String cQ18) {
        this.cQ18 = cQ18;
    }

    /**
     * @return String return the cQ19
     */
    public String getCQ19() {
        return cQ19;
    }

    /**
     * @param cQ19 the cQ19 to set
     */
    public void setCQ19(String cQ19) {
        this.cQ19 = cQ19;
    }

    /**
     * @return String return the cQ20
     */
    public String getCQ20() {
        return cQ20;
    }

    /**
     * @param cQ20 the cQ20 to set
     */
    public void setCQ20(String cQ20) {
        this.cQ20 = cQ20;
    }

    /**
     * @return String return the cQ21
     */
    public String getCQ21() {
        return cQ21;
    }

    /**
     * @param cQ21 the cQ21 to set
     */
    public void setCQ21(String cQ21) {
        this.cQ21 = cQ21;
    }

    /**
     * @return String return the cQ22
     */
    public String getCQ22() {
        return cQ22;
    }

    /**
     * @param cQ22 the cQ22 to set
     */
    public void setCQ22(String cQ22) {
        this.cQ22 = cQ22;
    }

    /**
     * @return String return the cQ23
     */
    public String getCQ23() {
        return cQ23;
    }

    /**
     * @param cQ23 the cQ23 to set
     */
    public void setCQ23(String cQ23) {
        this.cQ23 = cQ23;
    }

    /**
     * @return String return the cQ24
     */
    public String getCQ24() {
        return cQ24;
    }

    /**
     * @param cQ24 the cQ24 to set
     */
    public void setCQ24(String cQ24) {
        this.cQ24 = cQ24;
    }

    /**
     * @return String return the cQ25
     */
    public String getCQ25() {
        return cQ25;
    }

    /**
     * @param cQ25 the cQ25 to set
     */
    public void setCQ25(String cQ25) {
        this.cQ25 = cQ25;
    }

    /**
     * @return String return the cQ26
     */
    public String getCQ26() {
        return cQ26;
    }

    /**
     * @param cQ26 the cQ26 to set
     */
    public void setCQ26(String cQ26) {
        this.cQ26 = cQ26;
    }

    /**
     * @return String return the cQ27
     */
    public String getCQ27() {
        return cQ27;
    }

    /**
     * @param cQ27 the cQ27 to set
     */
    public void setCQ27(String cQ27) {
        this.cQ27 = cQ27;
    }

    /**
     * @return String return the cQ28
     */
    public String getCQ28() {
        return cQ28;
    }

    /**
     * @param cQ28 the cQ28 to set
     */
    public void setCQ28(String cQ28) {
        this.cQ28 = cQ28;
    }

    /**
     * @return String return the cQ29
     */
    public String getCQ29() {
        return cQ29;
    }

    /**
     * @param cQ29 the cQ29 to set
     */
    public void setCQ29(String cQ29) {
        this.cQ29 = cQ29;
    }

    /**
     * @return String return the cQ30
     */
    public String getCQ30() {
        return cQ30;
    }

    /**
     * @param cQ30 the cQ30 to set
     */
    public void setCQ30(String cQ30) {
        this.cQ30 = cQ30;
    }

    /**
     * @return String return the cQ31
     */
    public String getCQ31() {
        return cQ31;
    }

    /**
     * @param cQ31 the cQ31 to set
     */
    public void setCQ31(String cQ31) {
        this.cQ31 = cQ31;
    }

    /**
     * @return String return the cQ32
     */
    public String getCQ32() {
        return cQ32;
    }

    /**
     * @param cQ32 the cQ32 to set
     */
    public void setCQ32(String cQ32) {
        this.cQ32 = cQ32;
    }

    /**
     * @return String return the cQ33
     */
    public String getCQ33() {
        return cQ33;
    }

    /**
     * @param cQ33 the cQ33 to set
     */
    public void setCQ33(String cQ33) {
        this.cQ33 = cQ33;
    }

    /**
     * @return String return the cQ34
     */
    public String getCQ34() {
        return cQ34;
    }

    /**
     * @param cQ34 the cQ34 to set
     */
    public void setCQ34(String cQ34) {
        this.cQ34 = cQ34;
    }

    /**
     * @return String return the cQ35
     */
    public String getCQ35() {
        return cQ35;
    }

    /**
     * @param cQ35 the cQ35 to set
     */
    public void setCQ35(String cQ35) {
        this.cQ35 = cQ35;
    }

    /**
     * @return String return the cQ36
     */
    public String getCQ36() {
        return cQ36;
    }

    /**
     * @param cQ36 the cQ36 to set
     */
    public void setCQ36(String cQ36) {
        this.cQ36 = cQ36;
    }

    /**
     * @return String return the cQ37
     */
    public String getCQ37() {
        return cQ37;
    }

    /**
     * @param cQ37 the cQ37 to set
     */
    public void setCQ37(String cQ37) {
        this.cQ37 = cQ37;
    }

    /**
     * @return String return the cQ38
     */
    public String getCQ38() {
        return cQ38;
    }

    /**
     * @param cQ38 the cQ38 to set
     */
    public void setCQ38(String cQ38) {
        this.cQ38 = cQ38;
    }

    /**
     * @return String return the cQ39
     */
    public String getCQ39() {
        return cQ39;
    }

    /**
     * @param cQ39 the cQ39 to set
     */
    public void setCQ39(String cQ39) {
        this.cQ39 = cQ39;
    }

    /**
     * @return String return the cQ40
     */
    public String getCQ40() {
        return cQ40;
    }

    /**
     * @param cQ40 the cQ40 to set
     */
    public void setCQ40(String cQ40) {
        this.cQ40 = cQ40;
    }

    /**
     * @return String return the cQ41
     */
    public String getCQ41() {
        return cQ41;
    }

    /**
     * @param cQ41 the cQ41 to set
     */
    public void setCQ41(String cQ41) {
        this.cQ41 = cQ41;
    }

    /**
     * @return String return the cQ42
     */
    public String getCQ42() {
        return cQ42;
    }

    /**
     * @param cQ42 the cQ42 to set
     */
    public void setCQ42(String cQ42) {
        this.cQ42 = cQ42;
    }

    /**
     * @return String return the cQ43
     */
    public String getCQ43() {
        return cQ43;
    }

    /**
     * @param cQ43 the cQ43 to set
     */
    public void setCQ43(String cQ43) {
        this.cQ43 = cQ43;
    }

    /**
     * @return String return the cQ44
     */
    public String getCQ44() {
        return cQ44;
    }

    /**
     * @param cQ44 the cQ44 to set
     */
    public void setCQ44(String cQ44) {
        this.cQ44 = cQ44;
    }

    /**
     * @return String return the cQ45
     */
    public String getCQ45() {
        return cQ45;
    }

    /**
     * @param cQ45 the cQ45 to set
     */
    public void setCQ45(String cQ45) {
        this.cQ45 = cQ45;
    }

    /**
     * @return String return the cQ46
     */
    public String getCQ46() {
        return cQ46;
    }

    /**
     * @param cQ46 the cQ46 to set
     */
    public void setCQ46(String cQ46) {
        this.cQ46 = cQ46;
    }

    /**
     * @return String return the cQ47
     */
    public String getCQ47() {
        return cQ47;
    }

    /**
     * @param cQ47 the cQ47 to set
     */
    public void setCQ47(String cQ47) {
        this.cQ47 = cQ47;
    }

    /**
     * @return String return the cQ48
     */
    public String getCQ48() {
        return cQ48;
    }

    /**
     * @param cQ48 the cQ48 to set
     */
    public void setCQ48(String cQ48) {
        this.cQ48 = cQ48;
    }

    /**
     * @return String return the cQ49
     */
    public String getCQ49() {
        return cQ49;
    }

    /**
     * @param cQ49 the cQ49 to set
     */
    public void setCQ49(String cQ49) {
        this.cQ49 = cQ49;
    }

    /**
     * @return String return the cQ50
     */
    public String getCQ50() {
        return cQ50;
    }

    /**
     * @param cQ50 the cQ50 to set
     */
    public void setCQ50(String cQ50) {
        this.cQ50 = cQ50;
    }

    /**
     * @return String return the cQ51
     */
    public String getCQ51() {
        return cQ51;
    }

    /**
     * @param cQ51 the cQ51 to set
     */
    public void setCQ51(String cQ51) {
        this.cQ51 = cQ51;
    }

    /**
     * @return String return the cQ52
     */
    public String getCQ52() {
        return cQ52;
    }

    /**
     * @param cQ52 the cQ52 to set
     */
    public void setCQ52(String cQ52) {
        this.cQ52 = cQ52;
    }

    /**
     * @return String return the cQ53
     */
    public String getCQ53() {
        return cQ53;
    }

    /**
     * @param cQ53 the cQ53 to set
     */
    public void setCQ53(String cQ53) {
        this.cQ53 = cQ53;
    }

    /**
     * @return String return the cQ54
     */
    public String getCQ54() {
        return cQ54;
    }

    /**
     * @param cQ54 the cQ54 to set
     */
    public void setCQ54(String cQ54) {
        this.cQ54 = cQ54;
    }

    /**
     * @return String return the cQ55
     */
    public String getCQ55() {
        return cQ55;
    }

    /**
     * @param cQ55 the cQ55 to set
     */
    public void setCQ55(String cQ55) {
        this.cQ55 = cQ55;
    }

    /**
     * @return String return the cQ56
     */
    public String getCQ56() {
        return cQ56;
    }

    /**
     * @param cQ56 the cQ56 to set
     */
    public void setCQ56(String cQ56) {
        this.cQ56 = cQ56;
    }

    /**
     * @return String return the cQ57
     */
    public String getCQ57() {
        return cQ57;
    }

    /**
     * @param cQ57 the cQ57 to set
     */
    public void setCQ57(String cQ57) {
        this.cQ57 = cQ57;
    }

    /**
     * @return String return the cQ58
     */
    public String getCQ58() {
        return cQ58;
    }

    /**
     * @param cQ58 the cQ58 to set
     */
    public void setCQ58(String cQ58) {
        this.cQ58 = cQ58;
    }

    /**
     * @return String return the cQ59
     */
    public String getCQ59() {
        return cQ59;
    }

    /**
     * @param cQ59 the cQ59 to set
     */
    public void setCQ59(String cQ59) {
        this.cQ59 = cQ59;
    }

    /**
     * @return String return the cQ60
     */
    public String getCQ60() {
        return cQ60;
    }

    /**
     * @param cQ60 the cQ60 to set
     */
    public void setCQ60(String cQ60) {
        this.cQ60 = cQ60;
    }

}
