package Testproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monisha {
	public static void main(String[] args){
		
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\K.BALAJI\\eclipse-workspace\\SeleniumDay1OnlineBatch\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();}
}
