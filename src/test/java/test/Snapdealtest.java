package test;
import org.testng.annotations.Test;

import page.Snapdealpage;

public class Snapdealtest extends Baseclass{

	@Test
	public void test1() throws Exception {
		
		Snapdealpage bp=new Snapdealpage(driver);
		bp.clicksigin();
		bp.setvalues("greema23st@gmail.com");
		bp.enterverficationcode();
		bp.sortingtoys();
		bp.addsofttoy();
		bp.sportsfitnnessclick();
		bp.fiteryogamat();
		bp.addyogamat();
		bp.wishlistsofacover("sofa cover");
		bp.selectshortlist();
		bp.addsofacover();
		bp.proceedtopay();
		bp.addshippingdetails("500003","Greema","1-2-269G/1 SD road,Gunfoundry", "Apollo hospital","Hyderabad","Telangana");
		bp.savedetails();
		bp.payment();
		bp.trackorder();
		bp.logout();
		
	}
	
}
