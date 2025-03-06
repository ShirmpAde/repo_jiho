package com.jeongjiho.fapp.naveremail;

public class NaveremailDto {

	private String seq;
	private String emailAccount;
	private String emailDomain;
	private Integer addContact_seq;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getEmailAccount() {
		return emailAccount;
	}
	public void setEmailAccount(String emailAccount) {
		this.emailAccount = emailAccount;
	}
	public String getemailDomain() {
		return emailDomain;
	}
	public void setemailDomain(String emailDomain) {
		this.emailDomain = emailDomain;
	}
	public Integer getAddContact_seq() {
		return addContact_seq;
	}
	public void setAddContact_seq(Integer addContact_seq) {
		this.addContact_seq = addContact_seq;
	}
	
}
