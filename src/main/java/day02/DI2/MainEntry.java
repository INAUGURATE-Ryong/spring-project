package day02.DI2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
    public static void main(String[] args) {
        String config = "memberCtx.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config); // 설정파일

        MemberDAO dao = (MemberDAO)ctx.getBean("dao");
//		MemberDAO dao = ctx.getBean("dao", MemberDAO.class ); 형변환 위코드와 동일함

        dao.insert();


    }
}
