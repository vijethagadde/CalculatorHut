package practise;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gvvij\\OneDrive\\Desktop\\latest\\Application.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http:\\calculatorhut.com");
			System.out.println(driver.getCurrentUrl());
		//arthemetic	
			//driver.findElement(By.className("pure-menu-link")).click();
			//driver.findElement(By.linkText("Arithmetic")).click(); //a href-linktext//
			//driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/table/tbody/tr[1]/td[1]/p"))
		
		//arthemetic sequence
			//driver.findElement(By.id("firstnumber")).sendKeys("13");
			//driver.findElement(By.id("diff")).sendKeys("2");
			//driver.findElement(By.id("nth")).sendKeys("2");
			//driver.findElement(By.className("pure-button")).click();
			
	//geometric sequence
			//driver.findElement(By.id("firstnumber2")).sendKeys("4");
			//driver.findElement(By.id("diff2")).sendKeys("2");
		 //	driver.findElement(By.id("nth2")).sendKeys("6");
			//driver.findElement(By.xpath("//*[@id='main']/div/div[2]/button[1]")).click();
			
	//fibonacci
			
			//driver.findElement(By.id("fibon")).sendKeys("12345");
			//driver.findElement(By.xpath("//*[@id='main']/div/div[3]/button[1]")).click();
			//driver.navigate().back();
			
	//basic math calculation
			//driver.findElement(By.linkText("Scientific / Basic")).click();
			
		//binary 
			//driver.findElement(By.linkText("Binary")).click();
			//driver.findElement(By.id("numb1")).sendKeys("10");
			//driver.findElement(By.className("pure-button")).click();
			
		//decimal to binary
			
			//driver.findElement(By.id("numb2")).sendKeys("1000000000000000"); //bug
			//driver.findElement(By.xpath("//*[@id='main']/div/div[2]/button[1]")).click();
			
		//binary calculator
			
			//driver.findElement(By.id("perof123")).sendKeys("01111110000111100");
			//Select s= new Select(driver.findElement(By.id("perofab"))); //static drop down
			//s.selectByValue("÷");
			//driver.findElement(By.id("numb123")).sendKeys("1000000000000000");
			//driver.findElement(By.xpath("//*[@id='main']/div/div[3]/button[1]")).click();
			//driver.navigate().back();
			
		//fraction
			
			//driver.findElement(By.linkText("Fractions")).click();
			//driver.findElement(By.xpath("//input[@name='perof']")).sendKeys("0.0090029");
			//driver.findElement(By.xpath("//input[@name='numb']")).sendKeys("0.0090029");
			//Select s=new Select(driver.findElement(By.id("perofab")));
			//s.selectByValue("x");
			//driver.findElement(By.cssSelector("input[name='perofa']")).sendKeys("899");
			//driver.findElement(By.cssSelector("input[name='numba']")).sendKeys("900");
			//driver.findElement(By.xpath("//*[@id='main']/div/div[1]/button[1]")).click();
			
			//driver.findElement(By.id("perof2")).sendKeys("00000000000011356");
			//driver.findElement(By.id("perofa2")).sendKeys("867.9038");
			//driver.findElement(By.id("numb2")).sendKeys("78740");
			//driver.findElement(By.xpath("//*[@id='main']/div/div[2]/button[1]")).click();
			
			//driver.findElement(By.id("perofa3")).sendKeys("0.0590");
			//driver.findElement(By.id("numb3")).sendKeys("-98");
			//driver.findElement(By.xpath("//*[@id='main']/div/div[2]/button[1]")).click();
			
			//driver.findElement(By.linkText("Scientific / Basic")).click();
			//driver.findElement(By.id("output")).click();
			//driver.findElement(By.xpath("//*[@id='main']/div[1]/div[1]/div[4]/button[1]")).click();
			//driver.findElement(By.xpath("//*[@id='main']/div[1]/div[1]/div[1]/button[2]")).click();
			
			
			
			
			
			
			
			
	
			
			
			
		


	}

}
