package mer.mano.Dao;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mer.mano.model.User;

public class UserDaoTest {
static UserDao userdao;
	

	@BeforeClass
	public static void initialize()
	{
	
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("mer.mano");
		context.refresh();
		userdao=(UserDao)context.getBean("UserDao");
	}

	@Test
	public void testregisterUser() {
		User user = new User();
		user.setUsername("Merwin");
		user.setUserpassword("mer123");
		user.setEnabled("True");
		//fail("Not yet implemented");
		assertTrue("Problem is registering User",userdao.registerUser(user));
	}

}
