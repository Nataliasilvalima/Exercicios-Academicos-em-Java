import java.util.Scanner;
public class SomaQuadrada {
    public static void main(String[] args) {
        int[][] numeros;
        numeros = new int[4][4];
        int i, j, soma = 0;
        Scanner entra = new Scanner(System.in);

        for(i=0; i<3;i++){
            for(j=0;j<4;j++){
                System.out.print("Digite o valor da posicao [ " +(i+1)+ "]["+(j+1)+"] da matriz:");
                numeros[i][j] = entra.nextInt();
            }
        }
    }



    entra.close();
}
