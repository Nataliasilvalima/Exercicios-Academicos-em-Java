import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int [100];
        System.out.println("Digite 100 valores: ");
        for(int i = 0; i<100; i++){
            numeros [i] = scanner.nextInt();
        }
        int soma = somaPares(numeros);

        System.out.println(" O total da soma dos valores pares contidos no vetor e: " + soma);

        scanner.close();
    }
    public static int somaPares( int [] v){
        int soma = 0;
        for(int i = 0; i<v.length; i++){
            if ( v[i] %2 == 0){
                soma = soma+v[i];
            }
        }
        return soma;
    }
}