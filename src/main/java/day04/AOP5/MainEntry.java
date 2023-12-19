package day04.AOP5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
    public static void main(String[] args) {
        ApplicationContext ctx = new GenericXmlApplicationContext("AOPCtx2.xml");
        ICalc proxyCalc = (ICalc) ctx.getBean("proxy");
        System.out.println(proxyCalc.add(10,20));
        System.out.println(proxyCalc.mul(10,20));
        System.out.println(proxyCalc.sub(13,1,2));
    }
}
