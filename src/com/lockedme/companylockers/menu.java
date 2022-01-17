package com.lockedme.companylockers;

import java.util.Scanner;

public class menu {
	
	private String[] menuItems;
	private String root = new String();
	
	public menu (String[] items) {
		this.menuItems = items;
	}
	
	public menu(String rootItem, String[] items) {
		this.root = rootItem;
		this.menuItems = items;
	}

	public String[] getMenuArray() {
		return menuItems;
	}
	
	public String getMenuItem(int itemNumber) {
		return menuItems[itemNumber];
	}
	
	public int getUserInput() {
		
		int selection;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a menu item number <enter>: ");
		selection = sc.nextInt();
		sc.close();
		return selection;		
	}
	
	public void printMenu() {
		
		for(int x=0; x < menuItems.length;x++)
			System.out.println(x+1 + ". " + menuItems[x]);
	}
}