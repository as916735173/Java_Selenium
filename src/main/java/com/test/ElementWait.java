package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class ElementWait {
    //将WebDriver作用于chromeDriver
    private static WebDriver chromeDriver;
    public static void main(String[] args)throws Exception{
        openChrome();
        //在driver实例化完成之后设置隐式等待，设置超时的时间为5秒，等待时间不超过5秒都能进行下一步命令
        //隐式等待
//        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        chromeDriver.get("https://www.baidu.com");
        chromeDriver.findElement(By.id("kw")).sendKeys("知乎");
        chromeDriver.findElement(By.id("su")).click();
        //代码执行速度过快，UI元素没有立马显示加载出来，造成前后代码不同步，从而找不到元素，需要添加等待代码再执行下一步
        //硬性等待
        //Thread.sleep(1000);
        //显式等待
        WebDriverWait webDriverWait = new WebDriverWait(chromeDriver, Duration.ofSeconds(5));
        //页面元素在页面存在并且可见
//        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"1\"]/div/div[1]/h3/a[1]")));
        //页面元素是否在页面上可用和可被单击
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"1\"]/div/div[1]/h3/a[1]")));
        chromeDriver.findElement(By.xpath("//*[@id=\"1\"]/div/div[1]/h3/a[1]")).click();
        Thread.sleep(3000);
        chromeDriver.quit();
    }
    public static void openChrome() {

        System.setProperty("web-driver.chrome.driver", "/Users/admin/IdeaProjects/Java_Selenium/src/chromedriver");
        //1.打开chrome浏览器
        chromeDriver = new ChromeDriver();
        //2.访问https://www.baidu.com
        //chromeDriver.get("https://www.baidu.com");
    }
}
