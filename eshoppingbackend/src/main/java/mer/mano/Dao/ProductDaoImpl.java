package mer.mano.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mer.mano.model.Product;
@Repository("ProductDao")
@Transactional
public class ProductDaoImpl implements ProductDao {
	 @Autowired
	 SessionFactory sessionFactory;


	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
			
			sessionFactory.getCurrentSession().save(product);
			return true;
		}
		catch(Exception e)
		{
		return false;
	}
	}

	@Override
	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
			
			sessionFactory.getCurrentSession().save(product);
			return true;
		}
		catch(Exception e)
		{
		return false;
	}
	}
	@Override
	public boolean updateCategory(Product product) {
		// TODO Auto-generated method stub
		try
		{
			
			sessionFactory.getCurrentSession().save(product);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}
	

	@Override
	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Product");
		List<Product> listProducts=query.list();
		session.close();
		return listProducts;
	}

	@Override
	public Product getProduct(int ProductId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Product product=(Product) session.get(Product.class, ProductId);
		session.close();
		return product;
	}

}
