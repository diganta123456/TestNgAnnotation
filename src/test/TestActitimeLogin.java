package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

public class TestActitimeLogin extends BaseTest
{
	@Test
	public void login()
	{
		Reporter.log("execution of login() is started",true);
	}
}
