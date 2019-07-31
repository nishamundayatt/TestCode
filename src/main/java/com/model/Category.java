package com.model;

import java.util.List;

public class Category {
private List<Item> items;
private String name;

public List<Item> getItems() {
	return items;
}

public void setItems(List<Item> items) {
	this.items = items;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
