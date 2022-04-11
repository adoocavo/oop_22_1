// 예외처리, 배열 복습
package HW1;
import java.util.Scanner;

public class NUM4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int num1;
        // int num2;
        // int num3;
        int[] num = new int[3];
        int temp;

        System.out.print("정수 3개 입력>>");
        for(int i=0; i<num.length; i++){
            num[i] = scanner.nextInt();
        try{
            if(num[i]<num[i-1]) {
                temp = num[i];
                num[i] = num[i - 1];
                num[i - 1] = temp;
            }
          }
        catch(ArrayIndexOutOfBoundsException arr){
             continue;                                          //??continue가 없으면 괄호 나가고 분기??       //catch block을 비워놓으면 안되는 이유??
            }
        }

        System.out.println("중간 값은 " + num[(3-1)/2]);        //??java 전처리문?

        scanner.close();
    }
}
