//22p
package W04_1;

public class FinalExample {
    //Field variable(=member vari in c++)
    public static final double PI_VALUE2;
    final double PI_VALUE;          //지역변수가 아니더라도 fianl 상수의 선언과 초기화를 분리시킬수있다
//  PI_VALUE = 3.14;                //메소드 외부에서 정의된 상수는 초기화 가능한 영역이 따로 존재한다
                                    //field에서 정의된 변수도 선언과 초기화가 분리될 수 있다
   //Constructor(생성자) => field의 final상수 초기화 가능!
    public FinalExample(){          //command + n 단축키로 생성자 작성 가능
        PI_VALUE = 3.14;
    //    PI_VALUE2 = 3.14;v           static final초기화 불가
    }

    //static Initialize block
    static {
        PI_VALUE2 = 3.14;           //static final초기화
    }


    public static void main(String[] args) {
        final double PI_1;
        double PI;
        int radius = 1;
        PI = 3.14;
        PI_1 = 3.14;
        double perimeter = 2*PI*radius;
     //   double perimeter = 2*PI*radius;  //PI할당 안하고 사용 -> c.e

       //26p
        int a = 127;
        byte b = (byte)a;

        byte c = 0x0f;
        byte d = (byte)0xff;


    }
}


//결론 => const 상수, 변수가 어디에 위치하든 final이 붙은 경우에는 선언과 초기화 분리 가능하다