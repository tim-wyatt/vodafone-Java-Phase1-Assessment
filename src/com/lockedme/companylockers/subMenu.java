package com.lockedme.companylockers;

import java.util.Scanner;

public class subMenu extends menu {
	
	private String rootItem;

	
	public subMenu (String[] items, String rootMenuString) {
		super(items);
		rootItem = rootMenuString;
		super.inputText = "Enter a menu item number <q to go back to main menu>: ";
	}
	
	@Override
	public void printMenu() {
		int baseAscii = 97;
		int asciiValue = 0;
		System.out.println("\n"+rootItem);
		for (int x = 0; x < menuItems.length; x++) {
			asciiValue = baseAscii + x;
			char menuOption = (char) asciiValue;
			System.out.println("   " + menuOption + ". " + menuItems[x]);
		}
	}
}
