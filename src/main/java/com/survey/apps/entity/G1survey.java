package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class G1survey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("g1Q1")
    private String g1Q1;
    @Column("g1Q2")
    private String g1Q2;
    @Column("g1Q3")
    private String g1Q3;
    @Column("g1Q4")
    private String g1Q4;
    @Column("g1Q5")
    private String g1Q5;
    @Column("g1Q6")
    private String g1Q6;
    @Column("g1Q7")
    private String g1Q7;
    @Column("g1Q8")
    private String g1Q8;
    @Column("g1Q9")
    private String g1Q9;
    @Column("g1Q10")
    private String g1Q10;

    @Column("g1Q11")
    private String g1Q11;


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
     * @return String return the g1Q1
     */
    public String getG1Q1() {
        return g1Q1;
    }

    /**
     * @param g1Q1 the g1Q1 to set
     */
    public void setG1Q1(String g1Q1) {
        this.g1Q1 = g1Q1;
    }

    /**
     * @return String return the g1Q2
     */
    public String getG1Q2() {
        return g1Q2;
    }

    /**
     * @param g1Q2 the g1Q2 to set
     */
    public void setG1Q2(String g1Q2) {
        this.g1Q2 = g1Q2;
    }

    /**
     * @return String return the g1Q3
     */
    public String getG1Q3() {
        return g1Q3;
    }

    /**
     * @param g1Q3 the g1Q3 to set
     */
    public void setG1Q3(String g1Q3) {
        this.g1Q3 = g1Q3;
    }

    /**
     * @return String return the g1Q4
     */
    public String getG1Q4() {
        return g1Q4;
    }

    /**
     * @param g1Q4 the g1Q4 to set
     */
    public void setG1Q4(String g1Q4) {
        this.g1Q4 = g1Q4;
    }

    /**
     * @return String return the g1Q5
     */
    public String getG1Q5() {
        return g1Q5;
    }

    /**
     * @param g1Q5 the g1Q5 to set
     */
    public void setG1Q5(String g1Q5) {
        this.g1Q5 = g1Q5;
    }

    /**
     * @return String return the g1Q6
     */
    public String getG1Q6() {
        return g1Q6;
    }

    /**
     * @param g1Q6 the g1Q6 to set
     */
    public void setG1Q6(String g1Q6) {
        this.g1Q6 = g1Q6;
    }

    /**
     * @return String return the g1Q7
     */
    public String getG1Q7() {
        return g1Q7;
    }

    /**
     * @param g1Q7 the g1Q7 to set
     */
    public void setG1Q7(String g1Q7) {
        this.g1Q7 = g1Q7;
    }

    /**
     * @return String return the g1Q8
     */
    public String getG1Q8() {
        return g1Q8;
    }

    /**
     * @param g1Q8 the g1Q8 to set
     */
    public void setG1Q8(String g1Q8) {
        this.g1Q8 = g1Q8;
    }

    /**
     * @return String return the g1Q9
     */
    public String getG1Q9() {
        return g1Q9;
    }

    /**
     * @param g1Q9 the g1Q9 to set
     */
    public void setG1Q9(String g1Q9) {
        this.g1Q9 = g1Q9;
    }

    /**
     * @return String return the g1Q10
     */
    public String getG1Q10() {
        return g1Q10;
    }

    /**
     * @param g1Q10 the g1Q10 to set
     */
    public void setG1Q10(String g1Q10) {
        this.g1Q10 = g1Q10;
    }

    /**
     * @return String return the g1Q11
     */
    public String getG1Q11() {
        return g1Q11;
    }

    /**
     * @param g1Q11 the g1Q11 to set
     */
    public void setG1Q11(String g1Q11) {
        this.g1Q11 = g1Q11;
    }

}
