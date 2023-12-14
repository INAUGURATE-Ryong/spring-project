package day01.nonDI2;

public class MainEntry {
    //객체의 생성이 서로 독립적
    //필요시 객체의 주소만 주입
    public static void main(String[] args) {
        NewRecordView view = new NewRecordView();
        NewRecord record = new NewRecord(10,20,30,40);

        view.setRecord(record);
        view.print();

    }
}

//       is-a       ,      has-a
//       상속             포함관계

/*
 * has-a 관계(포함) vs is-a 관계(상속)
 * 1. has-a 관계(포함)
 *    - A has a B = A 가 B 를 포함한다 로 표현 가능한 관계
 *    - 가장 일반적인 객체간의 관계
 *    - 특정 클래스 내에서 다른 클래스의 인스턴스를 생성하여
 *      해당 인스턴스를 다루는 관계
 *    - 예) 자동차 - 엔진, 스마트폰 - 카메라
 *
 * 2. is-a 관계(상속)
 *    - A is a B = A 는 B 이다 로 표현 가능한 관계
 *    - 특정 클래스가 다른 클래스를 상속받아
 *      해당 클래스의 멤버를 선언없이 다루는 관계
 *    - 예) 자동차 - 소방차, 핸드폰 - 스마트폰
 */

//has-a 관계를 통해서 객체 다루기