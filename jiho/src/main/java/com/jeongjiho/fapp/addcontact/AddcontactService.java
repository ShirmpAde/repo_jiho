package com.jeongjiho.fapp.addcontact;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddcontactService {
	
//	로직 정의
	
//	여러건의 데이터를 가지고 온다
	
	@Autowired
	AddcontactDao addcontactDao;
//	AddcontactDao addcontactDao = new AddcontactDao();
	
//	public List<AddcontactDto> selectList(){
//		List<AddcontactDto> addcontactDtos = new ArrayList<>();
//		
//		addcontactDtos = addcontactDao.selectList();
//		
//		return addcontactDtos;
//	}
	
	public List<AddcontactDto> selectList(){
		return addcontactDao.selectList();
	}
	public Object selectOne(AddcontactDto addcontactDto) {
		return addcontactDao.selectOne(addcontactDto);		
	}
	public int insert(AddcontactDto addcontactDto) {
		return addcontactDao.insert(addcontactDto);		
	}
}

