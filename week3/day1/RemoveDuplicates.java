package week3.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		//Day1 Assignment 2
		String text = "We learn java basics as part of java sessions in java week1";	
		int count=0;
		String [] s=text.split(" ");
		System.out.println("The given string is : " +text);
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				if(s[i].equalsIgnoreCase(s[j])) {
					s[j]="";
					count++;
				}
			}
			
		}
		System.out.println("After removing duplicate words: ");
		if(count>0)
		for(int k=0;k<s.length;k++) {
			System.out.print(s[k]+" ");
		}
	}
}
