package Assignement;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	public static void main(String[] args) {
		List<Integer> shoppingItems = new ArrayList<>();
		//add
		shoppingItems.add(1);
		shoppingItems.add(2);
		shoppingItems.add(3);
		shoppingItems.add(4);
		shoppingItems.add(5);
		shoppingItems.add(6);
		shoppingItems.add(7);
		shoppingItems.add(8);
		shoppingItems.add(9);
		shoppingItems.add(10);
		System.out.println("The Shopping list items"+shoppingItems);
		
		//remove
		shoppingItems.remove(6);
		System.out.println("The remove list"+shoppingItems);
	}

}
