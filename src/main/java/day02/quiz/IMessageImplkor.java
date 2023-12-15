package day02.quiz;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class IMessageImplkor implements IMessage {//

    String name, greeting;

    public IMessageImplkor() { }
    //1. constructor <----- DI
    public IMessageImplkor(String name, String greeting) {
        super();
        this.name = name;
        this.greeting = greeting;
    }

    //2. setter method <------ DI
    public void setName(String name) {
        this.name = name;
    }
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    @Override
    public void sayHello() {
        System.out.println(greeting + " /  " + name + "!!!");
    }

    @Override
    public String sayMessage() {
        return greeting;
    }

}
