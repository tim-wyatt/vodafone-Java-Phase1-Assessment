package com.lockedme.companylockers;

public class banner {
	
	static String appCreator = new String("");
	static String appName = new String("");
	static String creatorEmail = new String("");
	
	/**
	 * 
	 * @param app
	 * @param email
	 * @param creator
	 */
	public banner (String app,  String email, String creator){
		appCreator = creator;
		creatorEmail = email;
		appName = app;
	}
	
	public void printBanner() {
		System.out.println("____    __    ____  _______  __        ______   ______   .___  ___.  _______"); 
		System.out.println("\\   \\  /  \\  /   / |   ____||  |      /      | /  __  \\  |   \\/   | |   ____|");
		System.out.println(" \\   \\/    \\/   /  |  |__   |  |     |  ,----'|  |  |  | |  \\  /  | |  |__");   
		System.out.println("  \\            /   |   __|  |  |     |  |     |  |  |  | |  |\\/|  | |   __|  ");
		System.out.println("   \\    /\\    /    |  |____ |  `----.|  `----.|  `--'  | |  |  |  | |  |____"); 
		System.out.println("    \\__/  \\__/     |_______||_______| \\______| \\______/  |__|  |__| |_______|");
		System.out.println("\nApplication Name: " + appName);
		System.out.println("Application Author: " + appCreator);
		System.out.println("Application Author mail: " + creatorEmail);
		
	}
}
