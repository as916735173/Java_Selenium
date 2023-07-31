package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecilElementLocate_date {
    private static ChromeDriver chromeDriver;
    public static void main(String[] args)throws Exception{
        openChrome();
        //限制输入的时间日期控件操作
        chromeDriver.get("https://www.12306.cn/index/");
        //javascript执行对象
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)chromeDriver;
        javascriptExecutor.executeScript("document.getElementById('train_date').removeAttribute('readonly')");
        chromeDriver.findElement(By.id("train_date")).clear();
        chromeDriver.findElement(By.id("train_date")).sendKeys("2023-08-10");
    }
    public static void openChrome()throws Exception{
        System.setProperty("web-driver.chrome.driver","/Users/admin/IdeaProjects/Java_Selenium/src/chromedriver");
        chromeDriver = new ChromeDriver();
    }
}
