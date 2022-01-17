package com.lockedme.companylockers;

public class Main {
	
	public static void main(String[] args) {
		
		int menuItem = 0;
		
		String[] menuItems = {"first","second","third"};
		menu mainMenu = new menu(menuItems);
		banner b = new banner("app", "Tim Wyatt","wyattim@gmail.com");
		b.printBanner();
		
		//Need a loop to go around the menu, until a quit is detected
		
		mainMenu.printMenu();
		menuItem = mainMenu.getUserInput();
		String menuString = new String();
		menuString = mainMenu.getMenuItem(menuItem-1); //bit of a hack to get the array element
		System.out.println("Entered " + menuItem  + ". " + menuString);
		
		
	}
}
