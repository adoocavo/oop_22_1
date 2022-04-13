//while 반복분 내에서 종료 조건문 먼저 작성
//반복 => 1. 과목 이름 입력받는 반복(외부)
//       2. 입력받은 과목이 course 배열의 값과 같은지 확인하는 반복(내부)
//course 배열에 없는 과목명이 입력되었을때 처리방법 => 2반복과 엮어서 작성말고 2반복이 끝난 후 결과를 구분하여 문구 출력
//??: Duplicated code fragment (29 lines long)의미??똑같은 코드라는건가?? 29lines long은 해당 줄의 글자수??
//??: Scanner는 class단위로 유지??(한번열면 해당 class가 끝날때까지만 열려있는건가??
//빨간색 => 런타임에러
//Scanner => main()함수의 마지막 문장이 아니면 닫지마라??
import java.util.Scanner;
public class Hw12Num14_edit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = {95, 88, 76, 62, 55};
        int check = 0;
        String courseInput;

        while (true) {
            System.out.print("과목 이름>>");
            courseInput = sc.next();
            if (courseInput.equals("그만")) {
                break;
            }
            else {
                for (int i = 0; i < course.length; i++) {       //과목 찾을때까지 반복
                    if (courseInput.equals(course[i])) {
                        System.out.println(course[i] + "의 점수는 " + score[i]);
                        check++;
                        break;
                    }
                }
                if (check == 0) {                               //과목 찾았는지 확인하는 변수 이용?? 굳이??
                 //   check = 0;
                    System.out.println("없는 과목입니다.");        //for문에서 과목 판별이 안되면 없는과목!
                    continue;
                }
            }
            check=0;
        }
        sc.close();
    }

    }