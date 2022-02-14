package TestCase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class UiBankTestingCases {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\a839717\\OneDrive - Atos\\Documents\\Home\\BA\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uibank.uipath.com/");
        WebElement ProductsButton = driver.findElement(By.id("navbarDropdown"));
        ProductsButton.click();
        WebElement loanButton = driver.findElement(By.className("dropdown-item"));
        loanButton.click();
        WebElement ApplyButton = driver.findElement(By.id("applyButton"));
        ApplyButton.click();
        WebElement emailBox = driver.findElement(By.name("email"));
        emailBox.sendKeys("uipath@gmail.com");
        WebElement amountBox = driver.findElement(By.name("amount"));
        amountBox.sendKeys("12000");
        WebElement selectElement = driver.findElement(By.id("term"));
        Select term = new Select(selectElement);
        term.selectByVisibleText("5");
        WebElement incomeBox = driver.findElement(By.name("income"));
        incomeBox.sendKeys("3000");
        WebElement ageBox = driver.findElement(By.name("age"));
        ageBox.sendKeys("35");
        WebElement submit = driver.findElement(By.id("submitButton"));
        submit.click();
        WebElement rate = driver.findElement(By.id("rateValue"));
        System.out.println(rate.getText());
        //driver.quit();

    }
}
