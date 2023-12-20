package day05.edu_encore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainEntry {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("UsersCtx.xml");
        UserDAO dao = ctx.getBean("dao",UserDAO.class);
        dao.menu();
        Scanner sc = new Scanner(System.in);
        UserVO vo = new UserVO();
        switch (sc.nextInt()){
            case 1:

                System.out.print("user id = ");   vo.setId(sc.next());
                System.out.print("user name = ");   vo.setName(sc.next());
                System.out.print("user pass = ");   vo.setPassword(sc.next());

                dao.insert(vo);
                System.out.println(vo.getId() + "추가 성공!!");
                System.out.println("========================");
                break;
            case 2:
                System.out.println(dao.selectAll());
                break;
            case 3:  // selectById
                System.out.println(dao.selectById(sc.next()));
                break;
            case 4: // update
                System.out.println("변경시킬 ID : "); vo.setId(sc.next());
                System.out.println("바꿀 이름 : "); vo.setName(sc.next());
                System.out.println("바꿀 비밀번호 : "); vo.setPassword(sc.next());

                dao.update(vo);
                System.out.println(vo.getId() + "변 경 성공!!");
                break;
            case 5:  // delete
                System.out.println("삭제할 ID : "); vo.setId(sc.next());
                dao.delete(vo);
                System.out.println(vo.getId() + "삭제 성공!!");
                break;

            default:
                System.out.println("번호 선택이 없다. 다시 선택");
                break;
        }
    }
}
