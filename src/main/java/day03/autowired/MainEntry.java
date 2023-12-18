package day03.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
    public static void main(String[] args) {
        ApplicationContext ctx = new GenericXmlApplicationContext("autowiredCtx.xml");

        MoniterViewer viewer = ctx.getBean("moniterViewer",MoniterViewer.class);
        viewer.print();

    }
}
