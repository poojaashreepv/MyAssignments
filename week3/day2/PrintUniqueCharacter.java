package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		//Day2 Assignment 4
		String name="babu";
		char[] charArray=name.toCharArray();
		Set<Character> uniqueCharacter=new HashSet<Character>();
		for(Character unique:charArray) {
			if(!uniqueCharacter.add(unique)) {
				uniqueCharacter.remove(unique);
			}
		}
		System.out.println("The Unique Character in a String : " +uniqueCharacter);

	}

}
