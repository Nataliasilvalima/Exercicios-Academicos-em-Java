import java.util.Scanner;

public class ContasMaiusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String frase = scanner.nextLine();
        int cont =0;

        System.out.println(frase);

        for(int i = 0; i < frase.length(); i++){
            if( frase.charAt(i) == 'A' || frase.charAt(i) == 'A' || frase.charAt(i) == 'B' || frase.charAt(i) == 'C' || frase.charAt(i) == 'D' || frase.charAt(i) == 'E' || frase.charAt(i) == 'F' || frase.charAt(i) == 'G' || frase.charAt(i) == 'H' || frase.charAt(i) == 'I' || frase.charAt(i) == 'J' ||
            frase.charAt(i) == 'K' || frase.charAt(i) == 'L' || frase.charAt(i) == 'M' || frase.charAt(i) == 'N' || frase.charAt(i) == 'O' || frase.charAt(i) == 'P' || frase.charAt(i) == 'Q' || frase.charAt(i) == 'R' || frase.charAt(i) == 'S' || frase.charAt(i) == 'T' || frase.charAt(i) == 'U' || frase.charAt(i) == 'W' ||
            frase.charAt(i) == 'X' ||frase.charAt(i) == 'Y' || frase.charAt(i) == 'Z'){
                cont= cont + 1;
            } 
        }
        System.out.println("Esta frase possui: "+ cont + "letras maiusculas");
        //ou pode ser feito assim

        for(int i = 0; i < frase.length(); i++){
            Character caractere = frase.charAt(i);
            if(Character.isUpperCase(caractere)){
                cont++;
            } 
        }
        if(cont!=0){
            System.out.println("Esta frase possui letras maiusculas:." + cont);
        }
        else{
            System.out.println("Esta frase nao possui letras maiusculas:");
        }
        
        scanner.close();
    }
}