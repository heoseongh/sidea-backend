package com.example.sideA.service;

import java.util.List;

import com.example.sideA.dto.CocktailDto;

public interface CocktailService {
	
	public List<CocktailDto> getCocktailList(String range)  throws Exception;
	
	public List<CocktailDto> getCocktailDetailList(String cocktailNum)  throws Exception; 

}
