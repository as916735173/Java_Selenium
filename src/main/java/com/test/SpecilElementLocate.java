package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class SpecilElementLocate {
    private static ChromeDriver chromeDriver;
    public static void main(String[] args)throws Exception{
        openChrome();
        //访问本地的HTML文件或者url
        //chromeDriver.get("https://www.baidu.com");
        //chromeDriver.get("https://www.sogou.com/");
        chromeDriver.get("https://www.fliggy.com/");
        //点击按钮
        //chromeDriver.findElement(By.id("su")).click();
        Thread.sleep(1000);
        //alert弹窗处理和confirm弹窗处理
        //switchTo().alert() 找到对应的alert弹框
        //Alert alert = chromeDriver.switchTo().alert();
        //确定
        //alert.accept();
        //取消
        //alert.dismiss();
        //iframe处理
        //在默认的页面找输入框输入数据
        //chromeDriver.findElement(By.id("kw")).sendKeys("知乎");
        //在第一个内嵌页面中定位袁术，输入数据
        //chromeDriver.switchTo().frame("bframe");
        //chromeDriver.findElement(By.id("bb")).sendKeys("知乎2");
        //在第二个内嵌页面中定位袁术，输入数据
        //chromeDriver.switchTo().frame("cframe");
        //chromeDriver.findElement(By.id("cc")).sendKeys("知乎3");
        //切换回到默认页面
        //chromeDriver.switchTo().defaultContent();
        //chromeDriver.findElement(By.id("kw")).sendKeys("知乎333");
        //windows处理
        /* chromeDriver.findElement(By.id("kw")).sendKeys("网易云音乐官网");
        chromeDriver.findElement(By.id("su")).click();
        Thread.sleep(3000);
        System.out.println("跳转前的窗口句柄：" + chromeDriver.getWindowHandle());
        //切换到b窗口
        chromeDriver.findElement(By.xpath("//*[@id=\"1\"]/div/div[1]/h3/a[1]")).click();
        //虽然页面已经切换到了B窗口，但是句柄还是在A窗口中，所以操作的还是A窗口
        Thread.sleep(10000);
        System.out.println("跳转厚的窗口句柄：" + chromeDriver.getWindowHandle());
        //句柄切换
        //进入到B窗口之后，获取到所有的窗口的句柄
        Set<String> handles = chromeDriver.getWindowHandles();
        //对窗口进行遍历
        for(String handle : handles){
            //切换句柄
            chromeDriver.switchTo().window(handle);
            //？？怎么知道不窗口的句柄呢
            if(chromeDriver.getCurrentUrl().equals("https://music.163.com/")){
                //如果标题符合的话跳出循环
                break;
            }
        }
        //对B窗口的元素进行定位
        chromeDriver.findElement(By.id("srch")).sendKeys("七里香");
        System.out.println("跳转厚的窗口句柄：" + chromeDriver.getWindowHandles()); */
        //select 下拉框处理
        /* chromeDriver.findElement(By.xpath("//*[@id=\"ariajgvsxbamrvc\"]")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"weather-city-btn\"]")).click();
        Thread.sleep(2000);
        //定位时间下拉框
        WebElement webElement=chromeDriver.findElement(By.id("weather-province"));
        //把WebElement封装成select对象
        Select select = new Select(webElement);
        select.selectByIndex(1);
        Thread.sleep(2000);
        select.selectByVisibleText("天津");*/
        //时间日期控件处理
        chromeDriver.findElement(By.xpath("//*[@id=\"J_FlightForm\"]/fieldset/div[3]/div/div/input")).sendKeys("2023-08-20");

    }
    public static void openChrome()throws Exception{
        System.setProperty("web-driver.chrome.driver","/Users/admin/IdeaProjects/Java_Selenium/src/chromedriver");
        chromeDriver = new ChromeDriver();
    }
}
