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

    

}
