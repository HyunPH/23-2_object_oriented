package ch5;

import java.util.Scanner;

public class Homework4 {
    static int gcd(int m, int n){
        if(n == 0)
            return m;
        else if(m % n == 0)
            return n;
        else{
            m = m % n;
            return gcd(n, m);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("두 수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("두 수의 최대공약수는 %d입니다.\n", gcd(a,b));
    }
}
