package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class G8survey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;

    @Column("g8Q1")
    private String g8Q1;
    @Column("gps_loc")
    private String gps_loc;


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
     * @return String return the g8Q1
     */
    public String getG8Q1() {
        return g8Q1;
    }

    /**
     * @param g8Q1 the g8Q1 to set
     */
    public void setG8Q1(String g8Q1) {
        this.g8Q1 = g8Q1;
    }

    /**
     * @return String return the gps_loc
     */
    public String getGps_loc() {
        return gps_loc;
    }

    /**
     * @param gps_loc the gps_loc to set
     */
    public void setGps_loc(String gps_loc) {
        this.gps_loc = gps_loc;
    }

}
