//import java.util.Scanner;
package W04_2;      //최상단에 와야하는건가??
import java.util.Scanner;

//hasNext 함수이용 입력
/*public class ScannerExample {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);        //키보드로부터 입력받음
        System.out.print(">>");
        while(s1.hasNext()){                        //??: s1.hasNext가 커서를 내놓는건가?? System.in에서인가?
            System.out.println(s1.next());
        }

        s1.close();     //scanner file 닫기 => 키보드와의 연결을 끊는다
    }*/

//close()사용 주의(입력이 system.in일때)
//System.in에서 만든 Scanner=>프로그램 내에서 한번 닫으면 다시 여는 거 불가능! ==> 사용 완료전까지 close하지마라!
public class ScannerExample {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);        //키보드로부터 입력받음
        System.out.print(">>");
        System.out.println(s1.next());

   //   s1.close();     //scanner file 닫기 => 키보드와의 연결을 끊는다

        Scanner s2 = new Scanner(System.in);        //키보드로부터 입력받음
        System.out.print(">>");
        System.out.println(s2.next());              //rte

        s2.close();
    }
}