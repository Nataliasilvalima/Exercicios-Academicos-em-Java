import java.util.Scanner;

public class Perfeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int v = scanner.nextInt();
        
        perfeito(v);
        
        scanner.close();
    }
    public static void  perfeito( int v){
        int soma=0;
        for(int i=1; i<v; i++){
            if(v%i==0){
              soma = soma+i;
            }
        }
        if(soma == v){
            System.out.println("Numero digitado " + v +" e perfeito");
        }
        else{
            System.out.println("Numero digitado "+ v + " nao e perfeito");
        }
    }
}
