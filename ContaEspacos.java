import java.util.Scanner;

public class ContaEspacos{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String frase = scanner.nextLine();
        int cont = 0;
        
        for(int i = 0; i < frase.length(); i++){
            if( frase.charAt(i) == ' '){
                cont= cont + 1;
            } 
        }
        System.out.println("Esta frase possui: "+ cont + "espacos");

        //ou pode ser feito assim:
        for(int i = 0; i < frase.length(); i++){
            Character caractere = frase.charAt(i);
            if(Character.isWhitespace(caractere)){
                cont++;
            } 
        }
        if(cont!=0){
            System.out.println("A string possui: " + cont+"espacos.");
        }
        else{
            System.out.println("A string nao possui espacos.");
        }
        
        scanner.close();
    }
}