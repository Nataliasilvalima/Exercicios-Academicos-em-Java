import java.util.Random;

public class Troca {
    public static void main(String[] args) {
        Random random = new Random();
        int [] A , B;
        int j, aux;
        int total = 20;
        A = new int[total];
        B = new int[total];

        System.out.println(" A antes da Troca");

        for(int i=0; i<20; i++){
            A[i] = random.nextInt(10*A.length);
            System.out.print(A[i] + "|");         
        }
        System.out.println("\n B antes da Troca");

        for(int i=0; i<20; i++){
            B[i] = random.nextInt(10*B.length);
            System.out.print(B[i] + "|");
        }
        j = total-1;
        for(int i=0; i<20; i++){
            aux = A[j];
            A[i] = B[j];
            B[i] = aux;
            j--;
        }
        System.out.println("\n A depois da Troca");
        for(int i=0; i<20; i++){
            System.out.print(A[i] + "|");
        }
        System.out.println("\n B Depois da Troca");
        for(int i=0; i<20; i++){
            System.out.print(B[i] + "|");
        }  
    }    
}
