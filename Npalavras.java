import java.util.Scanner;

public class Npalavras{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe 5 palavras que comecem com a letra CH: ");
        int n = 5;
        int i =0;
        String [] v;
        v = new String [5];
        String letra ;

        while (i < 5){
            letra = scanner.nextLine();

            System.out.println(v[i] + " ");
            i++;
        }
        







        scanner.close();


    }
}