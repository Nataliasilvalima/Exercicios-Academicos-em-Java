import java.util.Scanner;

public class Positivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 20 numeros: ");
        double [] Num = new double[20];
        for(int i = 0; i<20; i++){
            Num [i] = scanner.nextInt();
        }
        imprimirPos(Num);

        scanner.close();
    }
    public static void imprimirPos( double [] v){
        System.out.println(" Os numeros positivos sao: ");
        for(int i=0; i<v.length; i++){
            if(v[i] >= 0){
                System.out.println(String.format("%.0f",v[i]));
            }
        }
    }
}