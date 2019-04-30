package mer.mano.Dao;

import mer.mano.model.User;

public interface UserDao {
	public boolean registerUser(User user);
	public boolean modifyUser(User user);
	public User getUser(String username);
	

}
