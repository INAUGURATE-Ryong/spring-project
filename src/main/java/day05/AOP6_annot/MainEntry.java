package day05.AOP6_annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEntry {
    public static void main(String[] args) {
        String config = "annotCtx1.xml";
        ApplicationContext ctx = new GenericXmlApplicationContext(config);

        Student student = ctx.getBean("student",Student.class);
        Worker worker = ctx.getBean("worker",Worker.class);

        student.getStudentInfo();
        System.out.println("-------------------------");
        worker.getWorkerInfo();

    }

}
