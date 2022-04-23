import java.util.Scanner;

public class String_StartsWith {
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String string = entra.next();

        //No metodo caso não seja localizado na string o resultado sera "-1".
        //No metodo informado ele verifica se a letra e exatemente igual (a mesma),
        //Caso nao seja não sera realizada a comparação e o programa entendi que se trata de outra letra. 
        //Para a verficação exata o certo é usar o ignoreCase.
        
        // O startsWith verifica se a string começa com os caracteres informados devolvendo true ou false.
        System.out.println(string.startsWith("Rato"));
        //O startsWith verifica se a string começa com os caracteres informados apos a posição informada devolvendo true ou false.
        System.out.println(string.startsWith("Rato", 2));

     entra.close();
    }

}
