package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		//Day2 Assignment 5
		String[] companyNames= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		List<String> companyNameList=new ArrayList<String>(Arrays.asList(companyNames));
		int len=companyNameList.size();
		Collections.sort(companyNameList);
		List<String> sorting=new ArrayList<String>();
		for(int i=len-1;i>=0;i--) {
			sorting.add(companyNameList.get(i));
		}
		System.out.println(sorting);
		

	}

}
