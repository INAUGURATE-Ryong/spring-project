package day02.nonDI3;

public class MainEntry {
    public static void main(String[] args) {
        IRecordImpl record = new IRecordImpl();
        IRcordViewImpl view = new IRcordViewImpl();

        // 조립
        view.setRecord(record);
        view.input();
        view.print();
    }
}
