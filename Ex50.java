import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        int[]vetor;
        vetor = new int [50];
        int n;

        for(int i=0; i<50; i++){
            System.out.println("Digite o valor: ");
            vetor[i] = scanner.nextInt();
        }
        n = vetor[0];
        for(int i=0; i<50; i++){
            if(vetor[i] > n){
                n = vetor[i];
            }
        } 
        System.out.println("O numero maior e: " + n);
        scanner.close();

    }
}
