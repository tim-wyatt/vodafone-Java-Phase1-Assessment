package com.lockedme.companylockers;

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
			menuString = mainMenu.getMenuItem(menuItem); 
			
			switch(menuItem) {
			case "a":
				filearray.printArray();
				break;
			case "b":
				System.out.println("Entered " + menuItem  + ". " + menuString);
				break;
			}
		}
		System.out.println("Quitting");
	}
}
