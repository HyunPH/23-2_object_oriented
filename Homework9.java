import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Users_{
    Map<String, String> map;
    Users_(BufferedReader br){
        try {
            Map<String, String> m = new HashMap<>();
            String line;
            while((line = br.readLine()) != null){
                String words[] = line.split(" ");
                m.put(words[0], words[1]);
            }
            this.map = m;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
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
public class Homework9 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new FileReader("db.txt"));

            Users_ users = new Users_(br);
            users.login(sc);

            br.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
