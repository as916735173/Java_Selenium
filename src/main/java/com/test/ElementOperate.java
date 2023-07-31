package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementOperate {
    //将WebDriver作用于chromeDriver
    private static WebDriver chromeDriver;
    public static void main(String[] args) throws Exception{
        openChrome();
//        chromeDriver.findElement(By.id("kw")).sendKeys("test");
//        //等待3秒钟
//        Thread.sleep(3000);
//        chromeDriver.findElement(By.id("kw")).clear();
        // getTagName() 获取元素的标签名
        WebElement webElement1 = chromeDriver.findElement(By.id("kw"));
        System.out.println("得到元素的标签名：" + webElement1.getTagName());
        // getAttribute("maxlength") 根据属性名获取元素属性值
        System.out.println("得到元素maxlength属性：" + webElement1.getAttribute("maxlength"));

        WebElement webElement2 = chromeDriver.findElement(By.xpath("//a[text()='hao123']"));
        // getText() 获取当前元素的文本值
        System.out.println("得到元素的文本值：" + webElement2.getText());
        //isDisplayed() 查看元素是否显示
        System.out.println("查看元素是否显示：" + webElement2.isDisplayed());
    }
    public static void openChrome()throws Exception{

        System.setProperty("web-driver.chrome.driver", "/Users/admin/IdeaProjects/Java_Selenium/src/chromedriver");
        //1.打开chrome浏览器
        chromeDriver = new ChromeDriver();
        //2.访问https://www.baidu.com
        chromeDriver.get("https://www.baidu.com");
    }


}
