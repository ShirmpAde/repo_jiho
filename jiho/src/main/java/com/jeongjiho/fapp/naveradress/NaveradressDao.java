package com.jeongjiho.fapp.naveradress;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface NaveradressDao {

	public List<NaveradressDto> selectList();
}
