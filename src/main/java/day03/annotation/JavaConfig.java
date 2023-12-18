package day03.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration  // xml 설정파일 역할을 함 ex) ctx.xml, appCtx.xml...
public class JavaConfig {
    @Bean // bean생성
    public MyCats cat1() {   //MyCats cat1 = new MyCats();  / <bean id="cat1" class="day03.annotation.Mycats" /> 와 같은 역할
        ArrayList<String> hobbys = new ArrayList();
        hobbys.add("뒹굴기");
        hobbys.add("앞발들기");

        MyCats myCats = new MyCats("냥이",12,hobbys);
        myCats.setWeight(3.0);
        myCats.setColor("black");

        return myCats;

    }

    @Bean // bean생성
    public MyCats cat2() {   //MyCats cat1 = new MyCats();  / <bean id="cat1" class="day03.annotation.Mycats" /> 와 같은 역할
        ArrayList<String> hobbys = new ArrayList();
        hobbys.add("윙크");
        hobbys.add("뒷발들기");

        MyCats myCats = new MyCats("호로로로",3,hobbys);
        myCats.setWeight(2.3);
        myCats.setColor("white");

        return myCats;

    }
    @Bean
    public Cats catsInfo(){   ////Cats cat2 = new Cats();  / <bean id="cat2" class="day03.annotation.Cats" /> 와 같은 역할
        Cats cats = new Cats(this.cat1()); // ref = " "
        return cats;

    }
}
