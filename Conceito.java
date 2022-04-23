import java.util.Scanner;

public class Conceito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a media do Aluno: ");
        double m = scanner.nextFloat();

        System.out.print("A media digitada foi: ");
        System.out.println(String.format("%.1f" ,m));
       
        char conceito; 
        conceito = emitirConceito(m);

        System.out.println("O conceito do aluno foi: "+ conceito);

        scanner.close();
    }
    public static char emitirConceito( double m){
        if(m >= 0  &&   m < 5){
           return  'D';
        }
        else{
            if(m >= 5  &&   m < 7){
                return  'C';
            }
            else{
                if(m >= 7  &&   m < 9){
                    return  'B';
                }
                else{
                    return  'A';
                    
                }
            }
        }
    }
}