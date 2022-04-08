package HW1;
import java.util.Scanner;
//??class내에서 함수 선언??
public class NUM8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1;
        int y1;
        int x2;
        int y2;
        boolean check;

        System.out.print("점 (x2,y2)의 좌표를 입력하시오>>");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        System.out.print("점 (x1,y1)의 좌표를 입력하시오>>");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();

        check = meetRect(x1, y1, x2, y2);

        if(check=true){
            System.out.println("두 직사각형이 충돌합니다!");
        }
        else{
            System.out.println("두 직사각형 충돌하지 않습니다!");
        }
    }

        public static boolean meetRect(int x1, int y1, int x2, int y2){
            int rectX1 = 100;
            int rectY1 = 100;
            int rectX2 = 200;
            int rectY2 = 200;
/*
            if((x1!=x2 && y1!=y2) && (((x1>=rectX1 && x1<=rectX2) && (y1>=rectY1 && y1<=rectY2)) || ((x2>=rectX1 && x2<=rectX2) && (y2>=rectY1 && y2<=rectY2)))){
                return true;
            }

            else {
                return false;
            }
 */
            if(x1<x2 && y1<y2){
                if(((x1>=rectX1 && x1<=rectX2) && (y1>=rectY1 && y1<=rectY2)) || ((x2>=rectX1 && x2<=rectX2) && (y2>=rectY1 && y2<=rectY2))){
                    return true;
                }
                else{
                    return false;
                }
            }

            else{
                return false;
            }
    }
}
