package com.jeongjiho.fapp.addcontact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddcontactService {

	@Autowired
	AddcontactDao addcontactDao;
	public List<AddcontactDto> selectList(){
		return addcontactDao.selectList();
	}
}

