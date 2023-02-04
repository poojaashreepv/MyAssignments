package week1.day1;

public class Mobile {
	//Day1 Assignment 2
	public void makeCall() {
		String mobileModel="OppoReno8";
		float mobileWeight=179f;
		System.out.println("Mobile Model: " +mobileModel);
		System.out.println("Mobile Weight: " +mobileWeight+ "g");
	}
	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=29999;
		System.out.println("Is Mobile is Full Charged: " +isFullCharged);
		System.out.println("Mobile Cost: " +mobileCost);
		
	}

	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is my mobile");
		

	}

}
