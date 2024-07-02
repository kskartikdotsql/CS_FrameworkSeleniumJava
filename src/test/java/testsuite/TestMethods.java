package testsuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import repository.Repository;


public class TestMethods {
	
	@BeforeTest
	public static void verifyLaunch() throws Exception {
		Repository.Launch();
	}
	
	@Test
	public static void verifyLogin() {
		Repository.Login();
	}
	
	@AfterTest
	public static void verifyCloseApp() {
		Repository.TearDown();
	}
	
	
	
}
