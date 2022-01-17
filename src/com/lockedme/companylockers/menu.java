package com.lockedme.companylockers;

public class menu {
	
	private String[] menuItems;
	
	public menu (String[] items) {
		menuItems = items;
	}

	public String[] getMenuArray() {
		return menuItems;
	}
	
	public void printMenu() {
		
		for(int x=0; x < menuItems.length;x++)
			System.out.println(x + ". " + menuItems[x]);
	}
}
