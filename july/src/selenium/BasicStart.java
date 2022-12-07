package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicStart {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
     driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwiSwdLWysH6AhVFNSsKHa4dCjQYABAAGgJzZg&ohost=www.google.com&cid=CAESa-D2hG5yo5jhQJjRfK2-4RbI2OFqrP-w3CHVw7-7qwPevmR5Vh4KELvEpyGAfEEbYlqPrNP-GdWhxXd-4cSEyYAsITnIqTXxnFVcMNTn_ol7Zs4THr0LIdY2gqSr1DR7MqWFRXHKDv7PvWP-&sig=AOD64_2AT79czlnZJgsz7llY4AM1XQkJtg&q&adurl&ved=2ahUKEwjNjcvWysH6AhWnC7cAHaIMBJEQ0Qx6BAgDEAE");
     Thread.sleep(1000);
     driver.navigate().to("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
     Thread.sleep(1000);
     /*driver.navigate().back();
     Thread.sleep(1000);
     driver.navigate().forward();
     Thread.sleep(1000);
     driver.navigate().refresh();*/
     Dimension s=new Dimension(100, 300);
     driver.manage().window().setSize(s);
     Thread.sleep(3000);
     Point f=new Point(200, 300);
     driver.manage().window().setPosition(f);
    /* String title = driver.getTitle();
     System.out.println(title);
     String exptitle="Sign up for Facebook | Facebook";
     		if(title.equals(exptitle)) {
     			System.out.println("navigated to correct page");
     		}
     		else {
     			System.out.println("navigated to wrong page");
     		}
     		Thread.sleep(2000);
     		driver.manage().window().maximize();
     		Thread.sleep(1000);
            driver.manage().window().minimize();
            Thread.sleep(3000);
            driver.manage().window().maximize();
     driver.switchTo().newWindow(WindowType.TAB);
     driver.get("https://www.instagram.com/");
     String ans=driver.getCurrentUrl();
     System.out.println(ans);
     String expans="https://www.instagram.com/";
     if(ans.equals(expans)) {
    	 System.out.println("Navigated to right page");
     }
     else {
    	 System.out.println("wrong page");
     }
       		Thread.sleep(4000);
       		driver.close();
            driver.quit();*/
}
}
