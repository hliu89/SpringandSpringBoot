package tx;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Service.AccountService;

public class Demo {
AccountService as;
	@Test
	public void fun2() throws Exception {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		as=(AccountService) ac.getBean("accountService");
		as.transfer(1, 2, 100d);
	}
}
