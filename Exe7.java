import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        lerVetor();
    }
    public static void lerVetor(){
        Scanner scanner = new Scanner(System.in);
        
        int i, maior, menor;
        int[] vetor = new int[10];

        System.out.println("Digite 10 valores para o vetor: ");
        
        for(i=0; i<10; i++){
            System.out.println("Digite o " + (i+1) + "o valor");
            vetor[i] = scanner.nextInt();
        }
        maior = vetor[0];
        menor = vetor[0];

        for (i=1; i<10;i++){
            if(vetor[i]>maior){
                maior=vetor[i];
            }
            if(vetor[i]<menor){
                menor=vetor[i];
            }
        }
        System.out.println("O maior valor do vetor e: " + maior);
        System.out.println("O menor valor do vetor e: " + menor);
       
        scanner.close();
    }
}