package com.jeongjiho.fapp.navergroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NavergroupService {

	@Autowired
	NavergroupDao navergroupDao;
//	NaverhompageDao naverhompage = new NaverhompageDao(); 
	
//	public List<NaverhompageDto> selectList(){
//		List<NaverhompageDto> naverhompageDtos = new ArrayList<>();
//		
//		naverhompageDtos = naverhompageDao.selectList();
//		
//		return naverhompageDtos;
//	}	
	
	public List<NavergroupDto> selectList(){
		return navergroupDao.selectList();
	}

	public Object selectOne(NavergroupDto navergroupDto) {
		return navergroupDao.selectOne(navergroupDto);
	}
	
	public int insert(NavergroupDto navergroupDto) {
		return navergroupDao.insert(navergroupDto);
	}
}

