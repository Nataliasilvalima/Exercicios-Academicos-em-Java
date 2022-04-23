import java.util.Scanner;

public class CalcularSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois valores: ");
        int n = scanner.nextInt(), m = scanner.nextInt();
        calcularSoma(n, m);

        scanner.close();
    }
    public static void calcularSoma( int n, int m){
        System.out.println("Numeros digitados: " + n + " e " + m + ". A soma dos dois e: " + (n+m)+ ".");

    }
}
