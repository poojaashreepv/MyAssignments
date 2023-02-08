package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		//Day2 Assignment 1
		int num=13;
		boolean flag;
	    flag=false;
		if(num==0 || num==1)
		{
			System.out.println(num+" is not a Prime Number");
		}
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println(num+" is not a Prime Number");
				flag=true;
				break;
			}
		}
		
		if(flag==false){
				System.out.println(num+" is a Prime Number");
				
				
			}
	
	}

}
