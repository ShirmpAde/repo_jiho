package com.jeongjiho.fapp.addcontact;

public class AddcontactDto {

//	int -> Integer
//	varchar -> String
	
	private String seq;
	private Integer flag;
	private String lastName;
	private String firstName;
	private String middleName;
	private String naverId;
	private String nickName;
	private String memo;
	private Integer is_primary;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getNaverId() {
		return naverId;
	}
	public void setNaverId(String naverId) {
		this.naverId = naverId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Integer getIs_primary() {
		return is_primary;
	}
	public void setIs_primary(Integer is_primary) {
		this.is_primary = is_primary;
	}
	
}
