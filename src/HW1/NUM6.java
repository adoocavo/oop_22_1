//조건문을 좀 더 간결하게 쓸순 없을까??
package HW1;
import java.util.Scanner;

public class NUM6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int units;
        int tens;
        int check369 = 0;

        System.out.print("1~99 사이의 정수를 입력하시오>>");
        num = scanner.nextInt();

        units = num%10;
        tens = num/10;

        if(units == 3 || units == 6 || units == 9){
            check369++;
        }

        if(tens == 3 || tens == 6 || tens == 9){
            check369++;
        }
        
        if(check369==2){
            System.out.println("박수짝짝");
        }
        
        else if(check369==1){
            System.out.println("박수짝");
        }
        
        else{;}
        
        scanner.close();
    }
}
