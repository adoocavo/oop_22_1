package Hw2_before_edit;

public class Num2_1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[][] n = new int [5][];
        int inputNum = 1;
//        n[0] = {1};
//        n[1] = {1, 2, 3}; 1,3,1,4,2
        n[0] = new int[1];
        n[1] = new int[3];
        n[2] = new int[1];
        n[3] = new int[4];
        n[4] = new int[2];

        for(int i=0; i<n.length; i++){
            for(int j=0; j<n[i].length; j++){
                n[i][j] = inputNum;
                inputNum++;
            }
            inputNum = 1;
        }

//        for(int i=0; i<n.length; i++){
//            for(int j=0; j<n[i].length; j++){
//                System.out.print(n[i][j]+" ");
//            }
//            System.out.println();
//        }
        for(int[] k : n){                           //read only
            for(int l : k){                         // l = k[0 ~ n.length-1][0 ~ k.length-1]
                System.out.print(l + " ");          // :뒤에[] 추가되어서 실행됨
            }
            System.out.println();
        }
    }

}