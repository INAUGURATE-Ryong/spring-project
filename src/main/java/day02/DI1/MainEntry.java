package day02.DI1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
    public static void main(String[] args) {
        ApplicationContext context =
//                new ClassPathXmlApplicationContext(new String[] {"xxxx.xml","ssss.xml"});  //이런식으로도 가능
                new ClassPathXmlApplicationContext("appCtx.xml"); // 설정파일 기재 -xml기반
        IRcordViewImpl view = (IRcordViewImpl)context.getBean("view");
//        IRcordViewImpl view = context.getBean("view",IRcordViewImpl.class);
        view.print();



//        IRecordImpl record = new IRecordImpl();
//        IRcordViewImpl view = new IRcordViewImpl();
//
//        // 조립
//        view.setRecord(record);
//        view.input();
//        view.print();
    }
}
