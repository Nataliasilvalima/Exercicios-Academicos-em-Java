import java.util.Scanner;
public class LerVetor2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]vetor, vt;
        vetor = new int [15];
        vt = new int [15];

        for(int i=0; i<15; i++){
            System.out.println("Digite o valor: ");
            vetor[i] = scanner.nextInt();
            vt[i] = vetor[i] * 3;
        }
        System.out.println("Os valores * 3: ");
        for ( int i=0; i<15; i++){
            System.out.print(vetor[i] + "|");
        }
        for ( int i=0; i<15; i++){
            System.out.print(vt[i] + "|");
        }
        scanner.close();
    }
    
}


