import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qnt;
        System.out.println("Digite a quantidade de valores para vetor: ");
        qnt = scanner.nextInt();
        double[] valores = new double[qnt];
        int i;
        for(i=0; i<qnt; i=i+1){
            System.out.println("Digite o " +(i+1) + "O valor: ");
            valores[i] = scanner.nextDouble();
        }
        mostraVetor(valores, qnt);
        calcularMedia(valores, qnt);
        maiorValor(valores, qnt);

        scanner.close();
    }
    public static void mostraVetor(double[] valores, int tam){
        int i;
        System.out.println("Valores contidosno vetor: ");
        for( i =0; i<tam; i=i+1){
            System.out.println(valores[i] + "|");
        }
        return;
    }  
    public static void calcularMedia(double[] valores, int tam){
        int i;
        double media = 0;
        for( i =0; i<tam; i=i+1){
            media=media+valores[i];
        }
        media=media/tam;
        System.out.println("Media dos valores contidos nos valores do vetor: "+ media);
        return;
    }   
    public static double maiorValor(double[] vet, int tam){
        int i;
        double maior = vet[0];

    }
}
