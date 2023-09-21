package ch3;

import java.util.Scanner;

class Student{
    int stNum;
    String name;
    String major;
    int phoneNum;

    void getMajor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요:");
        stNum = sc.nextInt();
        name = sc.next();
        major = sc.next();
        phoneNum = sc.nextInt();
    };
    String setMajor(){
        String resurtPhone = Integer.toString(phoneNum);
        resurtPhone = "0" + resurtPhone.substring(0,2) + "-" + resurtPhone.substring(2,6) + "-"  + resurtPhone.substring(6,10);
        String resurt = stNum + " " + name + " " + major + " " + resurtPhone;
        return resurt;
    };

}
public class Homework2 {
    public static void main(String[] args) {
        Student stArray[] = new Student[3];

        for(int i = 0;i<3;i++){
            stArray[i] = new Student();
            stArray[i].getMajor();
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다");
        System.out.printf("first student: %s\n", stArray[0].setMajor());
        System.out.printf("second student: %s\n", stArray[1].setMajor());
        System.out.printf("third student: %s\n", stArray[2].setMajor());

    }

}
