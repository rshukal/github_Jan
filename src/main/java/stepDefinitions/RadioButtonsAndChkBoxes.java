package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsAndChkBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		WebElement benzradBtn=driver.findElement(By.id("benzradio"));
		benzradBtn.click();
		WebElement bmwCB=driver.findElement(By.id("bmwcheck"));
		bmwCB.click();
		WebElement hondaCB=driver.findElement(By.id("hondacheck"));
		hondaCB.click();
		System.out.println(benzradBtn.isSelected());
		System.out.println(bmwCB.isSelected());
		System.out.println(hondaCB.isSelected());
		WebElement disBtn=driver.findElement(By.id("disabled-button"));
		disBtn.click();
		System.out.println(driver.findElement(By.id("enabled-example-input")).isEnabled());
		disBtn.click();
		WebElement enbBtn=driver.findElement(By.id(("enabled-button")));
		enbBtn.click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("enabled-example-input")).isEnabled());
	}

}
