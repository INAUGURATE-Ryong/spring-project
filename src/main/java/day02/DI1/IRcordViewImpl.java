package day02.DI1;

import java.util.Scanner;

public class IRcordViewImpl implements IRcordView {
    private IRecordImpl record;

    public void setRecord(IRecordImpl record) {
        this.record = record;
    }

    //생성자 함수이용 방법, setter method 주입 방법
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("kor : ");  record.setKor(sc.nextInt());
        System.out.print("eng : ");  record.setEng(sc.nextInt());
        System.out.print("com : ");  record.setCom(sc.nextInt());

    }

    @Override
    public void print() {
        System.out.println("\n\nkor : " + record.getKor());
        System.out.println("eng : " + record.getEng());
        System.out.println("com : " + record.getCom());

        System.out.println("total : "+record.total()+",\tagv : "+ record.avg());


    }
}
