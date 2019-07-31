package com.logic; 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.Category;
import com.model.Item;

public class CodingTestMain {

	public static void main(String args[]) {
		Map<Category, List<Item>> categoryItem = new HashMap<Category, List<Item>>();
		//building 20 item category and 10 items in each category
		for (int i = 0; i < 20; i++) {
			Category c = new Category();
			c.setName("Category" + (i + 1));
			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < 10; j++) {
				Item item = new Item();
				item.setName("Item" + (j + 1));
				item.setPrice(getRandomNumberBetweenRange(1, 20));
				item.setRating(getRandomNumberBetweenRange(1, 5));
				item.setShippingCost(getRandomNumberBetweenRange(2, 5));
				item.setCategory(c.getName());
				items.add(item);
			}
			c.setItems(items);
			categoryItem.put(c, items);
		}
		// finding items with max rating and total price < 50
		List<Item> selectedItems = new ArrayList<Item>();
		int totalCost = 0;
		int totalRating = 0;
		Item randomElement = null;
		for (Category cat : categoryItem.keySet()) {
			for (Item i : categoryItem.get(cat)) {
				if (i.getRating() == 5) {
					randomElement = i;
				}
			}

			totalCost = 0;
			totalRating = 0;
			for (Item item : selectedItems) {
				totalCost += item.getCost();
				totalRating += item.getRating();
			}
			if ((totalCost + randomElement.getCost()) < 50) {
				selectedItems.add(randomElement);

			} else {
				break;
			}

		}
		//print item category , total cost and rating
		for (Item picked : selectedItems) {
			System.out.println(picked.getCategory() + " " + picked.getName());
		}
		System.out.println("Total items " + selectedItems.size());
		System.out.println("Total cost: " + totalCost + "  Total rating:  " + totalRating);

	}

	public static int getRandomNumberBetweenRange(int min, int max) {
		int x = (int) ((Math.random() * ((max - min) + 1)) + min);
		return x;
	}

}
