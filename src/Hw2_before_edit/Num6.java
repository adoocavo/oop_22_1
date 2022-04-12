//if-else의 조건과 실행문이 반복됨 => 공통되는 부분 파악 후 반복문으로 구현!
//                                =>구조 반복 파악하기
//??정혜경 c 과젠 어케풀었었찌?
package Hw2_before_edit;


import java.util.Scanner;
public class Num6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        int [] unit = {50000, 10000, 1000, 100, 10, 1};
//        int [unit.length] count = {0,};
//        int [9] count = {0, };
        int [] count = new int [unit.length];

        System.out.print("금액을 입력하시오>>");
        money = sc.nextInt();

//        while(money > 0){
//            if(money>=50000){
//                count[0] = money/unit[0];
//                money %= unit[0];
//            }
////            else if(money>=10000&&money<50000){
//           else if(money>=10000&&money<50000){
//                count[1] = money/unit[1];
//                money %= unit[1];
//            }
//            else if(money>=1000&&money<10000){
//                count[2] = money/unit[2];
//                money %= unit[2];
//            }
//        }
        for(int i = 0; i < unit.length; i++){
            try{
                if(money>=unit[i]&&money<unit[i-1]){
                    count[i] = money/unit[i];
                    money %= unit[i];
                }
            }
            catch(ArrayIndexOutOfBoundsException a){
                //     if(money>=unit[i]){                             //이게 왜 항상 true?? => i<=0일떄만 만족하므로??
                count[i] = money/unit[i];
                money %= unit[i];
                ///    }
            }
        }
        int j =0;   //??반복문에 같이 선언 못하나??
        for(int k : count){
            System.out.println(unit[j]+"원 짜리: "+k+"개");
            j++;
        }
    }
}
//?? InputMismatchException오류가 int범위 벗어나도 발생하나???