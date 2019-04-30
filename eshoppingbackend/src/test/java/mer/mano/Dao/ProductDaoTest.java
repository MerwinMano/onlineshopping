package mer.mano.Dao;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mer.mano.model.Product;

public class ProductDaoTest {
static ProductDao productdao;
	

	@BeforeClass
	public static void initialize()
	{
	
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("mer.mano");
		context.refresh();
		productdao=(ProductDao)context.getBean("ProductDao");
	}
		

	@Test
	public void testAddProduct() {
		Product product=new Product();
		product.setProductName("Vivo V1");
		product.setProductDescription("A mobile with 4G and Volte option");
		product.setQuantity(10);
		product.setPrice(15000);
		product.setSupplierId(2);
		product.setCategoryid(1);
		assertTrue("Problem is adding Product",productdao.addProduct(product));
		//fail("Problem is adding Product",productdao.addProduct(product)");
	}

}
