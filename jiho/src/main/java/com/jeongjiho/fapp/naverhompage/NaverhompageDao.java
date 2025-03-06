package com.jeongjiho.fapp.naverhompage;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface NaverhompageDao {

	public List<NaverhompageDto> selectList();
	public NaverhompageDto selectOne(NaverhompageDto naverhompageDto);
	public int insert(NaverhompageDto naverhompageDto);
}

