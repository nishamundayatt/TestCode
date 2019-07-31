package com.model;

public class Item {
private int price;
private int shippingCost;
private int rating;
private String name;
private String category;



public int getPrice() {
	return price;
}



public void setPrice(int price) {
	this.price = price;
}



public int getShippingCost() {
	return shippingCost;
}



public void setShippingCost(int shippingCost) {
	this.shippingCost = shippingCost;
}



public int getRating() {
	return rating;
}



public void setRating(int rating) {
	this.rating = rating;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getCategory() {
	return category;
}



public void setCategory(String category) {
	this.category = category;
}



public int getCost() {
	return this.price + this.shippingCost;
}



}
