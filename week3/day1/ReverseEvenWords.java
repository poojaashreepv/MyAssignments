package week3.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		//Day1 Assignment 3
		String test = "I am a software tester";
		String [] s=test.split(" ");
		System.out.println("The given String is : " +test);
		System.out.print("After Reverse Even Words : ");
		for(int i=0;i<s.length;i++) {
			if(i%2==0) {
				char[] c=s[i].toCharArray();
				for(int j=c.length-1;j>=0;j--) {
					System.out.print(c[j]);
				}
			}
			else {
				System.out.print(" " + s[i] + " ");
			}
		}
	}
}
