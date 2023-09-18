package com.spring.mvc;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class melonbot {
	
	private WebDriver driver;
	private WebElement element;
	private String url;

	public static String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static String WEB_DRIVER_PATH = "C:/chromedriver/chromedriver.exe";
	
	public melonbot() {
		//Web Driver 경로 설정
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		
		//WebDriver Option 설정
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		
		driver = new ChromeDriver(options);
		
		url = "https://www.melon.com/chart/index.htm";
			
	}
	
	public void activateBot() {
		
		try {
			driver.get(url);
			
			Thread.sleep(2000);
			
			//곡 제목 파싱
			element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[3]/form/div/table/tbody/tr[1]/td[6]/div/div/div[1]/span/a"));
			String title = element.getAttribute("title");
			
			//가수 이름 파싱
			element = driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div[3]/form/div/table/tbody/tr[1]/td[6]/div/div/div[2]/a"));
			String artist = element.getAttribute("title");
			
			System.out.println("1위 노래는 [" + title + "]입니다.");
			System.out.println("1위 가수는 [" + artist + "]입니다.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			driver.close();
		}
	}
			
	public void main(String[] args) {
		melonbot bot1 = new melonbot();
		bot1.activateBot();
	}
	
}
