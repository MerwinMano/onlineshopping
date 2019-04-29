package mer.mano.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mer.mano.Dao.CategoryDao;
import mer.mano.model.Category;

public class categorytest {

	public static void main(String args[])
	{
		System.out.println("Testings");
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("mer.mano");
		context.refresh();
		CategoryDao categorydao=(CategoryDao)context.getBean("CategoryDao");
		Category category=new Category();
		category.setCategoryName("Nuts");
		category.setCategoryDescription("Best Qualilty Products");
		categorydao.addCategory(category);
		System.out.println("Inserted successfully");
	}
}
