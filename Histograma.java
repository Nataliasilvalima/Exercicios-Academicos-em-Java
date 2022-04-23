import java.util.Scanner;
public class Histograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String frase = scanner.nextLine();
        String minusculas = frase.toLowerCase();
        int i=0, cont= 0, l = 0, n =0, m = 0, b = 0;
        char k ='*';

        while(i<minusculas.length()){
            if(minusculas.charAt(i) == 'a'){
                cont = cont +1;
            }
            if (minusculas.charAt(i) == 'e'){
                l = l +1;
            }
            if( minusculas.charAt(i) == 'i'){
                n = n +1;
            }
            if (minusculas.charAt(i) == 'o'){
               m = m +1;
            }
            if (minusculas.charAt(i) == 'u'){
             b = b+1;
            }
            i++;
        }
        System.out.println(" a:"+ k + cont+ "\n e:" + k + l + "\n i:" + k + n + 
        "\n o:" + k + m + "\n u:" + k + b);
        scanner.close();
    }
}
