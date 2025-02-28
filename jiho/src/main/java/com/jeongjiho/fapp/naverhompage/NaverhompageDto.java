package com.jeongjiho.fapp.naverhompage;

public class NaverhompageDto {

// int -> Integer	
// vachar -> String
// Tinyint -> Integer	

	private String seq;
	private String hompage;
	private Integer addCondtact_seq;
	private Integer is_primary;
//	-----
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getHompage() {
		return hompage;
	}
	public void setHompage(String hompage) {
		this.hompage = hompage;
	}
	public Integer getAddCondtact_seq() {
		return addCondtact_seq;
	}
	public void setAddCondtact_seq(Integer addCondtact_seq) {
		this.addCondtact_seq = addCondtact_seq;
	}
	public Integer getIs_primary() {
		return is_primary;
	}
	public void setIs_primary(Integer is_primary) {
		this.is_primary = is_primary;
	}
	
}
