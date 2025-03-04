package com.jeongjiho.fapp.naverbirthday;

public class NaverbirthdayDto {

	private String seq;
	private String dateType;
	private String date;
	private String solarlunar;
	private Integer addContact_seq;
	private Integer is_primary;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getDateType() {
		return dateType;
	}
	public void setDateType(String dateType) {
		this.dateType = dateType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSolarlunar() {
		return solarlunar;
	}
	public void setSolarlunar(String solarlunar) {
		this.solarlunar = solarlunar;
	}
	public Integer getAddContact_seq() {
		return addContact_seq;
	}
	public void setAddContact_seq(Integer addContact_seq) {
		this.addContact_seq = addContact_seq;
	}
	public Integer getIs_primary() {
		return is_primary;
	}
	public void setIs_primary(Integer is_primary) {
		this.is_primary = is_primary;
	}
	
}
