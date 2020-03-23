package testpackage;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.TestNGException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import PagesPackage.Mainpage;
import basepackage.base;
public class MainPageTest extends base

{
Mainpage mainpage;
public MainPageTest()

{
	super();
}


@BeforeMethod()
public void setup()
{
BrowserIntilization();	
mainpage = new Mainpage();
}
@Test(priority =1)
public void verifymobilenumber()
{
	/*System.out.println("_______________logging___________");*/
String mobilenumber=mainpage.verifymobilephn();
System.out.println(mobilenumber);
Assert.assertTrue(mobilenumber.equals("0123-456-789"));
}
	
@Test(priority =2)
public void validatesearchbox()
{
	
String title =mainpage.searchbox("jeans");

Assert.assertTrue(title.equals("Search - My Store"));
                              
}	
@AfterMethod()
public void teardown()
{
	driver.close();
}		
}
