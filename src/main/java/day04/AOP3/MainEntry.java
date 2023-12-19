package day04.AOP3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
    public static void main(String[] args) {

        String config = "classpath:AOPappCtx.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);

        //Proxy 만들고 객체를 넘긴다. 필요한 객체 생성 작업은 XML 설정했음
        InterCalc proxy = ctx.getBean("proxy",InterCalc.class);
        System.out.println(proxy.add(20,30));
        System.out.println(proxy.sub(1,2,3));
        System.out.println(proxy.mul(30,20));

    }
}
