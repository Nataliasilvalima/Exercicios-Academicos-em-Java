import java.util.Scanner;

public class Eleitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        System.out.println("Seja bem Vindo ao Sistema de verificação de voto.\n Digite sua idade: ");
        idade = scanner.nextInt();

        if ( idade < 16){
            System.out.println("Nao pode votar");
        }
        if (( idade >= 18) &&  (idade <= 64)){
            System.out.println("Voto Obrigatorio");
        }
        if ((idade >= 16) && (idade < 18)){
            System.out.println("Voto Opcional");
        }
        if ( idade >= 65){
            System.out.println("Voto Opcional");
        }

        System.out.println("Muito Obrigada por utilizar nosso sistema");

        scanner.close();
    }
    
}
