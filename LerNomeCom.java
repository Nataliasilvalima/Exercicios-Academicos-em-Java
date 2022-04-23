import java.util.Scanner;

public class LerNomeCom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();
        String minusculas = nome.toLowerCase();
        int i=0, cont= 0;

        while(i<minusculas.length()){
            if(minusculas.charAt(i) == 'a' || minusculas.charAt(i) == 'e' || minusculas.charAt(i) == 'i'
            || minusculas.charAt(i) == 'o' || minusculas.charAt(i) == 'u'){
             cont = cont+1;
            }
            i++;
        }
        System.out.println(" O nome possui " + cont + "vogais");

        scanner.close();  
    }
}
