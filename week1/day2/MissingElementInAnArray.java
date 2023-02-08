package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		//Day2 Assignment 7
		int arr[]= {1,2,3,4,7,8,6};
		Arrays.sort(arr);
		System.out.print("The Missing Element in an array is : ");
		for(int i=0;i<arr.length;i++)
		{	
		if(arr[i]!=i+1) {
			System.out.println(i+1);
			break;
		}
		}

	}

}
