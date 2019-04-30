package mer.mano.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mer.mano.model.User;
@Repository("UsertDao")
@Transactional
public class UserDaoImpl implements UserDao {
	@Autowired
	 SessionFactory sessionFactory;


	@Override
	public boolean registerUser(User user) {
		
		// TODO Auto-generated method stub
		try
		{
			
			sessionFactory.getCurrentSession().save(user);
			return true;
		}
		catch(Exception e)
		{
		return false;
	}
	}
	@Override
	public boolean modifyUser(User user) {
		// TODO Auto-generated method stub
		try
		{
			
			sessionFactory.getCurrentSession().save(user);
			return true;
		}
		catch(Exception e)
		{
		return false;
	}
	}
	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		User user=(User) session.get(User.class, username);
		session.close();
		return user;
	}

}
