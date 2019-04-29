package mer.mano.Dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import junit.framework.TestCase;

public class DBconfigTest extends TestCase {
	public static void main (String arg[])
	{
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("mer.mano");
		System.out.println("sucessfully configured");
		context.refresh();

	}

}
