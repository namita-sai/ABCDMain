package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Amazon {
 
  public void ajio_Test() throws InterruptedException 
  {
	  WebDriver driver = new EdgeDriver();
	  driver.get("https://www.amazon.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  System.out.println("namita new comment");
	  driver.close();
	  }
}
