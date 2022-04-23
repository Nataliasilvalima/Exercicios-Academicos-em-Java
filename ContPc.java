import java.util.Scanner;

public class ContPc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de computadores: ");
        int comp;
        comp = scanner.nextInt();

        if (comp %2 == 0){
            System.out.println(" Quantidade e par");
        }
        else {
            System.out.println("Quantidade e impar ");
        }
        
        scanner.close();

    }
}
