package com.lockedme.companylockers;

public class sortedArray {
	private String[] array = new String[] {};
	private int arrayLen = 0;
	private int itemsInArray=0;
	
	
	public sortedArray() {
		array = new String[1];
		arrayLen = 1;
		itemsInArray = 0;
		
	}
	//Temporary constructor to test
	public sortedArray(String[] inArray) {
		array = inArray;
		itemsInArray = array.length;
		arrayLen = array.length;
		mergeSort(array);
	}

	public String[] getArray() {
		return array;
	}
	
	public int getArrayLen() {
		return arrayLen;
	}
	
	public int getNumberofItemsInArray() {
		return itemsInArray;
	}
	
	public void addNewFileName(String filename) {
		if (itemsInArray < arrayLen) {
			array[itemsInArray+1] = filename;
			itemsInArray++;
			mergeSort(array);
		}
		else {
			growArray();
			array[itemsInArray+1] = filename;
			itemsInArray++;	
			mergeSort(array);
		}
	}
	
	private void growArray() {
		String[] tempArray = new String[itemsInArray+1];
		for(int x=0; x<array.length-1; x++) {
			tempArray[x] = array[x];
		}
		array = tempArray;
	}
	
	public void printArray() {
		if(itemsInArray < 0) {
		for(int x=0; x<=array.length-1;x++ )
			System.out.println(array[x]);
		}
		else
			System.out.println("+---------------------------+");
			System.out.println("|                           |");
			System.out.println("| There are no files stored | ");
			System.out.println("|                           |");
			System.out.println("+---------------------------+");
	}
	
	private static void mergeSort(String arr[])
	{
		if(arr.length <=1) return;
		
		int mid = arr.length/2;
		String left[] = new String[mid];
		String right[] = new String[arr.length-mid];
		
		for(int i=0;i<mid;i++)
			left[i] = arr[i];
		
		for(int i=mid; i<arr.length;i++)
			right[i-mid] = arr[i];
		
		mergeSort(left);
		mergeSort(right);
		mergeValues(arr, left, right);
	}
	
	public static void mergeValues(String a[], String l[], String r[])
	{
		int i=0, j=0, k=0;
		
		while(i<l.length && j<r.length)
		{
			if(l[i].compareTo(r[j]) <=0 )
			{
				a[k] = l[i++];
			}
			else
				a[k] = r[j++];
			k++;
		}
		while(i<l.length)
		{
			a[k] = l[i];
			i++;
			k++;
			
		}
		while(j<r.length)
		{
			a[k] = r[j];
			j++;
			k++;
			
		}	
	}
}
