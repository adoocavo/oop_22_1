//정혜경 c 33p참조
package HW1;
import java.util.Scanner;
public class NUM12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        char op;

        System.out.print("연산>>");
        num1 = scanner.nextDouble();
        op = scanner.next().charAt(0);              //?? scanner는 index size=3의 문자열?? 즉, 0:op 1:공백 2:num2??
        num2 = scanner.next().charAt(0);            //??위에 문장에서 버퍼에 저장된걸 scanner 객체가 다 꺼내오기 전까지는 계속 scanner에 저장되어있는건가??

        System.out.printf("%lf %c %lf", num1, op, num2);       //sout 에서 +사용의미??


    }
}
