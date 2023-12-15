package day02.quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
	public static void main(String[] args) {

		ApplicationContext  ctx =
				new ClassPathXmlApplicationContext("applicationContext.xml");

		IMessageImplkor beanKor = ctx.getBean("kor", IMessageImplkor.class);
		IMessageImplEng beanEng = (IMessageImplEng)ctx.getBean("eng");

		beanKor.sayHello();
		System.out.println(beanKor.sayMessage());
		System.out.println("******************************");
		beanEng.sayHello();
	}
}

