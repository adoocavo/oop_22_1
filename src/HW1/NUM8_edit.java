//논리 조건문이 길어지면 그건 잘못된거다
//2개의 좌표가 범위 내에 있는지 판단 => 각각 따로따로 판단 함수 call하기 => 2개의 좌표중 하나라도 Rect내부에 있음 된다!!
//유지/보수에 유용하게 작성하는 법?? => rect좌표 매크로 사용같은거 못하나???
// 더 간결하게 작성가능?
// 완쪽상단 모서리 좌표, 오른쪽 하단 모서리 좌표?? 바뀌지 않음?? => 상관없구 그냥 둘중 하나만 안에 있으면 됨
//좌표가 같을때 사용자 예외처리방법 ?
//접할때 기준으로 생각??

package HW1;
import java.util.Scanner;
//??class내에서 함수 선언??
public class NUM8_edit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1;
        int y1;
        int x2;
        int y2;
        boolean check1;
        boolean check2;

        System.out.print("점 (x1,y1)의 좌표를 입력하시오>>");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        System.out.print("점 (x2,y2)의 좌표를 입력하시오>>");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        check1 = meetRect(x1, y1);
        check2 = meetRect(x2, y2);

        if((check1||check2) == true){           
            System.out.println("두 직사각형이 충돌합니다!");
        }
        else{
            System.out.println("두 직사각형 충돌하지 않습니다!");
        }

        scanner.close();
    }

    public static boolean meetRect(int x, int y) {
        int rectX1 = 100;
        int rectY1 = 100;
        int rectX2 = 200;
        int rectY2 = 200;

        if((x>=rectX1 && x<=rectX2) && (y>=rectY1 && y<=rectY2)){           //simplifiy될 수 있다고??
            return true;
        }
        else {
            return false;
        }

    }
}
