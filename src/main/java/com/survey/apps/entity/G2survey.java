package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class G2survey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("g2Q1")
    private String g2Q1;
    @Column("g2Q2")
    private String g2Q2;
    @Column("g2Q3")
    private String g2Q3;
    @Column("g2Q4")
    private String g2Q4;
    @Column("g2Q5")
    private String g2Q5;
    @Column("g2Q6")
    private String g2Q6;
    @Column("g2Q7")
    private String g2Q7;
    @Column("g2Q8")
    private String g2Q8;
    @Column("g2Q9")
    private String g2Q9;
    @Column("g2Q10")
    private String g2Q10;


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
     * @return String return the g2Q1
     */
    public String getG2Q1() {
        return g2Q1;
    }

    /**
     * @param g2Q1 the g2Q1 to set
     */
    public void setG2Q1(String g2Q1) {
        this.g2Q1 = g2Q1;
    }

    /**
     * @return String return the g2Q2
     */
    public String getG2Q2() {
        return g2Q2;
    }

    /**
     * @param g2Q2 the g2Q2 to set
     */
    public void setG2Q2(String g2Q2) {
        this.g2Q2 = g2Q2;
    }

    /**
     * @return String return the g2Q3
     */
    public String getG2Q3() {
        return g2Q3;
    }

    /**
     * @param g2Q3 the g2Q3 to set
     */
    public void setG2Q3(String g2Q3) {
        this.g2Q3 = g2Q3;
    }

    /**
     * @return String return the g2Q4
     */
    public String getG2Q4() {
        return g2Q4;
    }

    /**
     * @param g2Q4 the g2Q4 to set
     */
    public void setG2Q4(String g2Q4) {
        this.g2Q4 = g2Q4;
    }

    /**
     * @return String return the g2Q5
     */
    public String getG2Q5() {
        return g2Q5;
    }

    /**
     * @param g2Q5 the g2Q5 to set
     */
    public void setG2Q5(String g2Q5) {
        this.g2Q5 = g2Q5;
    }

    /**
     * @return String return the g2Q6
     */
    public String getG2Q6() {
        return g2Q6;
    }

    /**
     * @param g2Q6 the g2Q6 to set
     */
    public void setG2Q6(String g2Q6) {
        this.g2Q6 = g2Q6;
    }

    /**
     * @return String return the g2Q7
     */
    public String getG2Q7() {
        return g2Q7;
    }

    /**
     * @param g2Q7 the g2Q7 to set
     */
    public void setG2Q7(String g2Q7) {
        this.g2Q7 = g2Q7;
    }

    /**
     * @return String return the g2Q8
     */
    public String getG2Q8() {
        return g2Q8;
    }

    /**
     * @param g2Q8 the g2Q8 to set
     */
    public void setG2Q8(String g2Q8) {
        this.g2Q8 = g2Q8;
    }

    /**
     * @return String return the g2Q9
     */
    public String getG2Q9() {
        return g2Q9;
    }

    /**
     * @param g2Q9 the g2Q9 to set
     */
    public void setG2Q9(String g2Q9) {
        this.g2Q9 = g2Q9;
    }

    /**
     * @return String return the g2Q10
     */
    public String getG2Q10() {
        return g2Q10;
    }

    /**
     * @param g2Q10 the g2Q10 to set
     */
    public void setG2Q10(String g2Q10) {
        this.g2Q10 = g2Q10;
    }

}
