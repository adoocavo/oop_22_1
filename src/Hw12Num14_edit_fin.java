import java.util.Scanner;
public class Hw12Num14_edit_fin {
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
                for (int i = 0; i < course.length; i++) {
                    if (courseInput.equals(course[i])) {
                        System.out.println(course[i] + "의 점수는 " + score[i]);
                        check++;
                        break;
                    }
                }
                if (check == 0) {
                    System.out.println("없는 과목입니다.");
                    continue;
                }
            }
            check=0;
        }
        sc.close();
    }
}
