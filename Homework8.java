import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Users{
    Map<String, String> map;
    Users(Map<String, String> m){
        this.map = m;
    }

    void login(Scanner sc){
        String input;
        do{
            System.out.printf("id와 password를 입력해주세요.\nid : ");
            input = sc.next().trim();
            if(map.containsKey(input)){ //id 일치
                System.out.printf("password : ");
                input = sc.next().trim();
                if(map.containsValue(input)){//password 일치
                    System.out.printf("id와 비밀번호가 일치합니다.\n");
                    break;
                }// password 불일치
                System.out.printf("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n\n");
                continue;
            }// id 불일치
            System.out.printf("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n\n");
        }while(true);
    }

}
public class Homework8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> m = new HashMap<>();
        m.put("myId", "myPass");
        m.put("myI2", "myPass2");
        m.put("myI3", "myPass3");

        Users users = new Users(m);
        users.login(sc);
    }
}
