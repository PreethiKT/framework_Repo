package pac2;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test
	public void createOrgTest()
	{
		String URL = System.getProperty("Url");
		String BROWSER = System.getProperty("Browser","Chrome");
		String USERNAME = System.getProperty("Username");
		String PASSWORD = System.getProperty("Password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("execute createOrgTest");
	}

	@Test
	public void modifyOrgTest()
	{
		System.out.println("execute modifyOrgTest");
	}

}
