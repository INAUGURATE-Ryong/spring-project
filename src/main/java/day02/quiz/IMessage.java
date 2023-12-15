package day02.quiz;

public interface IMessage {

    public void sayHello();
    public String sayMessage();
}
//해당 인터페이스를 인프리먼츠하는 클래스 만들기 - IMessageImplEng.java, IMessageImplEkor .....
//빈으로 객체 생성하기  -IMessageImplkor인사는 생성자 함수 이용, IMessageImplEng setter method 이용