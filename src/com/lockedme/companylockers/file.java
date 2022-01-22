package com.lockedme.companylockers;
import java.util.Scanner;

public class file {
	private String fileName = new String();
	
	public  file() {
		this.fileName = setFileName();
	}
	
	public String setFileName() {
		String userInput = new String();
		String inputText = "Enter the name of the file to add: ";
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
	
	public String getFileName() {
		return fileName;
	}
}
