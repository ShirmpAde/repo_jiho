package com.jeongjiho.fapp.naverphone;

public class NaverphoneDto {

	private String seq;
	private String telType;
	private Integer phoneNumber;
	private Integer addContact_seq;
	private Integer is_primary;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getTelType() {
		return telType;
	}
	public void setTelType(String telType) {
		this.telType = telType;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
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
