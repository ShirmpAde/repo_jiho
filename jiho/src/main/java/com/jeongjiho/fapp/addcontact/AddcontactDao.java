package com.jeongjiho.fapp.addcontact;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jeongjiho.fapp.naveradress.NaveradressDto;

@Repository
public interface AddcontactDao {
	
//	mapper 에서 해당하는 쿼리와 연결 시켜 주고
//	쿼리 결과를 가져옴
	
	public List<AddcontactDto> selectList();
	public AddcontactDto selectOne(AddcontactDto addcontactDto);
	public int insert(AddcontactDto addcontactDto);
}
