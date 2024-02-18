package com.example.sideA.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sideA.dto.CocktailDto;
import com.example.sideA.service.CocktailService;
import com.example.sideA.service.TestService;

@RequestMapping("/cocktail")
@RestController
public class CocktailController {
	
	@Autowired
	private CocktailService cocktailService;

    @GetMapping("/list")
    public ResponseEntity<HashMap<String, Object>> getCocktailList() {
    	
    	String range = "";
    	
    	HashMap<String, Object> result = new HashMap<>();
    	
    	List<CocktailDto> cocktailList = new ArrayList<>();
    	
    	try {
		
    		cocktailList = cocktailService.getCocktailList(range);
    			
        	result.put("cockTailList", cocktailList);
    		
		} catch (Exception e) {
			
			e.printStackTrace();
		
		}
    	
    	return new ResponseEntity<HashMap<String, Object>>(result, HttpStatus.OK);
    }
    
    @GetMapping("/detailList/{cockTail_Num}")
    public ResponseEntity<HashMap<String, Object>> getCocktailDetailList(@PathVariable("cockTail_Num") String cockTail_Num) {
    	
    	String cockTailNum = cockTail_Num;
    	
    	HashMap<String, Object> result = new HashMap<>();
    	
    	List<CocktailDto> cocktailDetailList = new ArrayList<>();
    	
    	try {
    		
    		cocktailDetailList = cocktailService.getCocktailDetailList(cockTailNum);
    		
    		result.put("cockTailDetailList", cocktailDetailList);
    		
		} catch (Exception e) {
			
			e.printStackTrace();
		
		}
    	
    	return new ResponseEntity<HashMap<String, Object>>(result, HttpStatus.OK);
    }
    
    @GetMapping("/cocktailCombination")
    public ResponseEntity<HashMap<String, Object>> getCocktailCombination(@RequestBody List<CocktailDto> cocktailDto) {
    	
    	
    	HashMap<String, Object> result = new HashMap<>();
    	
    	try {
    		
		} catch (Exception e) {
			
			e.printStackTrace();
		
		}
    	
    	return new ResponseEntity<HashMap<String, Object>>(result, HttpStatus.OK);
    }

    
}
