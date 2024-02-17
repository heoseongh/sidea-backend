package com.example.sideA.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.sideA.dto.CocktailDto;

@Mapper
public interface CocktailDao {
	
	public List<CocktailDto> getCocktailList(String range)  throws Exception; 
	
	public List<CocktailDto> getCocktailDetailList(String cocktailNum)  throws Exception; 
	
}


