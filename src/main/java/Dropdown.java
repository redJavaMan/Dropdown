import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
        WebElement currency = driver.findElement(By.xpath("//div[text()='Currency']"));
        currency.click();
        WebElement eur = driver.findElement(By.xpath("//div[text()='EUR']"));
        eur.click();
        WebElement passengers = driver.findElement(By.xpath("//div[text()='Passengers']"));
        passengers.click();
        int i = 1;
        while (i<=4){
            driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
            i++;
            Thread.sleep(3000);
        }
        for(int j=0;j<=3;j++ ){
            driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click();
            Thread.sleep(3000);
        }

        int n = 0;
        while (n<=2){
            driver.findElement(By.xpath("//div[@data-testid='Infant-testID-plus-one-cta']")).click();
            n++;
            Thread.sleep(3000);
        }

        System.out.println("Adults : "+driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-adyw6z r-q4m81j']")).getText());
        System.out.println("Childrens : "+driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-q4m81j'])[2]")).getText());
        System.out.println("Infants : "+driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-q4m81j'])[3]")).getText());
        WebElement departDate = driver.findElement(By.xpath("//div[text()='Departure Date']"));
        departDate.click();
        WebElement date = driver.findElement(By.xpath("//div[@data-testid='undefined-month-April-2022'] //div[text()='29']"));
        date.click();
        driver.quit();
    }

}
