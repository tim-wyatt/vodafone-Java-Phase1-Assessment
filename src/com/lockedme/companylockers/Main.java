package com.lockedme.companylockers;

public class Main {
	
	public static void main(String[] args) {
		String menuItem = new String();
		String[] mainMenuItems = {"Display current files","File operations"};
		
		menu mainMenu = new menu(mainMenuItems);
		banner b = new banner("app", "Tim Wyatt","wyattim@gmail.com");
		b.printBanner();
		
		while(!menuItem.equals("q")) {
			mainMenu.printMenu();
			menuItem = mainMenu.getUserInput();
			String menuString = new String();
			menuString = mainMenu.getMenuItem(menuItem); 
			System.out.println("Entered " + menuItem  + ". " + menuString);	
		}
		System.out.println("Quitting");
	}
}
