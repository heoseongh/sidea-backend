package com.example.sideA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sideA.dao.TestDao;


@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestDao testDao;
	
	@Override
	public String getTestDb() throws Exception {
		
		return testDao.getTestDb();
	}
	
	
}
