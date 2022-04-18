import java.util.Scanner;

public class Hw2Num16 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner("System.in");
        Scanner sc = new Scanner(System.in);
        int strIndex;
        String user;
        String [] str = {"가위", "바위", "보"};


        while(true) {
            System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
            System.out.print("가위 바위 보!>>");
            user = sc.next();
            strIndex = (int) (Math.random() * 3);

            if (str[strIndex].equals(user)) {
                System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[strIndex] + ", 비겼습니다");
            } else {
                switch (user) {
                    case "가위":
                        if (str[strIndex].equals("보")) {
                            System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[strIndex] + ", 사용자가 이겼습니다");
                            break;
                        } else if (str[strIndex].equals("바위")) {
                            System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[strIndex] + ", 컴퓨터가 이겼습니다");
                            break;
                        } else break;

                    case "바위":
                        if (str[strIndex].equals("보")) {
                            System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[strIndex] + ", 컴퓨터가 이겼습니다");
                            break;
                        } else if (str[strIndex].equals("가위")) {
                            System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[strIndex] + ", 사용자가 이겼습니다");
                            break;
                        } else break;

                    case "보":
                        if (str[strIndex].equals("바위")) {
                            System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[strIndex] + ", 사용자가 이겼습니다");
                            break;
                        } else if (str[strIndex].equals("가위")) {
                            System.out.println("사용자 = " + user + ", 컴퓨터 = " + str[strIndex] + ", 컴퓨터가 이겼습니다");
                            break;
                        } else break;

                    default:
                        break;
                }
            }

//            if(user=="그만"){
            if (user.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }
            strIndex = 0;
        }
        }
    }

