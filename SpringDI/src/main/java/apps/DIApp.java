package apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Emp;

public class DIApp {

	public static void main(String[] args)
	{
		ApplicationContext ctx= new ClassPathXmlApplicationContext("file:src/main/resources/appContext.xml");
		Emp e = (Emp) ctx.getBean("emp");
		
		System.out.println(e.toString());
		

	}

}
