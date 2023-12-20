package day04.AOP3_xml;

public class CalcImpl implements InterCalc {
    @Override
    public int add(int x, int y) {
        int result = x+y;
        return result;
    }

    @Override
    public int mul(int x, int y) {
        int result = x*y;
        return result;
    }

    @Override
    public int sub(int x, int y, int z) {
        int result = x-y-z;
        return result;
    }
}
