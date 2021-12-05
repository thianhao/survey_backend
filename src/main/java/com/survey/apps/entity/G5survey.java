package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class G5survey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("g5Q1")
    private String g5Q1;
    @Column("g5Q2")
    private String g5Q2;
    @Column("g5Q3")
    private String g5Q3;
    @Column("g5Q4")
    private String g5Q4;
    @Column("g5Q5")
    private String g5Q5;
    @Column("g5Q6")
    private String g5Q6;
    @Column("g5Q7")
    private String g5Q7;
    @Column("g5Q8")
    private String g5Q8;
    @Column("g5Q9")
    private String g5Q9;
    @Column("g5Q10")
    private String g5Q10;


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
     * @return String return the g5Q1
     */
    public String getG5Q1() {
        return g5Q1;
    }

    /**
     * @param g5Q1 the g5Q1 to set
     */
    public void setG5Q1(String g5Q1) {
        this.g5Q1 = g5Q1;
    }

    /**
     * @return String return the g5Q2
     */
    public String getG5Q2() {
        return g5Q2;
    }

    /**
     * @param g5Q2 the g5Q2 to set
     */
    public void setG5Q2(String g5Q2) {
        this.g5Q2 = g5Q2;
    }

    /**
     * @return String return the g5Q3
     */
    public String getG5Q3() {
        return g5Q3;
    }

    /**
     * @param g5Q3 the g5Q3 to set
     */
    public void setG5Q3(String g5Q3) {
        this.g5Q3 = g5Q3;
    }

    /**
     * @return String return the g5Q4
     */
    public String getG5Q4() {
        return g5Q4;
    }

    /**
     * @param g5Q4 the g5Q4 to set
     */
    public void setG5Q4(String g5Q4) {
        this.g5Q4 = g5Q4;
    }

    /**
     * @return String return the g5Q5
     */
    public String getG5Q5() {
        return g5Q5;
    }

    /**
     * @param g5Q5 the g5Q5 to set
     */
    public void setG5Q5(String g5Q5) {
        this.g5Q5 = g5Q5;
    }

    /**
     * @return String return the g5Q6
     */
    public String getG5Q6() {
        return g5Q6;
    }

    /**
     * @param g5Q6 the g5Q6 to set
     */
    public void setG5Q6(String g5Q6) {
        this.g5Q6 = g5Q6;
    }

    /**
     * @return String return the g5Q7
     */
    public String getG5Q7() {
        return g5Q7;
    }

    /**
     * @param g5Q7 the g5Q7 to set
     */
    public void setG5Q7(String g5Q7) {
        this.g5Q7 = g5Q7;
    }

    /**
     * @return String return the g5Q8
     */
    public String getG5Q8() {
        return g5Q8;
    }

    /**
     * @param g5Q8 the g5Q8 to set
     */
    public void setG5Q8(String g5Q8) {
        this.g5Q8 = g5Q8;
    }

    /**
     * @return String return the g5Q9
     */
    public String getG5Q9() {
        return g5Q9;
    }

    /**
     * @param g5Q9 the g5Q9 to set
     */
    public void setG5Q9(String g5Q9) {
        this.g5Q9 = g5Q9;
    }

    /**
     * @return String return the g5Q10
     */
    public String getG5Q10() {
        return g5Q10;
    }

    /**
     * @param g5Q10 the g5Q10 to set
     */
    public void setG5Q10(String g5Q10) {
        this.g5Q10 = g5Q10;
    }

}
