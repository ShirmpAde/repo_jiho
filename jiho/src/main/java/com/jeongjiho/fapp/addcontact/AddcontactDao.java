package com.jeongjiho.fapp.addcontact;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AddcontactDao {
	
	public List<AddcontactDto> selectList();
}
