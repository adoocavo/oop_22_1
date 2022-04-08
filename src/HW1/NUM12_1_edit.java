//정혜경 c 33p참조
//피연산자 실수 => 출력 반올림 기준??
//문자로 입력받았는데 equals 어케쓰나??
//주의: 실수를 0으로 나눈다 => 예외 아님
package HW1;
import java.util.Scanner;
public class NUM12_1_edit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double ans = 0.0;                   //??안하는 방법 없나??
        char op;

        System.out.print("연산>>");
        num1 = scanner.nextDouble();
        op = scanner.next().charAt(0);              //?? scanner는 index size=3의 문자열?? 즉, 0:op 1:공백 2:num2??
        num2 = scanner.nextDouble();                //?? 11 + 11을 입력 -> 버퍼에 저장 -> "공백 + 공백 11 엔터"가 버퍼에 남아있음
                                                    // -> scanner.next()로 남은 문자열 모두 읽고 그 중 0번째 문자인 연산자를 리턴
                                                    // -> 스캐너에는 아직 "공백 11 엔터"가 남아있나??
                                                    //입략버퍼에서 scanner객체로 값을 가져오는데 scanner객체에 값이 있다면 입력버퍼의 값 읽으로 가지 않아도 되는건가?
                                                    //커서를 내놓는 기준은 입력버퍼가 비어있을때?? scanner가 비어있을때??
        //    System.out.printf("%f %c %f", num1, op, num2);
        if(op == '+'){
            ans = num1+num2;
            System.out.printf("%.1f %c %.1f의 계산 결과는 %.1f\n", num1, op, num2, ans);
        }
        else if(op == '*'){
            ans = num1*num2;
            System.out.printf("%.1f %c %.1f의 계산 결과는 %.1f\n", num1, op, num2, ans);
        }
        else if(op == '='){
            ans = num2;
            System.out.printf("%.1f %c %.1f의 계산 결과는 %.1f\n", num1, op, num2, ans);
        }

        else if (op == '/') {
            if(num2 == 0.0){
                System.out.println("0으로는 나눌 수 없습니다.");
            }
            else{
                ans = num1 / num2;
                System.out.printf("%.1f %c %.1f의 계산 결과는 %.1f\n", num1, op, num2, ans);
            }

            /*try {
                ans = num1 / num2;
            }
            catch(ArithmeticException a){
                System.out.println("0으로는 나눌 수 없습니다.");
            }*/
        }
        else{
            System.out.println("잘못된 연산자입니다.");
        }

//        System.out.printf("%.1f %c %.1f의 계산 결과는 %.1f\n", num1, op, num2, ans);        //??reassigned local variable 뜻??

        scanner.close();

    }

}