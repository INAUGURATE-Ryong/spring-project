package day04.AOP4_xml;

public class MessageBeanImpl implements IMessageBean{
    @Override
    public void sayHello() {
        System.out.println(" public void sayHello() call~~~~ ");
    }

    @Override
    public void engHello() {
        System.out.println("public void engHello() call ~~~~ ");

        try {
            Thread.sleep(2000);  // 2초동안
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
