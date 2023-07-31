package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverOperate {
    //将WebDriver作用于chromeDriver
    private static WebDriver chromeDriver;
    public static void main(String[] args) throws Exception{
        openChrome();
        //get(String url) 访问指定url页面
        //getCurrentUrl() 获取当前页面的url地址
        //System.out.println("当前的url：" + chromeDriver.getCurrentUrl());
        //getTitle()获取当前页面的标题
        //System.out.println("当前的标题：" + chromeDriver.getTitle());
        //getPageSource()获取当前页面源代码
        //System.out.println("当前的标题：" + chromeDriver.getPageSource());
        //quit()关闭驱动对象一起所有相关窗口
        //chromeDriver.quit();
        //close()关闭当前窗口
        //chromeDriver.close();
        //getWindowHandle()返回当前页面句柄
//        chromeDriver.findElement(By.id("kw")).sendKeys("知乎");
//        chromeDriver.findElement(By.id("su")).click();
//        System.out.println("新窗口打开前的句柄："+ chromeDriver.getWindowHandle());
//        System.out.println("新窗口打开前的所有句柄："+ chromeDriver.getWindowHandles());
//        Thread.sleep(2000);
//        chromeDriver.findElement(By.xpath("//*[@id=\"1\"]/div/div[1]/h3/a[1]")).click();
//        Thread.sleep(2000);
//        System.out.println("新窗口打开后的句柄："+ chromeDriver.getWindowHandle());
//        System.out.println("新窗口打开后的所有句柄："+ chromeDriver.getWindowHandles());
        //getWindowHandles()返回所有由驱动对象打开页面的所有句柄，页面不同，句柄不一样
        //manage()此方法可以获取Options--浏览器菜单操作对象 driver.manage().windows()
        WebDriver.Options options = chromeDriver.manage();
        //fullscreen()全屏显示窗口
        //options.window().fullscreen();
        //maximize()最大化显示
        options.window().maximize();
        //获取当前窗口的高和宽
        Dimension dimension= options.window().getSize();
        System.out.println("窗口高度："+ dimension.getHeight());
        System.out.println("窗口高度："+ dimension.getWidth());
        //获取当前串口的x和y轴
        System.out.println("窗口x轴："+ options.window().getPosition().getX());
        System.out.println("窗口Y轴："+ options.window().getPosition().getY());
        //navigate对象
        WebDriver.Navigation navigation = chromeDriver.navigate();
        //访问京东
        navigation.to("https://www.jd.com");
        //刷新网页
        navigation.refresh();
        //回退
        navigation.back();
        //前进
        navigation.forward();

    }
    public static void openChrome()throws Exception{

        System.setProperty("web-driver.chrome.driver", "/Users/admin/IdeaProjects/Java_Selenium/src/chromedriver");
        //1.打开chrome浏览器
        chromeDriver = new ChromeDriver();
        //2.访问https://www.baidu.com
        chromeDriver.get("https://www.baidu.com");
    }


}
