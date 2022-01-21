package com.lockedme.companylockers;

import java.util.Scanner;

public class menu {

	protected String[] menuItems;
	protected String inputText;

	public menu(String[] items) {
		this.menuItems = items;
		this.inputText = "Enter a menu item number <q to quit>: ";
	}

	public String[] getMenuArray() {
		return menuItems;
	}

	public String getMenuArrayItem(int index) {
		return menuItems[index];
	}

	public String getMenuItem(String itemLetter) {
		int baseAscii = 97;
		int itemIndex = 0;
		char itemLetterChar;

		String returnItem = new String();
		if (!itemLetter.equals("q")) {
			itemLetterChar = itemLetter.charAt(0);
			itemIndex = (int) itemLetterChar - baseAscii;
			if (itemIndex > menuItems.length - 1 || itemIndex < 0) {
				returnItem = "Error: You have selected an option that isn't available";
			} else
				returnItem = menuItems[itemIndex];
		} else
			returnItem = "q";

		return returnItem;
	}

	public String getUserInput() {

		String selection = new String();
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print(inputText);
			selection = sc.next();
		} catch (Exception e) {
			System.out.println("An error occurred!");			
			//e.printStackTrace();
		}
		return selection;
	}

	public void printMenu() {
		int baseAscii = 97;
		int asciiValue = 0;

		for (int x = 0; x < menuItems.length; x++) {
			asciiValue = baseAscii + x;
			char menuOption = (char) asciiValue;
			System.out.println(menuOption + ". " + menuItems[x]);
		}
	}
}