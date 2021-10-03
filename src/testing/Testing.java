package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testing {

public static void main(String[] args) {
		

		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("AKARSH");
		driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("SHARMA");
		driver.findElement(By.name("Email")).sendKeys("sweta.sharma16591@gmail.com");
		driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div/div/form/fieldset/div[4]/div/input")).sendKeys("7903109409");		
		
		
}
}
		