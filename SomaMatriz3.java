import java.util.Scanner;

public class SomaMatriz3 {
    public static void main(String[] args) {
        int[][] A;
        A = new int[2][2];
        int[][] B;
        B = new int[2][2];
        int[][] C;
        C = new int[2][2];

        int i, j, soma = 0;
        Scanner entra = new Scanner(System.in);

        for(i=0; i<2;i++){
            for(j=0;j<2;j++){
                System.out.print("Digite o valor da posicao [ " +(i+1)+ "]["+(j+1)+"] da matriz:");
                A[i][j] = entra.nextInt();
            }
        }
        System.out.println("\n\n Conteudo da Matriz A: ");
        for(i=0; i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(A[i][j] + "|");
            }
            System.out.println("");
        }
        for(i=0; i<2;i++){
            for(j=0;j<2;j++){
                System.out.print("Digite o valor da posicao [ " +(i+1)+ "]["+(j+1)+"] da matriz:");
                B[i][j] = entra.nextInt();
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("\n\n Conteudo da Matriz B: ");
        for(i=0; i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(B[i][j] + "|");
            }
            System.out.println("");
        }
        System.out.println("\n\n Conteudo da Matriz C: ");
        for(i=0; i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(C[i][j] + "|");
            }
            System.out.println("");
        }
    }
}
