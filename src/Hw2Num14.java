import java.util.Scanner;
public class Hw2Num14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = {95, 88, 76, 62, 55};
        String courseInput;

        while(true) {
            System.out.print("과목 이름>>");
            courseInput = sc.next();
            if(courseInput.equals("그만")){
                break;
            }
            else {
                for (int i = 0; i < course.length; i++) {
          //        if(courseInput==course[i]){         //문자열 비교 => 비교문자열1.equals(비교문자열) 함수 이용
                    if (courseInput.equals(course[i])) {
                        System.out.println(course[i] + "의 점수는 " + score[i]);
                        break;                          //찾으면 입력과목 점수 찾는 반복 종료 후 다시 입력받는 while로 분기!
                    }
                    else {
                        System.out.println("없는 과목입니다.");
                        break;                          //찾으면 입력과목 점수 찾는 반복 종료 후 다시 입력받는 while로 분기!
                    }   }
            }
        }
    sc.close();
    }
}

