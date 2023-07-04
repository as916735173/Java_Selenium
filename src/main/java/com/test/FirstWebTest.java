package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstWebTest {
    public static void main(String[] args)throws Exception{
        openFireFox();
    }
    public static void openChrome()throws Exception{
        System.setProperty("web-driver.chrome.driver", "/Users/admin/IdeaProjects/Java_Selenium/src/chromedriver");
        //1.打开chrome浏览器
        WebDriver driver = new ChromeDriver();
//        ChromeDriver chromeDriver = new ChromeDriver();
//        FirefoxDriver firefoxDriver = new FirefoxDriver();
//        EdgeDriver edgeDriver = new EdgeDriver();
        //2.访问https://www.baidu.com
        driver.get("https://www.baidu.com");
        //关闭并退出浏览器
        Thread.sleep(3000);
        driver.quit ();
    }
    public static void openFireFox()throws Exception{
        System.setProperty("web-driver.firefox.bin","/Applications/Firefox.app/Contents/MacOS/firefox-bin/Applications/Firefox.app/Contents/MacOS/firefox-bin");
        //1.打开FireFox
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.baidu.com");
        Thread.sleep(3000);
        firefoxDriver.quit();
    }
}
