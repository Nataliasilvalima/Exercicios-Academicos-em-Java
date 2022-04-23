import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as duas notas: ");
        float n = scanner.nextInt(), m = scanner.nextFloat(), media =0;
        System.out.println("Digite qual media deseja clacular:");
        System.out.println("Sendo:\n 'A' para calcular a media.\n 'P' para media ponderada.");
        char letra = scanner.next().charAt(0);
        
        media = calcularMedia(n, m, letra);
        
        System.out.println("A media do aluno e: " + media);

        scanner.close();
    }
    public static float calcularMedia( float nota1, float nota2, char letra){
        float media =0;
        if(letra == 'A'){
            media = (nota1 + nota2)/2;
        }
        if(letra == 'P'){
            media = (nota1 * 7) + (nota2 * 3) / (7+3);
        }  
        return media;    
    }
}
