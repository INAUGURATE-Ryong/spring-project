package day02.DI2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Getter, Setter, Tostring 다 포함
@AllArgsConstructor
public class MemberDTO {  // model

    private String  name;
    private int age;
    private String message;

    public MemberDTO() {
    }
}
