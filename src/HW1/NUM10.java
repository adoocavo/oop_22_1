//배열 객체에 원의 중심, 반지름 저장

package HW1;
import java.util.Scanner;
public class NUM10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int x1, y1, r1;
//        int x2, y2, r2;
        double [] circle1 = new double[3];
        double [] circle2 = new double[3];
        double distanceC1C2;

        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        for(int i=0; i<circle1.length; i++){
            circle1[i] = scanner.nextDouble();
        }
        System.out.print("두번째 원의 중심과 반지름 입력>>");
        for(int i=0; i<circle2.length; i++){
            circle2[i] = scanner.nextDouble();
        }
        distanceC1C2 = Math.sqrt(Math.pow(circle2[0]-circle1[0], 2) + Math.pow(circle2[1]-circle1[1], 2));

        if(distanceC1C2 <= circle1[2] + circle2[2]){
            System.out.println("두 원은 서로 겹친다.");
        }
        else{
            System.out.println("두 원은 서로 겹치지 않는다.");
        }

        scanner.close();
    }

}
