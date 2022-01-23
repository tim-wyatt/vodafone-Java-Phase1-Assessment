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

	/*
	 * Temporary constructor to test
	 * TODO Remove Me!
	 */
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
			array[itemsInArray] = filename;
			itemsInArray++;
			/*
			 * Possibly only do this when we print the array rather than everytime we add to it?
			 */
			mergeSort(array);
		}
		else {
			growArray();
			array[itemsInArray] = filename;
			itemsInArray++;	
			mergeSort(array);
		}
	}
	
	public void deleteFileName(String filename) {
		int index;
		String[] tempArray = new String[array.length -1];
		
		
		index = searchForFile(filename);
		
		if(index < 0) {
			System.out.println("File not found");
		}
		else {	
			for(int i=0, j=0;i<array.length;i++) {
				if(i!=index) {
					tempArray[j++] = array[i];
				}
			}
		}
		array = tempArray;
	}
	
	public int searchForFile(String filename) {

//		int returnInt = 0;
		
			int left = 0;
			int right = array.length-1;
			while(left <= right) {
				int mid = (left+right)/2;
				if(array[mid].compareTo(filename) == 0)
					return mid;
				if(array[mid].compareTo(filename)<0)
					left = mid+1;
				else if (array[mid].compareTo(filename) >0)
					right = mid-1;
				else
					right=mid-1;
			}	
//		returnInt = -1;
//		return returnInt;
			return -1;
	}
	
	private void growArray() {
		String[] tempArray = new String[itemsInArray+1];
		for(int x=0; x<itemsInArray; x++) {
			tempArray[x] = array[x];
		}
		array = tempArray;
	}
	
	public void printArray() {
		if(itemsInArray > 0) {
			tablePrinter tp = new tablePrinter(array);
		}
		else {
			String[] noFiles = new String[] {"There are no files stored"};
			tablePrinter tp = new tablePrinter(noFiles);
			
		}
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
