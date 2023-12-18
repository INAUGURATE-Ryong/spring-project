package day03.DI4;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class MyInfomation {

    private Person person;  // has-a

    //setter method DI
    public boolean processMessage(StudentPersonImpl student){
//        return this.person.personShow(student.getName(),student.getAge(),student.getGender());
        return this.person.personShow(student);
    }

    public boolean processMessage(EmployeePersonImpl emp){
//        return this.person.personShow(emp.getName(),emp.getAge(),emp.getGender());
        return this.person.personShow(emp);
    }

    public boolean processMessage(String name, int age, String gender){
        return this.person.personShow(name,age,gender);
    }

}
