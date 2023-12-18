package day03.DI3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEntry {
    public static void main(String[] args) {
        String config = "playerCtx.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
        PlayerImpl p =ctx.getBean("player",PlayerImpl.class);  // 형변환 방법1
        PlayerImpl p2 =ctx.getBean("p1",PlayerImpl.class);
        Soccer s = (Soccer) ctx.getBean("soccer"); // 형변환 방법2
        if(p==p2){
            System.out.println("same");
        } else {
            System.out.println("not same");
        }  // same 출력 - 스프링은 싱글톤패턴을 쓴다.

//        p.input();
//        p.info();

        String[] sportsName = {"축구","컬링","농구"};
        Object[] className = {ctx.getBean("soccer"),ctx.getBean("curling"),ctx.getBean("basketball")};
        for (int i = 0; i < sportsName.length; i++) {
            System.out.println(sportsName[i]);

            p.input();
            p.info();
            System.out.println("종목 : " + sportsName[i]);
            System.out.println();

        }

    }
}
