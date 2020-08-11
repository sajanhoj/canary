package pages

import org.junit.Assert
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

public class canaryLogin {
    WebDriver driver
    private String _websiteUrl = "https://issues.twinthread.com/board"
    final static By email = By.name('Email')
    final static By password = By.name('Password')
    final static By submitButton = By.cssSelector("button.ant-btn.ant-btn-primary")
    final static By searchAllTickets = By.cssSelector("input.sc-EHOje.sc-eNQAEJ.iHVWai")
    final static By issue = By.id("card")
    final static By comment = By.id("commentInput")

     public void canaryLogin1(String id, String pass) {

         System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver")
         driver = new ChromeDriver()
         driver.manage().window().maximize()
         driver.navigate().to(_websiteUrl)
         driver.manage().timeouts().implicitlyWait(3)
         driver.findElement(email).click()
         driver.findElement(email).sendKeys(id)
         driver.findElement(password).click()
         driver.findElement(password).sendKeys(pass)
         driver.findElement(submitButton).click()
         driver.manage().timeouts().implicitlyWait(3)
         Assert.assertTrue(driver.pageSource.contains('ALL'))
         Assert.assertTrue(driver.pageSource.contains('Started'))
         Assert.assertTrue(driver.pageSource.contains('Completed'))
     }

    public void appendComment() {
        driver.findElement(searchAllTickets).click()
         driver.findElement(searchAllTickets).sendKeys('screen')
         driver.findElement(issue).click()
         driver.findElement(comment).click()
         driver.findElement(comment).sendKeys('comments')
         driver.findElement(comment).sendKeys(Keys.ENTER)
    }
}
