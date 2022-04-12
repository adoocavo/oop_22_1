package Hw2_before_edit;

import java.util.Scanner;

public class Num8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 몇 개>>");
        int num = sc.nextInt();
        int [] intArray = new int[num];             //자바에서는 배열크기에 변수를 사용하여도 괜찮은 코딩인가?? c/c++에서는 변수사용 지양했는디

        for(int i = 0; i< intArray.length; i++){
//            intArray[i] = (int)Math.random() * 100;       //Math.random()으로 0.0~0.1사이 실수 생성 후 바로 (int)형변환 하면 0밖에 안나옴
//            intArray[i] = (int)(Math.random() * 100);
            intArray[i] = (int)(Math.random() * 99)+1;      //1-100
            for(int j = 0; j<i; j++){                        //예외처리하구싶당ㅠ
                while(intArray[i]==intArray[j]){
                    intArray[i] = (int)(Math.random() * 100);
                }
            }
        }
        int check = 0;
        for(int k : intArray){
//            System.out.print(k+" ");
            System.out.printf("%-2d ", k);
            check++;
            if(check%10==0){                //10개 단위로 행 구분하여 출력하기
                System.out.println();
            }
        }
    }
}

//문제의 예시처럼 출력시 필드폭을 2로 설정하여 정렬하였습니다.