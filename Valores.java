import java.util.Scanner;

public class Valores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valores;
        int qunt=0;

        for (int i=0; i<20; i++){
            System.out.println("Digite um valor");
            valores = scanner.nextInt();
            if (valores < 0){
                 qunt++;
            }
        }
        System.out.println("Total de numeros negativos: " + qunt);
       scanner.close();
    }
    
}
