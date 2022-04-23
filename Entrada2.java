import java.util.Scanner;
public class Entrada2{
    public static void main(String args[]){
        Scanner input;// declara a variavel de referência
        input = new Scanner(System.in);// intancia o objeto

        int i = input.nextInt();

        double x = input.nextDouble();

        boolean b = input.nextBoolean();

        char l = input.next().charAt(0);

        System.out.println("inteiro " + i + "\ndouble: " + x + "\nboolean: "+ b + "char: " + l);
        input.nextLine();
        String palavra1 = input.nextLine();
        String palavra2 = input.nextLine();

        System.out.println("palavra1 = "+ palavra1 +"\npalavra2 = " + palavra2);
        l = input.next().charAt(0);
        System.out.println("outro char: " + l);

        //funções matemáticas
        System.out.println("raiz quadrada" + Math.sqrt(x));
        System.out.println("raiz cubica: " + Math.pow(i, 3));

        input.close();

    }

    
}
