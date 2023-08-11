package page;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;

public class Snapdealpage {
	WebDriver driver;
	Actions act;
    By signin= By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']");
	By login=By.xpath("//span[@class='accountBtn btn rippleWhite']/a");
	By iframeelement=By.id("loginIframe");
	By email=By.id("userName");
	By continuebut=By.xpath("//button[@id='checkUser']");
	By code=By.xpath("//form[@id='loginOtpUC']/div[1]/input");
	By continuebut2=By.xpath("//button[@id='loginUsingOtp']");
	By toy=By.xpath("//div[@id='leftNavMenuRevamp']/div[1]/div[2]/ul/li[4]/a/span[2]");
	By softtoy=By.xpath("//a[@href='https://www.snapdeal.com/products/kids-toys-soft-toys']/span");
	By sortby=By.xpath("//div[@class='sort-drop clearfix']");
	By lowtohigh=By.xpath("//ul[@class='sort-value']/li[2]");
	By pinkrabbit=By.xpath("//p[@title='Tickles Pink Cute Rabbit with Heart Stuffed Soft Plush Toy Kids Birthday 17 cm']");
	By addtocart=By.xpath("//div[@class='col-xs-6 marR15 btn btn-xl btn-theme-secondary rippleWhite buyLink']/span");
	By viewcart=By.xpath("//div[@id='cartProductContainer']/div/div[2]/div[2]/div/div[2]/div");
	By close=By.xpath("//*[@id=\"rtbScriptContainer\"]/div[1]/span/i");
	By menu=By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[1]/div/i");
	By sports=By.xpath("//*[@id=\"leftNavMenuRevamp\"]/div/div[2]/ul/li[10]/a/span");
	By yogamat=By.xpath("//*[@id=\"category9Data\"]/div[1]/div/div/p[8]/a/span");
	By leftslider=By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[1]/a[1]");
	By rightslider=By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[2]/div[3]/div/div[1]/a[2]");		
	By customerrating=By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[3]/div[3]/div/div[1]/label");
	By material=By.xpath("//label[@for='Material_s-PVC%20Foam']");
	By selectmat=By.xpath("//img[@title='Vector X 4mm PVC Printed Yoga Mat (Pink)']");
	By addtocartmat=By.xpath("//*[@id=\"add-cart-button-id\"]/span");
	By searchbar=By.id("inputValEnter");
	By fav1=By.xpath("//*[@id=\"680268680638\"]/div[1]/div/span/i");
	By fav2=By.xpath("//*[@id=\"685662106852\"]/div[1]/div/span/i");
	//By fav3=By.xpath("//*[//*[@id=\"677984820790\"]/div[1]/div/span/i");
	By profile=By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[2]/i");
	By shortlist=By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[1]/div/ul/li[2]/a");
	By sofacolor=By.xpath("//*[@id=\"attribute-select-0-685662106852\"]");
	By seatingcapacity=By.xpath("//*[@id=\"attribute-select-1-685662106852\"]");
	By selectpack=By.xpath("//*[@id=\"attribute-select-2-685662106852\"]");
	By addtocartsofa=By.xpath("//*[@id=\"listBuy-685662106852\"]/label");
	By proceed=By.xpath("//*[@id=\"checkout-continue\"]/input[2]");
	By pincode=By.xpath("//*[@id=\"zip\"]");
	By name=By.id("fullName");
	By address=By.id("address");
	By landmark=By.id("nearestLandmark");
	By city=By.id("city");
	By state=By.id("state");
	By addresstype= By.xpath("//*[@id=\"shipping-address-form\"]/div/div[10]/div/div[1]/label/span[1]");
	By checkbox=By.xpath("//*[@id=\"shipping-address-form\"]/div/div[11]/div/label/span/span");
	By savebutton=By.id("delivery-modes-continue");
	By proceedpay=By.id("make-payment");
	By cod=By.xpath("//*[@id=\"payment-nav-id\"]/div[4]/span");
	By myorder=By.xpath("//*[@id=\"content_wrapper\"]/div[4]/div[1]/div[1]/div[3]/div[2]/div/div/div/div[2]/a");
	By track=By.xpath("//*[@id=\"content_wrapper\"]/div[4]/div[5]/div[2]/div[3]/div/div[3]/div/div[5]");
	By logout=By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[1]/div/ul/li[4]/a");
	
