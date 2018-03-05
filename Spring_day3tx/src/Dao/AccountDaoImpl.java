package Dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{

	@Override
	public void addmoney(Integer id, Double money) {
		// TODO Auto-generated method stub
		getJdbcTemplate().update("update account set money=money+? where id=?", money,id);
	}

	@Override
	public void dropmoney(Integer id, Double money) {
		// TODO Auto-generated method stub
		getJdbcTemplate().update("update account set money=money-? where id=?", money,id);
	}

}
