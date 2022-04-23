import java.util.Scanner;

public class String_LastIndexOff {
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String string = entra.next();

        //No metodo caso não seja localizado na string o resultado sera "-1".
        //No metodo informado ele verifica se a letra e exatemente igual (a mesma),
        //Caso nao seja não sera realizada a comparação e o programa entendi que se trata de outra letra. 
        //Para a verficação exata o certo é usar o ignoreCase.

        //O lastIndexOf neste teste retorna a posição em que aparece o "a" pela  ultima vez.
        System.out.println(string.lastIndexOf("a"));
        //O lastIndexOf nete teste retorna a posição em que as letras "an" foram encontradas juntas pela ultima vez.
        System.out.println(string.lastIndexOf("an"));

        
        entra.close();

    }

}
