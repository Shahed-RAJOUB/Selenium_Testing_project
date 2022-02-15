package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;


public class UiBankTestingCases {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\a839717\\OneDrive - Atos\\Documents\\Home\\BA\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
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
        // This verification is not possible without the delay
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement rate = driver.findElement(By.id("rateValue"));
        System.out.println(rate.getText());

        // Successful Scenario
        assertEquals("8", rate.getText());

        ProductsButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loanButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // exception stale element reference: element is not attached to the page document //It is hard to reuse Web elements not possible
        WebElement ApplyButton1 = driver.findElement(By.id("applyButton"));
        ApplyButton1.click();
        WebElement emailBox1 = driver.findElement(By.name("email"));
        emailBox1.sendKeys("uipath@gmail.com");
        WebElement amountBox1 = driver.findElement(By.name("amount"));
        amountBox1.sendKeys("15000");
        WebElement selectElement1 = driver.findElement(By.id("term"));
        Select term1 = new Select(selectElement1);
        term1.selectByVisibleText("10");
        WebElement incomeBox1 = driver.findElement(By.name("income"));
        incomeBox1.sendKeys("30000");
        WebElement ageBox1 = driver.findElement(By.name("age"));
        ageBox1.sendKeys("35");
        WebElement submit1 = driver.findElement(By.id("submitButton"));
        submit1.click();
        // This verification is not possible without the delay
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement rate1 = driver.findElement(By.id("rateValue"));
        System.out.println(rate1.getText());

        // Successful Scenario
        assertEquals("6", rate1.getText());

        ProductsButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loanButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // exception stale element reference: element is not attached to the page document //It is hard to reuse Web elements not possible
        WebElement ApplyButton2 = driver.findElement(By.id("applyButton"));
        ApplyButton2.click();
        WebElement emailBox2 = driver.findElement(By.name("email"));
        emailBox2.sendKeys("");
        WebElement amountBox2 = driver.findElement(By.name("amount"));
        amountBox2.sendKeys("150000");
        WebElement selectElement2 = driver.findElement(By.id("term"));
        Select term2 = new Select(selectElement2);
        term2.selectByVisibleText("10");
        WebElement incomeBox2 = driver.findElement(By.name("income"));
        incomeBox2.sendKeys("30000");
        WebElement ageBox2 = driver.findElement(By.name("age"));
        ageBox2.sendKeys("35");
        WebElement submit2 = driver.findElement(By.id("submitButton"));
        submit2.click();
        // This verification is not possible without the delay
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement Msg = driver.findElement(By.id("notApproved"));
        System.out.println(Msg.getText());

        // Above Loan limit Scenario
        assertEquals("Sorry, at this time you have not been approved for a loan.", Msg.getText());

        ProductsButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loanButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // exception stale element reference: element is not attached to the page document //It is hard to reuse Web elements not possible
        WebElement ApplyButton3 = driver.findElement(By.id("applyButton"));
        ApplyButton3.click();
        WebElement emailBox3 = driver.findElement(By.name("email"));
        emailBox3.sendKeys("");
        WebElement amountBox3 = driver.findElement(By.name("amount"));
        amountBox3.sendKeys("15000");
        WebElement selectElement3 = driver.findElement(By.id("term"));
        Select term3 = new Select(selectElement3);
        term3.selectByVisibleText("10");
        WebElement incomeBox3 = driver.findElement(By.name("income"));
        incomeBox3.sendKeys("30000");
        WebElement ageBox3 = driver.findElement(By.name("age"));
        ageBox3.sendKeys("16");
        WebElement submit3 = driver.findElement(By.id("submitButton"));
        submit3.click();
        // This verification is not possible without the delay
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement Msg1 = driver.findElement(By.id("notApproved"));
        System.out.println(Msg1.getText());

        // Above age limit Scenario
        assertEquals("Sorry, at this time you have not been approved for a loan.", Msg1.getText());
        driver.quit();

    }
}
