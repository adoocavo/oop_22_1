//연산결과 출력문을 꼭 조건마다 써야하나??
package HW1;
import java.util.Scanner;
public class NUM12_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double ans = 0.0;                  //??안하는 방법 없나??
        char op;

        System.out.print("연산>>");
        num1 = scanner.nextDouble();
        op = scanner.next().charAt(0);
        num2 = scanner.nextDouble();

        switch(op){
            case '+':
                ans = num1 + num2;
                System.out.printf("%.1f %c %.1f의 계산 결과는 %.1f\n", num1, op, num2, ans);
                break;

            case '*':
                ans = num1 * num2;
                System.out.printf("%.1f %c %.1f의 계산 결과는 %.1f\n", num1, op, num2, ans);
                break;

            case '=':
     //         ans = (num1=num2);
                ans = num2;
                System.out.printf("%.1f %c %.1f의 계산 결과는 %.1f\n", num1, op, num2, ans);
                break;

            case '/':
                if(num2 == 0.0){
                    System.out.println("0으로는 나눌 수 없습니다.");
                    break;
                }
                else{
                    ans = num1 / num2;
                    System.out.printf("%.1f %c %.1f의 계산 결과는 %.1f\n", num1, op, num2, ans);
                    break;
                }
                /*try{
                    ans = num1 / num2;
                }
                catch(ArithmeticException a){
                    System.out.println("0으로는 나눌 수 없습니다.");
                }
                System.out.printf("%.1f %c %.1f의 계산 결과는 %.1f\n", num1, op, num2, ans);*/
            default:
                System.out.println("잘못된 연산자입니다.");
        }

        //System.out.printf("%.1f %c %.1f의 계산 결과는 %.1f\n", num1, op, num2, ans);        //??reassigned local variable 뜻??
    }
}