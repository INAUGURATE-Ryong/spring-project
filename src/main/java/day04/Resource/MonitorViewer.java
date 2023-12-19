package day04.Resource;


import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Qualifier;

/*
2.*********************
@Qualifier
목적 : @Autowired의 목적에서 동일 타입의 빈객체가 존재시 특정빈을 삽입할 수 있게 설정한다.
설정위치 : @Autowired 어노테이션과 함께 사용된다.
추가설정 : 동일타입의 빈객체 설정에서 <qualifier value="[alias명]" />를 추가하여 준다.
옵션 : name - alias명
3.*********************
@Required
목적 : 필수 [프로퍼티]를 지정
설정 위치 : setter메소드
추가설정 : RequiredAnnotationBeanPostProcessor 클래스를 빈으로 등록시켜줘야 한다.
해당 설정 대신에<context:annotation-config> 태그를 사용해도 된다.
 */

public class MonitorViewer {
    private Record record;


   // @Resource(name = "r3")  //name으로 찾는다
    @Resource @Qualifier("y")
    public void setRecord(Record record) {
        this.record = record;

   boolean recorder = Resource.class.getTypeName().contains("record1");//gradle은 javax말고 jakarta 쓰면 되는거 같음*/
        System.out.println(recorder);

        System.out.println(!Resource.class.getTypeName().contains("record1"));
        System.out.println(Resource.class.getTypeName().equals("record1"));

        System.out.println(Resource.AuthenticationType.class);
        System.out.println("-------------------------------------------------");
        record.show();
        System.out.println(record);
        System.out.println("@Resource 주입");
    }
}