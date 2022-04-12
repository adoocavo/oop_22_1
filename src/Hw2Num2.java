public class Hw2Num2 {
    public static void main(String[] args) {
        int[][] n = new int [5][];
        int inputNum = 1;

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

        for(int[] k : n){
            for(int l : k){
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
