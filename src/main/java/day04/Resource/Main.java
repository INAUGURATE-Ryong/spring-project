package day04.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


       ApplicationContext ctx = new GenericXmlApplicationContext("ResourceCtx.xml");


        MonitorViewer moniterViewer = (MonitorViewer) ctx.getBean("moniterViewer");
/*        moniterViewer.show();*/
    }
}
