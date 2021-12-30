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

}
