package a;

import static org.junit.Assert.*;

import javax.ws.rs.core.MediaType;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		System.out.println(AllTests.service);
		AllTests.token = AllTests.service.path("Admin").path("createCompanyService").queryParam("User", "Admin")
				.queryParam("PW", "Admin").queryParam("name", "Rest1").queryParam("CompanyPw", "Rest1").queryParam("Email", "Rest1").accept(MediaType.TEXT_HTML)
				.get(String.class);//(Company.class) - for unmarshalling 
		System.out.println("Token: " + AllTests.token);
		
		assertEquals("error: Name exists", AllTests.token);
		
		//fail("got here");
	}

}
