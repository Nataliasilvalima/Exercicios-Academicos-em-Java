import java.util.Scanner;

public class Tabuadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero limite para tabuada: ");
        int n = scanner.nextInt();

        mostrarTabuadas(n);

        scanner.close();
    }
    public static void mostrarTabuadas( int n){
        int tabuada=0;
        for(int i=1; i<=n; i++){
            System.out.println("Tabuada do " + i);
            for(int j=0; j<=10; j++){
                tabuada = i*j;
                System.out.printf((i) + "X" + (j), tabuada);
                System.out.println(" ");
            }
        }
        System.out.println(" ");
    }
}
