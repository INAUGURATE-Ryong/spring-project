package day04.AOP2_java;

import day04.AOP1_java.JavaCalc;

import java.lang.reflect.Proxy;

public class JavaMainEntry {
    public static void main(String[] args) {
        InterCalc c = new CalcImpl();
        InterCalc proxy = (InterCalc)Proxy.newProxyInstance(
                c.getClass().getClassLoader(),// loaer : 클래스 찾기
                c.getClass().getInterfaces(), // interface : 행위
        new LogPrintHandlerImpl(c)); // h : 보조업무
        //Proxy를 통해서
        System.out.println(proxy.add(2,5));
        System.out.println(proxy.mul(5,3));
        System.out.println(proxy.sub(77,56,6));
        System.out.println("========================");

//        System.out.println(c.add(1,2));
//        System.out.println(c.add(10,22));
//        System.out.println();
//        System.out.println(c.mul(3,56));
//        System.out.println(c.sub(2,4,6));
    }
}
