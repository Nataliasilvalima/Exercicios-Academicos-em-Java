import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float peso_ideal, altura;
        System.out.println("Digite sua altura: ");
        altura = scanner.nextFloat();
        int sexo;
        System.out.println("Digite seu genero:/n 1 - Maculino /n 2 - Feminino ");
        sexo = scanner.nextInt();

        if ( sexo == 1){
            peso_ideal = (float) ((72.7 * altura) - 58);
            System.out.println("Seu peso ideal e: " + peso_ideal);
        }
        else{
            peso_ideal = (float) ((62.1 * altura)- 44.7);
            System.out.println("Seu peso ideal e: " +  peso_ideal);
        }
        
        scanner.close();
    }
}
