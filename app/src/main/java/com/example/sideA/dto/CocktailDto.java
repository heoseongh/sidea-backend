package com.example.sideA.dto;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
public class CocktailDto {
	
	private String test;
	private int cocktail_num;
	private String cocktail_name;
	private String cocktail_method;
	private String cocktail_base;
	private int cocktail_recipe_num;
	private String ingredient_name;
	private float ingredient_volume;
	private int ingredient_price;
	private String unit;

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public int getCocktail_num() {
		return cocktail_num;
	}

	public void setCocktail_num(int cocktail_num) {
		this.cocktail_num = cocktail_num;
	}

	public String getCocktail_name() {
		return cocktail_name;
	}

	public void setCocktail_name(String cocktail_name) {
		this.cocktail_name = cocktail_name;
	}

	public String getCocktail_method() {
		return cocktail_method;
	}

	public void setCocktail_method(String cocktail_method) {
		this.cocktail_method = cocktail_method;
	}

	public String getCocktail_base() {
		return cocktail_base;
	}

	public void setCocktail_base(String cocktail_base) {
		this.cocktail_base = cocktail_base;
	}

	public int getCocktail_recipe_num() {
		return cocktail_recipe_num;
	}

	public void setCocktail_recipe_num(int cocktail_recipe_num) {
		this.cocktail_recipe_num = cocktail_recipe_num;
	}

	public String getIngredient_name() {
		return ingredient_name;
	}

	public void setIngredient_name(String ingredient_name) {
		this.ingredient_name = ingredient_name;
	}

	public float getIngredient_volume() {
		return ingredient_volume;
	}

	public void setIngredient_volume(float ingredient_volume) {
		this.ingredient_volume = ingredient_volume;
	}

	public int getIngredient_price() {
		return ingredient_price;
	}

	public void setIngredient_price(int ingredient_price) {
		this.ingredient_price = ingredient_price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	

}
