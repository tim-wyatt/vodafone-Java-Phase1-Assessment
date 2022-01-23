package com.lockedme.companylockers;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	static banner b = new banner("File Locker Application", "Tim Wyatt","tim.wyatt@vodafone.com");
	
	public static void main(String[] args) {
		String menuItem = new String();
		String[] mainMenuItems = {"Display current files","File operations"};
 
		sortedArray filearray = new sortedArray();
		String menuString = new String();
		
		menu mainMenu = new menu(mainMenuItems);
		
		while(!menuItem.equals("q")) {
			b.printBanner();
			mainMenu.printMenu();
			menuItem = mainMenu.getUserInput();

			switch(menuItem) {
			case "a":
				filearray.printArray();
				break;
			case "b":
				menuString = mainMenu.getMenuItem(menuItem);
				sMenu(menuString, filearray);
				break;
			}
		}
		System.out.println("Quitting");
	}
	
	private static void sMenu(String rootMenuString, sortedArray fileArray) {
		
		int searchResult = 0;
		String[] fileOpsMenuItems = {"Add new file","Search for a file","Delete a file"};
		String sMenuOption = new String();
		String searchFile = new String();
		subMenu sm = new subMenu(fileOpsMenuItems, rootMenuString);

		while(sMenuOption.compareTo("q") != 0) {
		//	clearScreen();
			sm.printMenu();
			sMenuOption = sm.getUserInput();

			switch(sMenuOption) {
			case "a":
				file File = new file();
				fileArray.addNewFileName(File.getFileName());
				fileArray.printArray();
				break;
			case "b":
				searchFile = getFileName("Enter the file you wish to search for: ");
				searchResult = fileArray.searchForFile(searchFile);
				System.out.println("Result of search: " + searchResult);
				break;
			case "c":
				searchFile = getFileName("Enter the file you wish to delete: ");
				fileArray.deleteFileName(searchFile);
				fileArray.printArray();
				break;
			case "q":
				System.out.println("Returning to main menu....");
				break;
			default:
				System.out.println("That option doesn't exist");
				break;
			}
		}
	}
	
	public static String getFileName(String question) {
		String userInput = new String();
		String inputText = question;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print(inputText);
			userInput = sc.next();
		} catch (Exception e) {
			System.out.println("An error occurred!");			
			//e.printStackTrace();
		}
		
		return userInput;
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
