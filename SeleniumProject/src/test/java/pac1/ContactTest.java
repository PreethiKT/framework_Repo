package pac1;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test
	public void createcontactTest()
	{

		String URL = System.getProperty("Url");
		String BROWSER = System.getProperty("Browser","Chrome");
		String USERNAME = System.getProperty("Username");
		String PASSWORD = System.getProperty("Password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("execute createcontactTest");
	}

	@Test
	public void modifycontactTest()
	{
		System.out.println("execute modifycontactTest");
	}

}
