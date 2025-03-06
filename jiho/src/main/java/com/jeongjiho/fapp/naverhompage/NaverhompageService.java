package com.jeongjiho.fapp.naverhompage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NaverhompageService {

	@Autowired
	NaverhompageDao naverhompageDao;
//	NaverhompageDao naverhompage = new NaverhompageDao(); 
	
//	public List<NaverhompageDto> selectList(){
//		List<NaverhompageDto> naverhompageDtos = new ArrayList<>();
//		
//		naverhompageDtos = naverhompageDao.selectList();
//		
//		return naverhompageDtos;
//	}	
	
	public List<NaverhompageDto> selectList(){
		return naverhompageDao.selectList();
	}

	public Object selectOne(NaverhompageDto naverhompageDto) {
		return naverhompageDao.selectOne(naverhompageDto);
	}
	
	public int insert(NaverhompageDto naverhompageDto) {
		return naverhompageDao.insert(naverhompageDto);
	}
}

