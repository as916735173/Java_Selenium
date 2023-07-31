package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpecilElementLocate_upload {
    private static ChromeDriver chromeDriver;
    public static void main(String[] args)throws Exception{
        openChrome();
        //限制输入的时间日期控件操作
        chromeDriver.get("http://fhl.test.ccclubs.com/taxi-operator/#/login");
        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div/section/div[1]/div[2]/div/div/form/div[1]/div/div[1]/input")).sendKeys("admin_qZVhP7");
        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div/section/div[1]/div[2]/div/div/form/div[2]/div/div/input")).sendKeys("admin654");
        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div/section/div[1]/div[2]/div/div/form/div[4]/div/button")).click();
        Thread.sleep(3000);
        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[1]/div[1]/div[2]/span")).click();
        Thread.sleep(1000);
        chromeDriver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div[2]/ul/li[1]/span")).click();
        Thread.sleep(1000);
        chromeDriver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/div/section/div/button[1]")).click();
        Thread.sleep(1000);
        //文件上传
        chromeDriver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/form/div/div[14]/div/div/div/div/div[1]")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"main-content\"]/div[2]/div/form/div/div[14]/div/div/div/div/div[1]")).sendKeys("/Users/admin/Downloads/15267539856.png");
    }
    public static void openChrome()throws Exception{
        System.setProperty("web-driver.chrome.driver","/Users/admin/IdeaProjects/Java_Selenium/src/chromedriver");
        chromeDriver = new ChromeDriver();
    }
}
