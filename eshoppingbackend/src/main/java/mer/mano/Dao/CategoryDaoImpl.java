package mer.mano.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mer.mano.model.Category;

@Repository("CategoryDao")
@Transactional
@Service
public class CategoryDaoImpl implements CategoryDao {
	 @Autowired
	 SessionFactory sessionFactory;

	@Override
	public boolean addCategory(Category category) {
		// TODO Auto-generated method stub
		try
		{
			
			sessionFactory.getCurrentSession().save(category);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}
	

	@Override
	public boolean deleteCategory(Category category) {
		// TODO Auto-generated method stub
		try
		{
			
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e)
		{
		return false;
	}
	}
	@Override
	public boolean updateCategory(Category category) {
		// TODO Auto-generated method stub

		try
		{
			
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}

	}

	@Override
	public List<Category> listCategories() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Category");
		List<Category> listCategories=query.list();
		session.close();
		return listCategories;
		
	}

	@Override
	public Category getCategory(int CategoryId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Category category=(Category) session.get(Category.class, CategoryId);
		session.close();
		return category;
	}

}
