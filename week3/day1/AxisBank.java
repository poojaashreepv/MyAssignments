package week3.day1;

public class AxisBank extends BankInfo {
	//Day1 Assignment 4
	public void deposit(int x) {
		System.out.println("Deposit amount: " +x);
	}

	public static void main(String[] args) {
		AxisBank obj=new AxisBank();
		obj.saving(1000000);
		obj.fixed(100000);
		obj.deposit(50000);
		
	}

}
