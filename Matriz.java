import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        int[][] numeros;
        numeros = new int[3][4];
        int i, j;
        Scanner entra = new Scanner(System.in);
        
        for(i=0; i<3;i++){
            for(j=0;j<4;j++){
                //Para preencher a Matriz com os numeros que o usuaro digitar
                System.out.print("Digite o valor da posicao [ " +(i+1)+ "]["+(j+1)+"] da matriz:");
                numeros[i][j] = entra.nextInt();
            }
        }
        System.out.println("\n\n Conteudo da Matriz: ");
        for(i=0; i<3;i++){
            for(j=0;j<4;j++){
                //Exibindo a matriz
                System.out.print(numeros[i][j] + "|");
            }
            System.out.println("");
        }
        entra.close();
    }
    
}