import java.util.Scanner;

public class VerificaValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int n = scanner.nextInt();
        verificaValor(n);

        scanner.close();
    }
    public static void verificaValor( int n){
        if( n %2 == 0){
            System.out.println("O numero digitado e par: "+ n);
        }
        else {
            System.out.println("O numero digitado e impar: " + n);
        }
    }
    
}
