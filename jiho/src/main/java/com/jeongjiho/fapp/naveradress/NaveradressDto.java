package com.jeongjiho.fapp.naveradress;

public class NaveradressDto {
	
	private String seq;
	private String adressType;
	private String zipCode;
	private String search;
	private String address;
	private Integer addContact_seq;
	private Integer is_primary;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getAdressType() {
		return adressType;
	}
	public void setAdressType(String adressType) {
		this.adressType = adressType;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
