package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementOperate {
    //将WebDriver作用于chromeDriver
    private static WebDriver chromeDriver;
    public static void main(String[] args) throws Exception{
        openChrome();
        chromeDriver.findElement(By.id("kw")).sendKeys("test");
        //等待3秒钟
        Thread.sleep(3000);
        chromeDriver.findElement(By.id("kw")).clear();
    }
    public static void openChrome()throws Exception{

        System.setProperty("web-driver.chrome.driver", "/Users/admin/IdeaProjects/Java_Selenium/src/chromedriver");
        //1.打开chrome浏览器
        chromeDriver = new ChromeDriver();
        //2.访问https://www.baidu.com
        chromeDriver.get("https://www.baidu.com");

        //关闭并退出浏览器
//        Thread.sleep(3000);
//        chromeDriver.quit ();
    }


}
