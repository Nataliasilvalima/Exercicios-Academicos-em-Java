public class PreencherMatriz {
    public static void main(String[] args) {
        int [][] A;
        A = new int [8][8];
        for (int i=0 ; i<8;i= i+1){
            for(int j=0; j<8;j = j+1){
                if (j<i){
                    A[i][j] = 1;
                }
                else{
                    A[i][j] = 0;
            }    }
        }
        for (int i=0 ; i<8;i= i+1){
            for(int j=0; j<8;j = j+1){
                System.out.print(A[i][j] +" | " );
            }
        System.out.println("");
        }
    }
}
