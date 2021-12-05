package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class G3survey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("g3Q1")
    private String g3Q1;
    @Column("g3Q2")
    private String g3Q2;
    @Column("g3Q3")
    private String g3Q3;
    @Column("g3Q4")
    private String g3Q4;
    @Column("g3Q5")
    private String g3Q5;
    @Column("g3Q6")
    private String g3Q6;
    @Column("g3Q7")
    private String g3Q7;
    @Column("g3Q8")
    private String g3Q8;
    @Column("g3Q9")
    private String g3Q9;
    @Column("g3Q10")
    private String g3Q10;


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
     * @return String return the g3Q1
     */
    public String getG3Q1() {
        return g3Q1;
    }

    /**
     * @param g3Q1 the g3Q1 to set
     */
    public void setG3Q1(String g3Q1) {
        this.g3Q1 = g3Q1;
    }

    /**
     * @return String return the g3Q2
     */
    public String getG3Q2() {
        return g3Q2;
    }

    /**
     * @param g3Q2 the g3Q2 to set
     */
    public void setG3Q2(String g3Q2) {
        this.g3Q2 = g3Q2;
    }

    /**
     * @return String return the g3Q3
     */
    public String getG3Q3() {
        return g3Q3;
    }

    /**
     * @param g3Q3 the g3Q3 to set
     */
    public void setG3Q3(String g3Q3) {
        this.g3Q3 = g3Q3;
    }

    /**
     * @return String return the g3Q4
     */
    public String getG3Q4() {
        return g3Q4;
    }

    /**
     * @param g3Q4 the g3Q4 to set
     */
    public void setG3Q4(String g3Q4) {
        this.g3Q4 = g3Q4;
    }

    /**
     * @return String return the g3Q5
     */
    public String getG3Q5() {
        return g3Q5;
    }

    /**
     * @param g3Q5 the g3Q5 to set
     */
    public void setG3Q5(String g3Q5) {
        this.g3Q5 = g3Q5;
    }

    /**
     * @return String return the g3Q6
     */
    public String getG3Q6() {
        return g3Q6;
    }

    /**
     * @param g3Q6 the g3Q6 to set
     */
    public void setG3Q6(String g3Q6) {
        this.g3Q6 = g3Q6;
    }

    /**
     * @return String return the g3Q7
     */
    public String getG3Q7() {
        return g3Q7;
    }

    /**
     * @param g3Q7 the g3Q7 to set
     */
    public void setG3Q7(String g3Q7) {
        this.g3Q7 = g3Q7;
    }

    /**
     * @return String return the g3Q8
     */
    public String getG3Q8() {
        return g3Q8;
    }

    /**
     * @param g3Q8 the g3Q8 to set
     */
    public void setG3Q8(String g3Q8) {
        this.g3Q8 = g3Q8;
    }

    /**
     * @return String return the g3Q9
     */
    public String getG3Q9() {
        return g3Q9;
    }

    /**
     * @param g3Q9 the g3Q9 to set
     */
    public void setG3Q9(String g3Q9) {
        this.g3Q9 = g3Q9;
    }

    /**
     * @return String return the g3Q10
     */
    public String getG3Q10() {
        return g3Q10;
    }

    /**
     * @param g3Q10 the g3Q10 to set
     */
    public void setG3Q10(String g3Q10) {
        this.g3Q10 = g3Q10;
    }

}
