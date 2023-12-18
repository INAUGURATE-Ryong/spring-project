package day03.DI4;

import lombok.Data;

import java.util.ArrayList;

@Data
public class StudentPersonImpl implements Person {
    private String name, gender;
    private int age;
    private ArrayList<String> score;
    @Override
    public boolean personShow(String name, int age, String gender) {
        this.name = name;
        System.out.println(name + " / " + age + " / " + gender);
        return true;
    }

    @Override
    public boolean personShow(Person person) {
        System.out.println(person);
        return true;
    }

    public boolean personShow(ArrayList<String> score) {
        for (int i = 0; i < score.size(); i++) {
            System.out.println(score);
        }
        return true;
    }
}
