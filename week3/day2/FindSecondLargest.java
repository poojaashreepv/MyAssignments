package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		//Day2 Assignment 2
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> dataSet=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++) {
			dataSet.add(data[i]);
		}
		List<Integer> dataList=new ArrayList<Integer>(dataSet);
		int a=dataList.size();
		System.out.println("The Second Largest Number in an Array is " +dataList.get(a-2));
		

	}

}
