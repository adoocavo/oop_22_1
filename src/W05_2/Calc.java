package W05_2;

public class Calc {
    public static void main(String[] args) {
        // System.out.println("Calc.main"); //함수 call여부 확인
        double sum = 0.0;

        for (int i = 0; i < args.length; i++){

            sum += Double.parseDouble(args[i]);
    }
            System.out.println("합계:" + sum);


    }
}


