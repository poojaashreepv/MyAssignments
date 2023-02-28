package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		//Day2 Assignment 6
		String s="Paypal India";
		s=s.toLowerCase();
		char[] charArray=s.toCharArray();
		Set<Character> charSet=new LinkedHashSet<Character>();
		Set<Character> dupCharSet=new LinkedHashSet<Character>();
		for(Character character : charArray) {
			if(!charSet.add(character)) {
				dupCharSet.add(character);
			}
		}
		charSet.removeAll(dupCharSet);
		System.out.print("After duplicates removed : ");
		for(Character unique : charSet) {
			if(unique!=' ') {
				System.out.print(unique + " ");
			}
		}
		
		

	}

}
