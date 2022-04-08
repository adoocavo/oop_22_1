package HW1;
import java.util.Scanner;
public class NUM2 {
    public static void main(String[] args) {
        int num;
        int units;
        int tens;
        Scanner scanner = new Scanner(System.in);

        System.out.print("2자리수 정수 입력(10~99)>>");     //??모니터에 출력과 num에 저장되는건 별개??
        num = scanner.nextInt();

        tens = num/10;
        units = num%10;

        if(units == tens){
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        }

        scanner.close();        //??해당 class에서만 닫히지??
        //java => main return 생략?? 의미없음??
    }
}
