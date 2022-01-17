package com.lockedme.companylockers;

import java.util.Scanner;

public class Main {
	
	public int mainMenu() {
		
		return 0;
	}
	
	public int subMenu() {
		
		return 0;
		
	}

	public static void main(String[] args) {
		
		int menuItem = 0;
		String[] menuItems = {"first","second","third"};
		banner b = new banner("app", "Tim Wyatt","wyattim@gmail.com");
		b.printBanner();
		//Need a loop to go around the menu, until a quit is detected
		menu m = new menu(menuItems);
		m.printMenu();
		
		
	}
}
