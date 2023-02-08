package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		//Day2 Assignment 8
		int range=8,firstNum=0,secNum=1,sum;
		System.out.print(firstNum +" "+secNum);
		for(int i=2;i<range;i++) {
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.print(" "+sum);
		}
	}

}
