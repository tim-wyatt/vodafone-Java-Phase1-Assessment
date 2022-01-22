package com.lockedme.companylockers;

public class tablePrinter {
	private String[] array = new String[] {};

	public tablePrinter(String[] inArray) {
		this.array = inArray;
		printTable(array);
	}

	private static void printTable(String[] arrayToPrint) {
		//TODO Tidy this up so that the table has a minimum length and fits longest string
		
		String leftAlignFormat = "| %-19s                                   |%n";

		System.out.format("+------------------------------------------------+%n");
		System.out.format("| Filename                                       |%n");
		System.out.format("+------------------------------------------------+%n");
		for (int i = 0; i <= arrayToPrint.length-1; i++) {
		    System.out.format(leftAlignFormat, arrayToPrint[i]);
		} 
		System.out.format("+------------------------------------------------+%n");
	}
}
