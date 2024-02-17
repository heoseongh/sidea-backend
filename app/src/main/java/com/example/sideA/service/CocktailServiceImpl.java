package com.example.sideA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sideA.dao.CocktailDao;
import com.example.sideA.dto.CocktailDto;


@Service
public class CocktailServiceImpl implements CocktailService {
	
	@Autowired
	private CocktailDao cocktailDao;

	@Override
	public List<CocktailDto> getCocktailList(String range) throws Exception {
		
		return cocktailDao.getCocktailList(range);
		
		
	}

	@Override
	public List<CocktailDto> getCocktailDetailList(String cocktailNum) throws Exception {
		
		return cocktailDao.getCocktailDetailList(cocktailNum);
		
	}
	
}
