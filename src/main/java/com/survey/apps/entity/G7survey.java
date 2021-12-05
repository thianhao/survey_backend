package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class G7survey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("g7Q1")
    private String g7Q1;
    @Column("g7Q2")
    private String g7Q2;
    @Column("g7Q3")
    private String g7Q3;
    @Column("g7Q4")
    private String g7Q4;
    @Column("g7Q5")
    private String g7Q5;
    @Column("g7Q6")
    private String g7Q6;
    @Column("g7Q7")
    private String g7Q7;
    @Column("g7Q8")
    private String g7Q8;
    @Column("g7Q9")
    private String g7Q9;
    @Column("g7Q10")
    private String g7Q10;


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
     * @return String return the g7Q1
     */
    public String getG7Q1() {
        return g7Q1;
    }

    /**
     * @param g7Q1 the g7Q1 to set
     */
    public void setG7Q1(String g7Q1) {
        this.g7Q1 = g7Q1;
    }

    /**
     * @return String return the g7Q2
     */
    public String getG7Q2() {
        return g7Q2;
    }

    /**
     * @param g7Q2 the g7Q2 to set
     */
    public void setG7Q2(String g7Q2) {
        this.g7Q2 = g7Q2;
    }

    /**
     * @return String return the g7Q3
     */
    public String getG7Q3() {
        return g7Q3;
    }

    /**
     * @param g7Q3 the g7Q3 to set
     */
    public void setG7Q3(String g7Q3) {
        this.g7Q3 = g7Q3;
    }

    /**
     * @return String return the g7Q4
     */
    public String getG7Q4() {
        return g7Q4;
    }

    /**
     * @param g7Q4 the g7Q4 to set
     */
    public void setG7Q4(String g7Q4) {
        this.g7Q4 = g7Q4;
    }

    /**
     * @return String return the g7Q5
     */
    public String getG7Q5() {
        return g7Q5;
    }

    /**
     * @param g7Q5 the g7Q5 to set
     */
    public void setG7Q5(String g7Q5) {
        this.g7Q5 = g7Q5;
    }

    /**
     * @return String return the g7Q6
     */
    public String getG7Q6() {
        return g7Q6;
    }

    /**
     * @param g7Q6 the g7Q6 to set
     */
    public void setG7Q6(String g7Q6) {
        this.g7Q6 = g7Q6;
    }

    /**
     * @return String return the g7Q7
     */
    public String getG7Q7() {
        return g7Q7;
    }

    /**
     * @param g7Q7 the g7Q7 to set
     */
    public void setG7Q7(String g7Q7) {
        this.g7Q7 = g7Q7;
    }

    /**
     * @return String return the g7Q8
     */
    public String getG7Q8() {
        return g7Q8;
    }

    /**
     * @param g7Q8 the g7Q8 to set
     */
    public void setG7Q8(String g7Q8) {
        this.g7Q8 = g7Q8;
    }

    /**
     * @return String return the g7Q9
     */
    public String getG7Q9() {
        return g7Q9;
    }

    /**
     * @param g7Q9 the g7Q9 to set
     */
    public void setG7Q9(String g7Q9) {
        this.g7Q9 = g7Q9;
    }

    /**
     * @return String return the g7Q10
     */
    public String getG7Q10() {
        return g7Q10;
    }

    /**
     * @param g7Q10 the g7Q10 to set
     */
    public void setG7Q10(String g7Q10) {
        this.g7Q10 = g7Q10;
    }

}