	   public Snapdealpage(WebDriver driver) {
		   this.driver=driver;
	     }
		public void clicksigin() {
			act=new Actions(driver);
			WebElement s=driver.findElement(signin);
			act.moveToElement(s).perform();
			driver.findElement(login).click();
		}
		public void setvalues(String emailid)  {
			WebElement iframe=driver.findElement(iframeelement);
            driver.switchTo().frame(iframe);
            driver.findElement(email).sendKeys(emailid);
			driver.findElement(continuebut).click();
		}
		public void enterverficationcode() throws Exception {
			driver.findElement(code);
			Thread.sleep(25000);
			driver.findElement(continuebut2).click();
		}
		public void sortingtoys() {
			WebElement t=driver.findElement(toy);
			act.moveToElement(t).perform();
			driver.findElement(softtoy).click();
			driver.findElement(sortby).click();
			driver.findElement(lowtohigh).click();
		}
		public void addsofttoy() throws Exception {
			String parentwindow=driver.getWindowHandle();
			driver.findElement(pinkrabbit).click();
			Set<String>allwindows=driver.getWindowHandles();
			for(String handle:allwindows) {
				if(!handle.equals(parentwindow)) {
					driver.switchTo().window(handle);
					driver.findElement(addtocart).click();
					driver.findElement(viewcart).click();
					Thread.sleep(3000);
					driver.findElement(close).click();
					driver.close();
				}
				}driver.switchTo().window(parentwindow);
			}
		public void sportsfitnnessclick() throws Exception {
			WebElement hmenu=driver.findElement(menu);
			act.moveToElement(hmenu).perform();
			WebElement sportslink=driver.findElement(sports);
			act.moveToElement(sportslink).perform();
			driver.findElement(yogamat).click();
			Thread.sleep(4000);
			
		}
	    public void fiteryogamat() throws Exception {
			
			WebElement lefts=driver.findElement(leftslider);
			act.dragAndDropBy(lefts, 20, 0).perform();;
			Thread.sleep(4000);
			WebElement rights=driver.findElement(rightslider);
			act.dragAndDropBy(rights, -40, 0).perform();;
			Thread.sleep(4000);
			driver.findElement(customerrating).click();
			Thread.sleep(4000);
			driver.findElement(material).click();
			Thread.sleep(4000);
		}
	   public void addyogamat() throws Exception {
	 	
		String parentwindow=driver.getWindowHandle();
		driver.findElement(selectmat).click();
		Set<String>allwindows=driver.getWindowHandles();
		for(String handle:allwindows) {
			if(!handle.equals(parentwindow)) {
				driver.switchTo().window(handle);
				driver.findElement(addtocartmat).click();
				Thread.sleep(3000);
				driver.close();
			}
			}driver.switchTo().window(parentwindow);
		}
	
	 public void wishlistsofacover(String search) throws Exception {
		 driver.findElement(searchbar).sendKeys(search,Keys.ENTER);
		 driver.findElement(fav1).click();
		 Thread.sleep(3000);
		 driver.findElement(fav2).click();
		 Thread.sleep(3000);
	 }
	 public void selectshortlist() {
		 WebElement profileicon=driver.findElement(profile);
		 act.moveToElement(profileicon).perform();
		 driver.findElement(shortlist).click();
	 }
	 public void addsofacover() {
		 WebElement sofacol=driver.findElement(sofacolor);
		 sofacol.click();
		 sofacol.sendKeys(Keys.DOWN,Keys.ENTER);
		 
		 WebElement sofaseats=driver.findElement(seatingcapacity);
		 sofaseats.click();
		 Select sc2 =new Select(sofaseats);
		 sc2.selectByVisibleText("4 seater");
		
		 WebElement sofapack=driver.findElement(selectpack);
		 sofapack.click();
		 Select sc3 =new Select(sofapack);
		 sc3.selectByValue("pack of 1");
		 driver.findElement(addtocartsofa).click();
	 }
	 
	 public void proceedtopay() {
		driver.findElement(proceed) .click();
	 }
	 public void addshippingdetails(String pin,String name1,String address1,String landmark1,String city1,String state1) {
		 driver.findElement(pincode).sendKeys(pin);
		 driver.findElement(name).sendKeys(name1);
		 driver.findElement(address).sendKeys(address1);
		 driver.findElement(landmark).sendKeys(landmark1);
		 driver.findElement(city).sendKeys(city1);
		 driver.findElement(state).sendKeys(state1);
		 driver.findElement(addresstype).click();
	 }
	 public void savedetails() {
		 driver.findElement(checkbox).click();
		 driver.findElement(savebutton).click();
	 }
	 public void payment() {
		 driver.findElement(proceedpay).click();
		 driver.findElement(cod).click();
	 }
	 public void trackorder() {
		 WebElement profileicon=driver.findElement(profile);
		 act.moveToElement(profileicon).perform();
		 driver.findElement(myorder).click();
		 driver.findElement(track).click();
	 }
	 public void logout() {
		 WebElement profileicon=driver.findElement(profile);
		 act.moveToElement(profileicon).perform();
		 driver.findElement(logout).click();
	 }
	}





//sroll by pixel
