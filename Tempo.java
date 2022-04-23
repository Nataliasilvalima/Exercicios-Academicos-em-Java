import java.util.Scanner;

public class Tempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tempo em segundos: ");
        int t = scanner.nextInt();

        verificaTempo(t);

        scanner.close();
    }
    public static void verificaTempo( int t){
        int h = 0, m = 0, s = 0;
        h = t / 3600; // para calcular as horas
        m = (t%3600)/60; // para calcular os minutos
        s = (t%3600)%60; // para calcular os segundos

        System.out.println("O tempo em horas equivale a: "+ h +" horas. Os minutos equivalem a: " + m + " minutos. Os segundos equivalem a: " + s + "");
    }  
}