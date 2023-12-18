package day03.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class MoniterViewer {

    //1. 필드에 적용
//    @Autowired
    private Recorder recorder;  //has-a

//2. setter method를 통한 자동주입
//@Autowired
//    public void setRecorder(Recorder recorder) {
//        this.recorder = recorder;
//    }
    //3. 사용자(일반)메소드 이용한 자동주입
//    @Autowired
    public void userMethod(Recorder recorder){
        this.recorder = recorder;
        System.out.println("사용자(일반)메소드 이용한 자동주입");
    }

    //4. 생성자함수를 통한 자동주입
    @Autowired
    public MoniterViewer(Recorder recorder) {
        super();
        this.recorder = recorder;
        System.out.println("나 생성자 함수 이용");
    }

    public void print(){
        recorder.show();
    }
}
