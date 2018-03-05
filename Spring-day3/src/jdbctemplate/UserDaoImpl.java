package jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import bean.User;

public class UserDaoImpl implements UserDao {

	private JdbcTemplate jt;
	@Override
	public void insert(User u) {
		// TODO Auto-generated method stub

		String sql="insert into user2 values(null,?)";
		jt.update(sql, u.getName());
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

		String sql="delete from user2 where id=?";
		jt.update(sql, id);
	}

	@Override
	public void update(User u) {
		// TODO Auto-generated method stub

		String sql="update user2 set name=? where id=?";
		jt.update(sql,u.getName(),u.getId());
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		String sql="select * from user2 where id=?";
		return jt.queryForObject(sql, new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				User u=new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				return u;
			}}, id);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		String sql="select count(*) from user2";
		return jt.queryForObject(sql, Integer.class);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		String sql="select * from user2";
		List<User> list=jt.query(sql, new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				User u=new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				return u;
			}});
		return list;
	}

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	

}
