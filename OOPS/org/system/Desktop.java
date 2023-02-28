package org.system;

public class Desktop extends Computer {
	//Assignment 1
	public void desktopSiz() {
		System.out.println("Dimension of HP desktop is 13.6 x 25.8 x 31 cm");
	}
	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.computerModel();
		obj.desktopSiz();
	}

}
