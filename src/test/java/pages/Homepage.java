package pages;


import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import commonfunctions.Base;
import locators.AllLocators;

public class Homepage {
	WebDriver driver;
	Base base;
	
	public Homepage(Base base) {
		this.base= base;
	}
	public void dashboard(String element)  {
		
		Boolean elementPresent= false;
		By elementOnUI= null;
		
		switch(element) {
		case "dashboard":
			elementOnUI=AllLocators.UIelement("dashboard");
		break;
		case "orders":
			elementOnUI=AllLocators.UIelement("orders");
		break;
		case "holdings":
			elementOnUI=AllLocators.UIelement("holdings");
		break;
		case "positions":
			elementOnUI=AllLocators.UIelement("positions");
		break;
		case "funds":
			elementOnUI=AllLocators.UIelement("funds");
		break;
		case "apps":
			elementOnUI=AllLocators.UIelement("apps");
		break;
		default :
			elementPresent= false;	
		}
		elementPresent= (base.getDriver().findElement(AllLocators.UIelement(element))).isDisplayed();
		if(elementPresent.equals(true)) {
			System.out.println("Pass");
		}else {
System.out.println("Fail");
		
	}
}
	public void buyStock() {
		
		WebElement allLists= base.getDriver().findElement(By.tagName("li"));
		WebElement allStocks= base.getDriver().findElement(By.xpath("//span[@class='nice-name']"));
//	allLists.
//		Actions action = new Actions(base.getDriver());
//		action.moveToElement(null);
		List <WebElement> watchlist = base.getDriver().findElements(AllLocators.watchlist);
		
		
		for(int i=1; i<watchlist.size()-1; i++) {
			List <WebElement>stocks= new LinkedList();
			stocks= base.getDriver().findElements(AllLocators.allStocks);
			System.out.println(stocks.size());
			System.out.println(allLists.isDisplayed());
			if(allLists.isDisplayed()) {
			for(int j=1; j<=stocks.size(); j++) {
				String allStocks1="//*[@id='app']/div[2]/div[1]/div/div[2]/div/div[";
				String allStocks2="]/div/div/span[1]/span/span";
				String ABC= base.getDriver().findElement(By.xpath(allStocks1+j+allStocks2)).getText();
				
				System.out.println(ABC);
				if (ABC.equals("PVR") ) {
					Actions action = new Actions(base.getDriver());
				action.moveToElement(allStocks);
				break;
				}			
			}	
}
			else {
					base.getDriver().findElement(By.xpath("//li["+i+"]")).click();
				}
			}
	
		System.out.println(watchlist);
//		System.out.println(stocks);
	}	
}

//public void buyStock() {
//	WebElement allLists= base.getDriver().findElement(By.tagName("li"));
//	WebElement allStocks= base.getDriver().findElement(By.xpath("//span[@class='nice-name']"));
//	List <WebElement> watchlist = base.getDriver().findElements(AllLocators.watchlist);
//	
//	for(WebElement list:watchlist) {
//		List <WebElement>stocks= new LinkedList();
//		stocks= base.getDriver().findElements(AllLocators.allStocks);
//	
//		for(int j=1; j<=stocks.size(); j++) {
//			String allStocks1="//*[@id='app']/div[2]/div[1]/div/div[2]/div/div[";
//			String allStocks2="]/div/div/span[1]/span/span";
//			String ABC= base.getDriver().findElement(By.xpath(allStocks1+j+allStocks2)).getText();
//			
//			System.out.println(ABC);
//			if (ABC.equals("PVR") ) {
//				Actions action = new Actions(base.getDriver());
//			action.moveToElement(allStocks);
//			break;
//			}
//	} list.click();
//		}
//	
//	}
//}