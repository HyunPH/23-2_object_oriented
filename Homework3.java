package ch4;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("몇 개의 수를 입력할 예정인가요? ");
        int N = sc.nextInt();

        int nStr[] = new int[N];
        System.out.printf("수를 입력하세요: ");
        for(int i = 0; i<N;i++){
            nStr[i] = sc.nextInt();
        }

        int max = nStr[0], min = nStr[0];
        for(int i = 1; i<N;i++){
            if(nStr[i] > max)
                max = nStr[i];
            if(nStr[i] < min)
                min = nStr[i];
        }
        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d\n", min);
    }
}
