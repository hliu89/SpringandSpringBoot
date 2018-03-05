package Test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Mapper.UserMapper;
import pojo.User;

public class fun {

@Test
	public void testMapper() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		UserMapper userMapper=(UserMapper) ac.getBean("userMapper");
		User u=userMapper.queryUserById(260);
		System.out.println(u);
	}
}
