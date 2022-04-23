import java.util.Scanner;

public class String_IndexOf {
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);

        System.out.printl ("Digite uma palavra:");
        String string = entra.next();

        //No metodo caso não seja localizado na string o resultado sera "-1".
        //No metodo informado ele verifica se a letra e exatemente igual (a mesma),
        //Caso nao seja não sera realizada a comparação e o programa entendi que se trata de outra letra. 
        //Para a verficação exata o certo é usar o ignoreCase.
        
        System.out.println(string);
        //O IndexOf neste teste retorna a posição de que a primeira vez a letra foi localizada.
        System.out.println(string.indexOf("a"));
        //O IndexOf nete teste retorna a posição em que as letras "an" foram encontradas juntas.
        System.out.println(string.indexOf("an"));
        //O IndexOf neste teste retorna a posição em que o a aparece pela primeira vez apos a posição 5.
        System.out.println(string.indexOf("a" ,5));


        entra.close();

    }

}
