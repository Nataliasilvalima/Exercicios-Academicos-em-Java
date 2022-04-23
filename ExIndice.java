import java.util.Scanner;

public class ExIndice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] vet;
        vet = new int[100];
        int soma;

        System.out.println("Digite os valores: ");
        for(int i=0; i<100; i++){
            vet[i] = scanner.nextInt(); 
        }
        soma = 0;
        for(int i=0; i<100; i++){
            if ( i%2 == 1){
                soma = soma+vet[i];
            }
        }
        for(int i=0; i<100; i++){
            System.out.print(vet[i] + "|");
        }
        System.out.println("O valor da soma e "+ soma);

       scanner.close();
    }
}
