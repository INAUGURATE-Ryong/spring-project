package day04.AOP1_java;

public class JavaMainEntry {
    public static void main(String[] args) {
        JavaCalc c = new JavaCalc();
        System.out.println(c.add(1,2));
        System.out.println(c.add(10,22));
        System.out.println();
        System.out.println(c.mul(3,56));
        System.out.println(c.mul(2,4,6));
    }
}
