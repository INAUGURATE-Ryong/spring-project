package day04.AOP5_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
    public static void main(String[] args) {
        ApplicationContext ctx = new GenericXmlApplicationContext("AOPCtx2.xml");
        ICalc proxyCalc = (ICalc) ctx.getBean("proxy");
        System.out.println(proxyCalc.add(10,20));
        System.out.println(proxyCalc.mul(10,20));
        System.out.println(proxyCalc.sub(1,23,2));
    }
}
