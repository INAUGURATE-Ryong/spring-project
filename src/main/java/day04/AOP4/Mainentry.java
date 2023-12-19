package day04.AOP4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainentry {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AOPCtx.xml");

        IMessageBean msg = context.getBean("messageBeanImpl",IMessageBean.class);
        msg.sayHello();
        System.out.println("==========================");
        msg.engHello();

        System.out.println("==========================");
        IBookBean book = (IBookBean) context.getBean("bookBeanImpl");
        book.testHello("encore be01");
        System.out.println();
        System.out.println(book.korHello());;
    }
}
