public class Hw2Num10 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int[] ranInt = new int[10];

        for(int i=0; i< ranInt.length; i++) {
            ranInt[i] = (int) (Math.random() * 15);
            for (int j = 0; j < i; j++) {
                if (ranInt[i] == ranInt[j]) {
                    i--;
                    break;
                }   }
        }

        for(int k=0; k< ranInt.length; k++){
            for(int l = 0; l<4; l++){
                for(int p =0; p<4; p++){
                    if(4*(l) + p == ranInt[k]){
                    arr[l][p] = ((int)(Math.random()*9))+1;
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


