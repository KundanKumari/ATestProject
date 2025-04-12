package pack1;

import org.testng.annotations.Test;

public class ContactTest {
	
@Test
	public void crecteContactTest() {
	String Url=System.getProperty("url");
	String Browser=System.getProperty("browser", "chrome");
	String Username=System.getProperty("username");
	String Password=System.getProperty("password");

	System.out.println(Url);
	System.out.println(Browser);
	System.out.println(Username);
	System.out.println(Password);
	System.out.println("executed crecteContactTest");	

}
@Test
public void modifyCrecteContactTest() {
	System.out.println("executed modifyCrecteContactTest");	
}}
