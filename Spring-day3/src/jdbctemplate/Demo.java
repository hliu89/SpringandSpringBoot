package jdbctemplate;




import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import bean.User;
public class Demo {
	private UserDao ud;
@Test
public void fun1() throws Exception {
	//1.创建连接池
	ComboPooledDataSource dataSource=new ComboPooledDataSource();
	dataSource.setDriverClass("com.mysql.jdbc.Driver");
	//jdbc:mysql://127.0.0.1:3306/t2
	dataSource.setJdbcUrl("jdbc:mysql:///mybatis");
	dataSource.setUser("root");
	dataSource.setPassword("qwasqwas2271");
	//2.创建模板对象
	JdbcTemplate jt=new JdbcTemplate();
	jt.setDataSource(dataSource);
	//3.执行sql
	String sql=" insert into user (username,birthday,address,sex) values('rose',null,null,null)";
	jt.update(sql);
	
}
@Test
public void fun2() throws Exception {
	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	ud=(UserDao) ac.getBean("userDao");
	User u=new User();
	u.setName("tom");
	ud.insert(u);
}
}
