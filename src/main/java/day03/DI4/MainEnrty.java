package day03.DI4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class MainEnrty {
    public static void main(String[] args) {
        String config = "personCtx.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        EmployeePersonImpl emp = ctx.getBean("employee",EmployeePersonImpl.class);
        StudentPersonImpl stu = ctx.getBean("student",StudentPersonImpl.class);
        MyInfomation info = ctx.getBean("info",MyInfomation.class);

        emp.personShow(emp);
        stu.personShow(stu);
        stu.personShow(stu);
//        info.processMessage(stu);
//        info.processMessage("홍길",30,"남자");
//        System.out.println("======================");
////        info.setPerson(new StudentPersonImpl());
//        ArrayList<String> hobbys = new ArrayList();
//        hobbys.add("aa");
//        hobbys.add("bb");
//        hobbys.add("cc");
//
//        MyInfomation info2 = ctx.getBean("info2",MyInfomation.class);
//        emp.personShow(hobbys);
//        info2.processMessage(emp);

    }
}
