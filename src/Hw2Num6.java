import java.util.Scanner;
public class Hw2Num6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        int [] unit = {50000, 10000, 1000, 100, 10, 1};
        int [] count = new int [unit.length];

        System.out.print("금액을 입력하시오>>");
        money = sc.nextInt();

        for(int i = 0; i < unit.length; i++){
            try{
                if(money>=unit[i]&&money<unit[i-1]){
                    count[i] = money/unit[i];
                    money %= unit[i];
                }
            }
            catch(ArrayIndexOutOfBoundsException a){
                    count[i] = money/unit[i];
                    money %= unit[i];
            }
        }
        int j =0;
        for(int k : count){
            System.out.println(unit[j]+"원 짜리: "+k+"개");
            j++;
        }
    }
}
