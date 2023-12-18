package day03.DI4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@NoArgsConstructor  // 디폴트 생성자 함수
@AllArgsConstructor // 모든객체 생성자 함수
@Data
public class EmployeePersonImpl implements Person{
    //객체지향 특성으로 캡슐화 - 은닉 변수 숨겨서 아무나 접근 못하게 하기 위해서 private로 선언
    // public으로 선언한건 객체지향특성으로 만든게 아님.
    private String name, gender;
    private int age;
    private ArrayList<String> hobbys;
    @Override
    public boolean personShow(String name, int age, String gender) {
        System.out.println(name + " / " + age + " / " + gender);
        return true;
    }

    @Override
    public boolean personShow(Person person) {
        System.out.println(person);
        return true;
    }

    public boolean personShow(ArrayList<String> hobbys){
        for (int i = 0; i < hobbys.size(); i++) {
            System.out.println(hobbys);

        }
        return true;
    }
}
