package day03.DI3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Curling {
    private PlayerImpl player;

    @Autowired
    @Qualifier("p2")  // 객체가 여러게 생성되었을 때 별칭을 넣어주면 그 별칭에 해당되는 객체를 넣는다(자동주입하는데!)
    public void setPlayer(PlayerImpl player) {  // DI
        this.player = player;
    }
}
