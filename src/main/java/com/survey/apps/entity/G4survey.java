package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class G4survey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("g4Q1")
    private String g4Q1;
    @Column("g4Q2")
    private String g4Q2;
    @Column("g4Q3")
    private String g4Q3;
    @Column("g4Q4")
    private String g4Q4;
    @Column("g4Q5")
    private String g4Q5;
    @Column("g4Q6")
    private String g4Q6;
    @Column("g4Q7")
    private String g4Q7;
    @Column("g4Q8")
    private String g4Q8;
    @Column("g4Q9")
    private String g4Q9;
    @Column("g4Q10")
    private String g4Q10;


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
     * @return String return the g4Q1
     */
    public String getG4Q1() {
        return g4Q1;
    }

    /**
     * @param g4Q1 the g4Q1 to set
     */
    public void setG4Q1(String g4Q1) {
        this.g4Q1 = g4Q1;
    }

    /**
     * @return String return the g4Q2
     */
    public String getG4Q2() {
        return g4Q2;
    }

    /**
     * @param g4Q2 the g4Q2 to set
     */
    public void setG4Q2(String g4Q2) {
        this.g4Q2 = g4Q2;
    }

    /**
     * @return String return the g4Q3
     */
    public String getG4Q3() {
        return g4Q3;
    }

    /**
     * @param g4Q3 the g4Q3 to set
     */
    public void setG4Q3(String g4Q3) {
        this.g4Q3 = g4Q3;
    }

    /**
     * @return String return the g4Q4
     */
    public String getG4Q4() {
        return g4Q4;
    }

    /**
     * @param g4Q4 the g4Q4 to set
     */
    public void setG4Q4(String g4Q4) {
        this.g4Q4 = g4Q4;
    }

    /**
     * @return String return the g4Q5
     */
    public String getG4Q5() {
        return g4Q5;
    }

    /**
     * @param g4Q5 the g4Q5 to set
     */
    public void setG4Q5(String g4Q5) {
        this.g4Q5 = g4Q5;
    }

    /**
     * @return String return the g4Q6
     */
    public String getG4Q6() {
        return g4Q6;
    }

    /**
     * @param g4Q6 the g4Q6 to set
     */
    public void setG4Q6(String g4Q6) {
        this.g4Q6 = g4Q6;
    }

    /**
     * @return String return the g4Q7
     */
    public String getG4Q7() {
        return g4Q7;
    }

    /**
     * @param g4Q7 the g4Q7 to set
     */
    public void setG4Q7(String g4Q7) {
        this.g4Q7 = g4Q7;
    }

    /**
     * @return String return the g4Q8
     */
    public String getG4Q8() {
        return g4Q8;
    }

    /**
     * @param g4Q8 the g4Q8 to set
     */
    public void setG4Q8(String g4Q8) {
        this.g4Q8 = g4Q8;
    }

    /**
     * @return String return the g4Q9
     */
    public String getG4Q9() {
        return g4Q9;
    }

    /**
     * @param g4Q9 the g4Q9 to set
     */
    public void setG4Q9(String g4Q9) {
        this.g4Q9 = g4Q9;
    }

    /**
     * @return String return the g4Q10
     */
    public String getG4Q10() {
        return g4Q10;
    }

    /**
     * @param g4Q10 the g4Q10 to set
     */
    public void setG4Q10(String g4Q10) {
        this.g4Q10 = g4Q10;
    }

}
