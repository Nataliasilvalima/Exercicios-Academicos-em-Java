import java.util.Scanner;

public class LerVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]vetor;
        vetor = new int [20];

        for(int i=0; i<20; i++){
            System.out.println("Digite o valor: ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("Os valores inversos: ");
        for ( int i= 20; i>0; i--){
            System.out.println(i);
        }
        scanner.close();
    }
    
}
