package ch3;
import java.util.Scanner;

class Student{
    int stNum;
    String name;
    String major;
    int phoneNum;

    Student(int stNum, String name, String major, int phoneNum){
        this.stNum = stNum;
        this.name = name;
        this.major = major;
        this.phoneNum = phoneNum;
    }
    int getStudentNum(){ return stNum; };
    String getname(){return name;};
    String getMajor(){return major;};
    String getPhoneNum(){
        return setPhoneNum();
    };
    String setPhoneNum(){
        String resurtPhone = Integer.toString(phoneNum);
        resurtPhone = "0" + resurtPhone.substring(0,2) + "-" + resurtPhone.substring(2,6) + "-"  + resurtPhone.substring(6,10);
        return resurtPhone;
    };

}
public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student stArray[] = new Student[3];

        for(int i = 0;i<3;i++){
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요:");
            int stNum = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            int phoneNum = sc.nextInt();

            stArray[i] = new Student(stNum, name, major, phoneNum);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다");
        System.out.printf("first student: %d %s %s %s\n", stArray[0].getStudentNum(), stArray[0].getname(), stArray[0].getMajor(), stArray[0].getPhoneNum());
        System.out.printf("second student: %d %s %s %s\n", stArray[1].getStudentNum(), stArray[1].getname(), stArray[1].getMajor(), stArray[1].getPhoneNum());
        System.out.printf("third student: %d %s %s %s\n", stArray[2].getStudentNum(), stArray[2].getname(), stArray[2].getMajor(), stArray[2].getPhoneNum());
    }
}
