package jdbctemplate;

import java.util.List;

import bean.User;

public interface UserDao {

	public void insert(User u);
	public void delete(int id);
	public void update(User u);
	public User getById(int id);
	public int getCount();
	public List<User> getAll();
	
}
