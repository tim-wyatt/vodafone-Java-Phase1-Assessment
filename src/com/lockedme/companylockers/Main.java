package com.lockedme.companylockers;

import java.util.Scanner;

public class Main {
	
	public int mainMenu() {
		
		return 0;
	}
	
	public int subMenu() {
		
		return 0;
		
	}

	public static void printBanner() {
		System.out.println("____    __    ____  _______  __        ______   ______   .___  ___.  _______"); 
		System.out.println("\\   \\  /  \\  /   / |   ____||  |      /      | /  __  \\  |   \\/   | |   ____|");
		System.out.println(" \\   \\/    \\/   /  |  |__   |  |     |  ,----'|  |  |  | |  \\  /  | |  |__");   
		System.out.println("  \\            /   |   __|  |  |     |  |     |  |  |  | |  |\\/|  | |   __|  ");
		System.out.println("   \\    /\\    /    |  |____ |  `----.|  `----.|  `--'  | |  |  |  | |  |____"); 
		System.out.println("    \\__/  \\__/     |_______||_______| \\______| \\______/  |__|  |__| |_______|");
		                                                                             
		System.out.println("Application Name: LockedMe.com");
		System.out.println("Written by: Tim Wyatt (tim.wyatt@vodafone.com");
	}
	public static void main(String[] args) {
		
		banner b = new banner("app", "Tim Wyatt","wyattim@gmail.com");
		b.printBanner();
	}
}
