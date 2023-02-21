package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		//Day1 Assignment 1
		String test = "changeme";
		char[] c=test.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(i%2!=0) {
				c[i]=Character.toUpperCase(c[i]);
				System.out.print(c[i]);
			}
			
			else {
				System.out.print(c[i]);
			}
		}
	}

}
