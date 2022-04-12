package Hw2_before_edit;

public class Num10 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];          //ragged array아니면 그냥 [][]두개 다 명시??
        //0으로 초기화
        //0-15 난수생성(중복 불가) => 10개만 선택(집어넣을 위치)
        //1-10 난수생성(중복 가능) => 선택된 10개의 배열위치에 집어넣기  (집어넣을 값)
        int[] ranInt = new int[10];
        for(int i=0; i< ranInt.length; i++) {
            ranInt[i] = (int) (Math.random() * 15);     //기본: 0.0-1.0
            for (int j = 0; j < i; j++) {
                if (ranInt[i] == ranInt[j]) {
                    i--;
                    break;
                }   }
        }
        for(int t : ranInt){
            System.out.println(t);
        }


        for(int k=0; k< ranInt.length; k++){
            for(int l = 0; l<4; l++){
                for(int p =0; p<4; p++){
                    //        if(4*(l-1) + p == ranInt[k]){             //l=0일때 계산안됨
                    if(4*(l) + p == ranInt[k]){                 //주의: 첫 열의 index는 l=0이다!! => 1차원 배열의 값과 p값이 동일하다!!
                        arr[l][p] = ((int)(Math.random()*9))+1;     //괄호 주의(+1이 최종 int에 더해지도록!)
                    }   }   }
        }

        for(int[]z1 : arr){
            for(int z2 : z1){
                System.out.printf("%3d", z2);
            }
            System.out.println();
        }
    }
}


//4*(i-1) + j == ranInt
//
