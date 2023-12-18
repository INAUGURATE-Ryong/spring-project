package day03.DI3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Basketball {
    @Autowired
    @Qualifier("player2")  // player와 다른 객체를 씀 curling하고 다른객체임.
    private PlayerImpl player;

    public void setPlayer(PlayerImpl player) {
        this.player = player;
    }
}
