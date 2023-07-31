package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpecilElementLocate_mouse {
    private static ChromeDriver chromeDriver;
    public static void main(String[] args)throws Exception{
        openChrome();
        //限制输入的时间日期控件操作
        chromeDriver.get("https://www.treejs.cn/v3/demo/cn/exedit/drag.html");
        //鼠标操作
        WebElement sourceElement = chromeDriver.findElement(By.id("treeDemo_2_span"));
        WebElement targetElement = chromeDriver.findElement(By.id("treeDemo_3_span"));
        //实例化Actions对象，鼠标的操作相关
        Actions actions = new Actions(chromeDriver);
        actions.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();

    }
    public static void openChrome()throws Exception{
        System.setProperty("web-driver.chrome.driver","/Users/admin/IdeaProjects/Java_Selenium/src/chromedriver");
        chromeDriver = new ChromeDriver();
    }
}
