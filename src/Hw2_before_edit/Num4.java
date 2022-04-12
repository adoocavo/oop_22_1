package Hw2_before_edit;

import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        int numRep;

        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        ch = sc.next().charAt(0);
        numRep = ch - 'a' + 1;

        for(int i=0; i<numRep; i++){
            for(char j='a'; j <= ch; j++){
                System.out.print(j);
            }
            ch--;
            System.out.println();
        }


//        System.out.println((int) 'A');
//        char ans = 'a' + 1;
//        System.out.println(ans);
    }
}
