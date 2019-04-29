package mer.mano.Dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mer.mano.model.Category;

public class CategoryDaoTest {
static CategoryDao categorydao;
	

	@BeforeClass
	public static void initialize()
	{
	
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("mer.mano");
		context.refresh();
		categorydao=(CategoryDao)context.getBean("CategoryDao");
		
	}

	@Test
	public void testAddCategory() {
		Category category=new Category();
		//System.out.println("Testing");
		
		category.setCategoryName("COMPUTER ACCESSORIES");
		category.setCategoryDescription("All  COMPUTER ACCESSORIES ARE AVAILABLE ");
		//fail("Problem is adding Category\",categorydao.addCategory(category)");
		assertTrue("Problem is adding Category",categorydao.addCategory(category));
	}
       
		@Test
	public void testUpdateCategory() {

			Category category=categorydao.getCategory(2);
			category.setCategoryDescription("all brand");
			assertTrue("Problem is Updating  Category",categorydao.updateCategory(category));
		//fail("Problem in updating Category\",categorydao.updateCategory(category)");
	}
	@Ignore
	@Test
	public void testDeleteCategory() {

		Category category=categorydao.getCategory(565700);
		category.setCategoryDescription("All  COMPUTER ACCESSORIES ARE AVAILABLE ");
		assertTrue("Problem is deleting Category",categorydao.deleteCategory(category));
		
		//fail("Problem in deleting category\",categorydao.deleteCategory(category)");
	}
	@Ignore
	@Test
	public void testListCategories() {
		List<Category> listCategories=categorydao.listCategories();
		for(Category category:listCategories)
		{
			System.out.println(category.getCategoryName());
			System.out.println(category.getCategoryDescription());
			
		}
		


		fail("Problem in listing\",listCategories");
	}

}