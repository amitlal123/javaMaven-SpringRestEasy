package mavenspringresteasytestpkg;

import static org.junit.Assert.*;

import org.junit.Test;

import mavenspringresteasypkg.SpringRestEasyAPI.controller.HomeController;

import java.io.IOException;

public class HomeControllerTest {

	
	@Test
	public void testTest() throws IOException {
		HomeController homeCtrl = new HomeController();
		assertEquals("home", homeCtrl.test(null).getViewName());
		
	}

}
