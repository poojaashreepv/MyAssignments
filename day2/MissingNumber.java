package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		//Day 2 Assignment 3
		int[] array= {1,4,2,6,3,7,9,4,6,8,10,2,3};
		Set<Integer> arraySet = new TreeSet<Integer>();
		for(Integer num : array) {
			arraySet.add(num);
		}
		List<Integer> outputList = new ArrayList<Integer>(arraySet);
		for(int i=0;i<outputList.size();i++) {
			if(outputList.get(i)!=i+1) {
				System.out.println("The Missing Number in an Array is " +(i+1));
				break;
				
			}
			
		}

	}

}
