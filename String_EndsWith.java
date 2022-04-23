import java.util.Scanner;

public class String_EndsWith {
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String string = entra.next();
        
        //O endsWith verifica se a string termina com os caracteres informados devolvendo true ou false.
        System.out.println(string.endsWith("a"));

        //No metodo caso não seja localizado na string o resultado sera "-1".
        //No metodo informado ele verifica se a letra e exatemente igual (a mesma),
        //Caso nao seja não sera realizada a comparação e o programa entendi que se trata de outra letra. 
        //Para a verficação exata o certo é usar o ignoreCase.
        
        entra.close();

    }
}
