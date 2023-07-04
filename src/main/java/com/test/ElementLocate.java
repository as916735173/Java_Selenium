package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocate {
    private static ChromeDriver chromeDriver;
    public static void main(String[] args)throws Exception{
        openChrome();

    }
    public static void openChrome()throws Exception{

        System.setProperty("web-driver.chrome.driver", "/Users/admin/IdeaProjects/Java_Selenium/src/chromedriver");
        //1.打开chrome浏览器
        WebDriver chromeDriver = new ChromeDriver();
        //2.访问https://www.baidu.com
        chromeDriver.get("https://www.baidu.com");
        //关闭并退出浏览器
//        Thread.sleep(3000);
//        chromeDriver.quit ();
        //根据id定位到百度搜索框，并输入数据--唯一的
        //chromeDriver.findElement(By.id("kw")).sendKeys("test");
        //根据name定位到百度搜索框，并输入数据--重复的
        //chromeDriver.findElement(By.name("wd")).sendKeys("test");
        //根据tagName定位到百度搜索框，并输入数据--找到的元素会有多个，不推荐使用
        //chromeDriver.findElement(By.tagName("input")).sendKeys("test");
        //根据className定位到百度搜索框，并输入数据
        //chromeDriver.findElement(By.className("s_ipt")).sendKeys("test");
        //chromeDriver.findElement(By.className("s_btn")).click();
        //根据linkText定位到百度"新闻"元素，并点击---超链接的完整文本
        //chromeDriver.findElement(By.linkText("新闻")).click();
        //根据partialLinkText定位到百度"新闻"元素，并点击---超链接的部分文本
        //chromeDriver.findElement(By.partialLinkText("新闻")).click();

        //cssSelector元素定位
        //(1)tagName定位
        //chromeDriver.findElement(By.cssSelector("input"));
        //(2)id定位
        //chromeDriver.findElement(By.cssSelector("#kw")).sendKeys("test");
        //(3)className定位
        //chromeDriver.findElement(By.cssSelector(".s_ipt")).sendKeys("test");
        //chromeDriver.findElement(By.cssSelector(".bg.s_btn")).click();
        //精确定位
        //chromeDriver.findElement(By.cssSelector("input[maxlength = '255']")).sendKeys("test");
        //多属性定位
        //chromeDriver.findElement(By.cssSelector("input[maxlength = '255'][autocomplete = 'off']")).sendKeys("test");

        //xpath元素定位
        //chromeDriver.findElement(By.xpath("//input[@maxlength = '255' and @autocomplete = 'off']")).sendKeys("test");
        chromeDriver.findElement(By.xpath("//a[contains(text(),'hao123')]")).click();
    }
    public static void setChromeDriver(ChromeDriver chromeDriver) {
        ElementLocate.chromeDriver = chromeDriver;
    }
}
