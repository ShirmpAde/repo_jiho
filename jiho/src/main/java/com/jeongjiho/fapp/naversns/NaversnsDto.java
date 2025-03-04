package com.jeongjiho.fapp.naversns;

public class NaversnsDto {
	
	private String seq;
	private String snsType;	
	private String snsAdress;
	private Integer addContact_seq;
    private Integer is_primary;
//    -----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getSnsType() {
		return snsType;
	}
	public void setSnsType(String snsType) {
		this.snsType = snsType;
	}
	public String getSnsAdress() {
		return snsAdress;
	}
	public void setSnsAdress(String snsAdress) {
		this.snsAdress = snsAdress;
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
