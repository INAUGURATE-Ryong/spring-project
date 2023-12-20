package day05.edu_encore;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data  // Setter,Getter,toString
public class UserVO {  // model  ~~DTO  ~~~VO  ~~~TO

    private String id,name,password;
}
