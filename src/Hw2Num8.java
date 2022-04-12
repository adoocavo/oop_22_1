import java.util.Scanner;
public class Hw2Num8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 몇 개>>");
        int num = sc.nextInt();
        int [] intArray = new int[num];

        for(int i = 0; i< intArray.length; i++){
            intArray[i] = ((int)(Math.random() * 99)+1);
            for(int j = 0; j<i; j++){
                if(intArray[i]==intArray[j]){
                   i--;
                   break;
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

