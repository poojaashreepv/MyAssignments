package week1.day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		//Day2 Assignment 2
		int num=34343;
		int rem,temp;
		int rev=0;
		temp=num;
		for(int i=0;i<5;i++) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("The given number is a Palindrome Number");
		}
		else {
			System.out.println("The given number is not a Palindrome Number");
		}

	}

}
