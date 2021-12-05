package com.survey.apps.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

@Data
@ToString
public class Asurvey {

    @Id
    private int id;
    @Column("userid")
    private String userid;
    @Column("time")
    private String time;
    @Column("aq1")
    private String aq1;
    @Column("aq2")
    private String aq2;
    @Column("aq3")
    private String aq3;
    @Column("aq4")
    private String aq4;
    @Column("aq5")
    private String aq5;
    @Column("aq6")
    private String aq6;
    @Column("aq7")
    private String aq7;
    @Column("aq8")
    private String aq8;
    @Column("aq9")
    private String aq9;
    @Column("aq10")
    private String aq10;
    @Column("aq11")
    private String aq11;
    @Column("aq12")
    private String aq12;
    @Column("aq13")
    private String aq13;
    @Column("aq14")
    private String aq14;
    @Column("aq15")
    private String aq15;
    @Column("aq16")
    private String aq16;

    public Asurvey(String userid, String time, String aq1, String aq2, String aq3, String aq4, String aq5,
                   String aq6, String aq7, String aq8, String aq9, String aq10, String aq11, String aq12,
                   String aq13, String aq14, String aq15, String aq16) {
        this.userid = userid;
        this.time = time;
        this.aq1 = aq1;
        this.aq2 = aq2;
        this.aq3 = aq3;
        this.aq4 = aq4;
        this.aq5 = aq5;
        this.aq6 = aq6;
        this.aq7 = aq7;
        this.aq8 = aq8;
        this.aq9 = aq9;
        this.aq10 = aq10;
        this.aq11 = aq11;
        this.aq12 = aq12;
        this.aq13 = aq13;
        this.aq14 = aq14;
        this.aq15 = aq15;
        this.aq16 = aq16;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAq1() {
		return aq1;
	}

	public void setAq1(String aq1) {
		this.aq1 = aq1;
	}

	public String getAq2() {
		return aq2;
	}

	public void setAq2(String aq2) {
		this.aq2 = aq2;
	}

	public String getAq3() {
		return aq3;
	}

	public void setAq3(String aq3) {
		this.aq3 = aq3;
	}

	public String getAq4() {
		return aq4;
	}

	public void setAq4(String aq4) {
		this.aq4 = aq4;
	}

	public String getAq5() {
		return aq5;
	}

	public void setAq5(String aq5) {
		this.aq5 = aq5;
	}

	public String getAq6() {
		return aq6;
	}

	public void setAq6(String aq6) {
		this.aq6 = aq6;
	}

	public String getAq7() {
		return aq7;
	}

	public void setAq7(String aq7) {
		this.aq7 = aq7;
	}

	public String getAq8() {
		return aq8;
	}

	public void setAq8(String aq8) {
		this.aq8 = aq8;
	}

	public String getAq9() {
		return aq9;
	}

	public void setAq9(String aq9) {
		this.aq9 = aq9;
	}

	public String getAq10() {
		return aq10;
	}

	public void setAq10(String aq10) {
		this.aq10 = aq10;
	}

	public String getAq11() {
		return aq11;
	}

	public void setAq11(String aq11) {
		this.aq11 = aq11;
	}

	public String getAq12() {
		return aq12;
	}

	public void setAq12(String aq12) {
		this.aq12 = aq12;
	}

	public String getAq13() {
		return aq13;
	}

	public void setAq13(String aq13) {
		this.aq13 = aq13;
	}

	public String getAq14() {
		return aq14;
	}

	public void setAq14(String aq14) {
		this.aq14 = aq14;
	}

	public String getAq15() {
		return aq15;
	}

	public void setAq15(String aq15) {
		this.aq15 = aq15;
	}

	public String getAq16() {
		return aq16;
	}

	public void setAq16(String aq16) {
		this.aq16 = aq16;
	}


}
