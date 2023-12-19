package day04.Qualifier;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@NoArgsConstructor

public class MoniterViewer {
    private Record record;

/*
    //@Inject (자바에서 제공 Auto wired랑 같은 기능을 구현함)
    @Autowired(required = false)  //true값이 default
    public MoniterViewer(@Qualifier("key") Record record)
    {
        this.record = record;
        System.out.println("Method call");
    }
*/

/*
@Autowired
@Qualifier("record4")  //id로 가져옴 /Ctx 파일안에 qualifer가 존재하면 안됨
    public void setRecord(Record record) {
        this.record = record;
    System.out.println("setRecord method call");
    }
*/

/*    @Autowired
    @Qualifier("rr1")  //name으로 가져옴 /Ctx 파일안에 qualifer가 존재하면 안됨
    public void setRecord(Record record) {
        this.record = record;
        System.out.println("setRecord method call");
    }*/

  /*  @Autowired
    @Qualifier("cord") //qualifier value = cord
    public void setRecord(Record record) {
        this.record = record;
        System.out.println("setRecord method call");
    }*/

    @Autowired
    public void setRecord(@Qualifier("rr1") Record record) {
        this.record = record;
        System.out.println("setRecord method call");
    }


    public void show()
    {
        record.show();
        System.out.println("Moniter Viewer class method call");
        System.out.println("setter method MoniterViewer class show method");
    }
}