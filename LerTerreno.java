import java.util.Scanner;

public class LerTerreno {
    public static void main(String[] args) {
        Scanner entra =  new Scanner(System.in);
        System.out.println("Digite a base e altuda do terreno: ");
        int base = entra.nextInt();
        int altura = entra.nextInt();

        int total = base * altura;

        System.out.println("A area do terreno e: " + total + "  metros quadrados");

        entra.close();

    }
    
}
