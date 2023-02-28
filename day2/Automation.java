package week3.day2;

public class Automation extends MultipleLanguage{
	//Day2 Assignment 1
	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.Java();
		obj.Selenium();
		obj.python();
		obj.ruby();
		
	}

	public void Selenium() {
		System.out.println("Selenium is a Automation Framework");
		
	}

	public void Java() {
		System.out.println("Java is Base Language for Selenium WebDriver");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby is a Scripting Language");
		
	}

}