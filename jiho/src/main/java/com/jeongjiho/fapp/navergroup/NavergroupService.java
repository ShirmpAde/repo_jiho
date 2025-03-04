package com.jeongjiho.fapp.navergroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NavergroupService {
	
	@Autowired
	NavergroupDao navergroupDao;
	
	public List<NavergroupDto> selectList(){
		return navergroupDao.selectList();
	}
	
	public NavergroupDto selectOne(NavergroupDto navergroupDto){
		return navergroupDao.selectOne(navergroupDto);
	}
}