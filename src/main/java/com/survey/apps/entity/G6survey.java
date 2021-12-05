package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class G6survey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("g6Q1")
    private String g6Q1;
    @Column("g6Q2")
    private String g6Q2;
    @Column("g6Q3")
    private String g6Q3;
    @Column("g6Q4")
    private String g6Q4;
    @Column("g6Q5")
    private String g6Q5;
    @Column("g6Q6")
    private String g6Q6;
    @Column("g6Q7")
    private String g6Q7;
    @Column("g6Q8")
    private String g6Q8;
    @Column("g6Q9")
    private String g6Q9;
    @Column("g6Q10")
    private String g6Q10;


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
     * @return String return the g6Q1
     */
    public String getG6Q1() {
        return g6Q1;
    }

    /**
     * @param g6Q1 the g6Q1 to set
     */
    public void setG6Q1(String g6Q1) {
        this.g6Q1 = g6Q1;
    }

    /**
     * @return String return the g6Q2
     */
    public String getG6Q2() {
        return g6Q2;
    }

    /**
     * @param g6Q2 the g6Q2 to set
     */
    public void setG6Q2(String g6Q2) {
        this.g6Q2 = g6Q2;
    }

    /**
     * @return String return the g6Q3
     */
    public String getG6Q3() {
        return g6Q3;
    }

    /**
     * @param g6Q3 the g6Q3 to set
     */
    public void setG6Q3(String g6Q3) {
        this.g6Q3 = g6Q3;
    }

    /**
     * @return String return the g6Q4
     */
    public String getG6Q4() {
        return g6Q4;
    }

    /**
     * @param g6Q4 the g6Q4 to set
     */
    public void setG6Q4(String g6Q4) {
        this.g6Q4 = g6Q4;
    }

    /**
     * @return String return the g6Q5
     */
    public String getG6Q5() {
        return g6Q5;
    }

    /**
     * @param g6Q5 the g6Q5 to set
     */
    public void setG6Q5(String g6Q5) {
        this.g6Q5 = g6Q5;
    }

    /**
     * @return String return the g6Q6
     */
    public String getG6Q6() {
        return g6Q6;
    }

    /**
     * @param g6Q6 the g6Q6 to set
     */
    public void setG6Q6(String g6Q6) {
        this.g6Q6 = g6Q6;
    }

    /**
     * @return String return the g6Q7
     */
    public String getG6Q7() {
        return g6Q7;
    }

    /**
     * @param g6Q7 the g6Q7 to set
     */
    public void setG6Q7(String g6Q7) {
        this.g6Q7 = g6Q7;
    }

    /**
     * @return String return the g6Q8
     */
    public String getG6Q8() {
        return g6Q8;
    }

    /**
     * @param g6Q8 the g6Q8 to set
     */
    public void setG6Q8(String g6Q8) {
        this.g6Q8 = g6Q8;
    }

    /**
     * @return String return the g6Q9
     */
    public String getG6Q9() {
        return g6Q9;
    }

    /**
     * @param g6Q9 the g6Q9 to set
     */
    public void setG6Q9(String g6Q9) {
        this.g6Q9 = g6Q9;
    }

    /**
     * @return String return the g6Q10
     */
    public String getG6Q10() {
        return g6Q10;
    }

    /**
     * @param g6Q10 the g6Q10 to set
     */
    public void setG6Q10(String g6Q10) {
        this.g6Q10 = g6Q10;
    }

}
