package gTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase6 
{

    WebDriver driver;

    @BeforeClass
    public void start() throws InterruptedException 
    {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--guest");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        Thread.sleep(2000);
    }

    @Test
    public void LowestPrice() throws InterruptedException 
    {

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(3000);
        System.out.println("Login successful");

        // Sort products Low to High
        driver.findElement(By.className("product_sort_container")).click();
        driver.findElement(By.xpath("//option[@value='lohi']")).click();

        Thread.sleep(2000);
        System.out.println("Products sorted in Low to High");

        // Get lowest price product
        String Product = driver.findElement(By.className("inventory_item_name")).getText();
        System.out.println("Lowest price product: " + Product);

        // Add lowest price product to cart
        driver.findElement(By.xpath("(//button[contains(text(),'Add to cart')])[1]")).click();

        Thread.sleep(2000);
        System.out.println("Product added to cart");

        // Go to cart
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(2000);

        // Verify product in cart
        String cartProduct = driver.findElement(By.className("inventory_item_name")).getText();
        Assert.assertEquals(cartProduct, Product);
        System.out.println("Cart verified");

        // Proceed to checkout
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);

        // Enter details
        driver.findElement(By.id("first-name")).sendKeys("Dev");
        driver.findElement(By.id("last-name")).sendKeys("D K");
        driver.findElement(By.id("postal-code")).sendKeys("600124");

        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        
        // Get cart price
        String cartPrice = driver.findElement(By.className("inventory_item_price")).getText();
        System.out.println("Cart price: " + cartPrice);

        Thread.sleep(2000);

        // Get checkout price
        String checkoutPrice = driver.findElement(By.className("inventory_item_price")).getText();
        System.out.println("Checkout Price: " + checkoutPrice);

        // Compare prices
        Assert.assertEquals(checkoutPrice, cartPrice);
        System.out.println("Price validated...Prices matched.");

        // Verify order summary
        String summary = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(summary, "Checkout: Overview");
        System.out.println("Checkout validated");

        Thread.sleep(2000);

        // Complete order
        driver.findElement(By.id("finish")).click();

        Thread.sleep(2000);

        // Verify order completion
        String completeText = driver.findElement(By.className("complete-header")).getText();
        Assert.assertEquals(completeText, "Thank you for your order!");
        System.out.println("Order placed successfully");
    }

    @AfterClass
    public void logOut() throws InterruptedException 
    {

        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("logout_sidebar_link")).click();
        System.out.println("Logout successful");

        Thread.sleep(2000);
        driver.quit();
    }
}