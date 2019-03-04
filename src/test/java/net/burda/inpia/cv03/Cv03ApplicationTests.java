package net.burda.inpia.cv03;

import net.burda.inpia.cv03.controller.HelloWorldController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Cv03Application.class})
public class Cv03ApplicationTests {

	@Autowired
	HelloWorldController helloWorldController;

	@Test
	public void contextLoads() {
		Assert.assertNotNull(helloWorldController);
	}

}
