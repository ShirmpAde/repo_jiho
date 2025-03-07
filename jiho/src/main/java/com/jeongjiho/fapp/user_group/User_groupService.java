package com.jeongjiho.fapp.user_group;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User_groupService {

	@Autowired
	User_groupDao user_groupDao;
//	NaverhompageDao naverhompage = new NaverhompageDao(); 
	
//	public List<NaverhompageDto> selectList(){
//		List<NaverhompageDto> naverhompageDtos = new ArrayList<>();
//		
//		naverhompageDtos = naverhompageDao.selectList();
//		
//		return naverhompageDtos;
//	}	
	
	public List<User_groupDto> selectList(){
		return user_groupDao.selectList();
	}

	public Object selectOne(User_groupDto user_groupDto) {
		return user_groupDao.selectOne(user_groupDto);
	}
	
	public int insert(User_groupDto user_groupDto) {
		return user_groupDao.insert(user_groupDto);
	}
	
	public int update(User_groupDto user_groupDto) {
		return user_groupDao.update(user_groupDto);
	}
	
	public int delete(User_groupDto user_groupDto) {
		return user_groupDao.delete(user_groupDto);
	}
	
	public int uelete(User_groupDto user_groupDto) {
		return user_groupDao.uelete(user_groupDto);
	}
}

