package day04.Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


       ApplicationContext ctx = new GenericXmlApplicationContext("QualifierCtx.xml");


        MoniterViewer moniterViewer = (MoniterViewer) ctx.getBean("moniterViewer");
        moniterViewer.show();
    }
}
