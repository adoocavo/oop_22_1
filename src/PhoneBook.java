//객체 배열 생성이 객체의 기본 생성자 호출을 의미하는건 아니다(따로 생성자 호출해서 초기화 필요)
//입력받은 수 만큼 객체생성 -> 객체배열 염두에 두기
//간단하게 String으로 받자(tel을)
//gette함수 사용 타이밍
//continue label사용해도 되나??

import java.util.Scanner;

class Phone {
    private String name;
    private String tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
}

public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int headCount;
        String name;
        String tel;

        System.out.print("인원수>>");
        headCount = sc.nextInt();
        Phone[] phoneArray = new Phone[headCount];

        for (int i = 0; i < headCount; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            name = sc.next();
            tel = sc.next();

            phoneArray[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

        OUTER:
        while (true) {
            System.out.print("검색할 이름>>");
            name = sc.next();

            if (name.equals("그만")) break;
            for (Phone p : phoneArray) {
                if ((p.getName()).equals(name)) {
                    System.out.println(name + "의 번호는 " + p.getTel() + " 입니다.");
                    continue OUTER;
                }
            }
            System.out.println(name + " 이 없습니다.");
        }
        sc.close();
    }
}

