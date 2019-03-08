package com.example.GreetingsApp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GreetingsAppApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Test
	public void testThatIsGoingToFail(){
		assertTrue("This is failing on purpose!", true);
	}

}

