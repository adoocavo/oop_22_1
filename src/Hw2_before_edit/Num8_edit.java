package Hw2_before_edit;

import java.util.Scanner;

public class Num8_edit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 몇 개>>");
        int num = sc.nextInt();
        int [] intArray = new int[num];

        for(int i = 0; i< intArray.length; i++){
//            intArray[i] = (int)(Math.random() * 99)+1;
            intArray[i] = ((int)(Math.random() * 99)+1);                //실수: +1까지 포함하도록 괄호!! 연산자 우선순위 떔에 + -> = 이 계산된다
            for(int j = 0; j<i; j++){
//               while(intArray[i]==intArray[j]){                       //실수: => 만약에 iA[15]와 iA[30]이 같으면 iA[15]!=iA[30] 즉, iA[15]와만 다른 값이 나오므로 index 15이전의 값과 같아도 그냥 넘어감 => 처음부터 다시 비교해야함!!
//        //           intArray[i] = (int)(Math.random() * 100);
//                   intArray[i] = ((int)(Math.random() * 99)+1);
                if(intArray[i]==intArray[j]){
                    i--;
                    break;           //break시 i의 첨자가 i++되므로 이를 고려하여 i--작성
                }
            }
        }

        int check = 0;
        for(int k : intArray){
            System.out.printf("%-3d ", k);
            check++;
            if(check%10==0){
                System.out.println();
            }
        }
    }
}
//??100입력하면 왜 안되지??..실행이 안끝남
//100은 왜 안나오지??ㅜ