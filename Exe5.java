import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  media;
        char  letra;

        System.out.println("Digite a media do aluno: ");
        media = scanner.nextDouble();
        while (media<0 || media> 10){
            System.out.println("Media ivalida digite a media do aluno.");
            media = scanner.nextDouble();
        }
        letra = emitirConceito(media);
        System.out.println("O conceito do aliuno foi : " + letra);
        
        scanner.close();

    }
    public static char emitirConceito(double media) {
      if(media>=0 && media<=5 ){
          return 'D';
        }
        else{
            if(media>=0 && media<=7 ){
                return 'C';
            }
            else{
                if(media>=0 && media<=9 ){
                    return 'B';
                }
                else{
                    return 'A';
                }
            }
        }
    }
}
