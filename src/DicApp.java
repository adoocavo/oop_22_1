import java.util.Scanner;

class Dictionary{
    private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String [] eng = {"love", "baby", "money", "future", "hope"};

    public static String kor2eng(String word){
    //    for(String s : kor){
        for(int i = 0; i < kor.length; i++){        //eng index알아내면서 강화된 for문 사용 불가??
            if(kor[i].equals(word)) return eng[i];
                //System.out.println(word + "은(는) " + eng[i]);
                //break;
            }
        return "저의 사전에 없습니다";
    }
}

public class DicApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        String ans;
        System.out.println("한글 단어 검색 프로그램입니다.");
        while(true) {
    //        System.out.println("한글 단어 검색 프로그램입니다.");
            System.out.print("한글 단어?");
            word = sc.next();

            if(word.equals("그만")) break;

            ans=Dictionary.kor2eng(word);
            System.out.println(word + "은(는) " + ans);
        }
        sc.close();
    }
}
