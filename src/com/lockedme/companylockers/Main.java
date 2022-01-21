package com.lockedme.companylockers;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) {
		String menuItem = new String();
		String[] mainMenuItems = {"Display current files","File operations"};
 
	//	String[] testarray = new String[] {"a.jpg","z.jpg","d.jpg","h.jpg","y.jpg","try.jpg","zzTop.jpg"};
	//	sortedArray filearray = new sortedArray(testarray);
		sortedArray filearray = new sortedArray();
		String menuString = new String();
		
		menu mainMenu = new menu(mainMenuItems);
		banner b = new banner("app", "Tim Wyatt","wyattim@gmail.com");
		b.printBanner();
		
		while(!menuItem.equals("q")) {
			mainMenu.printMenu();
			menuItem = mainMenu.getUserInput();

			switch(menuItem) {
			case "a":
				filearray.printArray();
				break;
			case "b":
				menuString = mainMenu.getMenuItem(menuItem);
				sMenu(menuString);
				break;
			}
		}
		System.out.println("Quitting");
	}
	
	private static void sMenu(String rootMenuString) {
		String[] fileOpsMenuItems = {"Add new file","Delete a file","Search for a file","Back to main menu"};
		String sMenuOption;
		subMenu sm = new subMenu(fileOpsMenuItems, rootMenuString);
		clearScreen();
		sm.printMenu();
		sMenuOption = sm.getUserInput();
		
		switch(sMenuOption) {
		case "a":
			break;
		case "b":
			break;
		case "q":
			break;
		}
		
		
	}
	public static void clearScreen() {  
		try {
			Runtime.getRuntime().exec("clear");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}  

}
