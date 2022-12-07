package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\123\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805016%7Cb%7Cface%7C&placement=&creative=550525805016&keyword=face&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221112%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-10043720%26loc_physical_ms%3D9303927%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw7eSZBhB8EiwA60kCW2y3NzK8MUEe0vqYNkRJTbKK1thXnO5NkDFnZDdr5T1rkMlXlvAPxRoCLI0QAvD_BwE");
     Thread.sleep(1000);
     driver.switchTo().newWindow(WindowType.TAB);
     driver.get("https://open.spotify.com/playlist/6TpwDliETwXYHfWXFVaXZr");
     Thread.sleep(1000);
     driver.navigate().to("https://open.spotify.com/playlist/37i9dQZF1DXcBWIGoYBM5M");
     Thread.sleep(1000);
     driver.navigate().back();
     Thread.sleep(1000);
     driver.navigate().forward();
     Thread.sleep(1000);
     driver.navigate().refresh();
     Dimension a=new Dimension(100, 300);
     driver.manage().window().setSize(a);
     Thread.sleep(1000);
     Point f=new Point(200, 200);
     driver.manage().window().setPosition(f);
     Thread.sleep(1000);
     driver.manage().window().maximize();
     Thread.sleep(1000);
     driver.manage().window().minimize();
     Thread.sleep(1000);
     driver.manage().window().maximize();
     Thread.sleep(1000);
     driver.close();
     Thread.sleep(1000);
     driver.quit();
}
}


