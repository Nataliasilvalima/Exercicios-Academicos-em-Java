import java.util.Random;
import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opcao\n0-Sair\n1-Imprime o vetor\n2-Valores das posicoes impares\n3-Quadrado dos numeros das posicoes pares\n4-Soma dos numeros divisiveis por 4 \n ");
        int opcao = scanner.nextInt();
        int [] v = new int [5];
        Random random = new Random();
        
        for(int i = 0; i<5; i++){
            v[i] = random.nextInt(10*v.length);
        }
        while(opcao >=1 && opcao <=4){
            switch (opcao){
                case 1:
                    f1(v);
                    break;
                case 2:
                    f2(v);
                    break;
                case 3:
                    f3(v);
                    break;
                case 4:
                    f4(v);
                    break;
                default:
                    System.out.println("Nao existe um metodo para a opcao digitada: ");
                    break;
            }
            System.out.print("\nEscolha uma opcao\n0-Sair\n1-Imprime o vetor\n2-Valores das posicoes impares\n3-Quadrado dos numeros das posicoes pares\n4-Soma dos numeros divisiveis por 4 \n ");
			opcao = scanner.nextInt();
        }
       scanner.close();
    }
    public static void f1( int [] v){
        for(int i = 0; i<5; i++){
           System.out.print(v[i]);
           System.out.print(" | ");
        }
    }
    public static void f2( int [] v){
        for(int i = 0; i<5; i++){
            if(i%2 == 1){
                System.out.print(v[i]);
                System.out.print("|");
            }
        }
    }
    public static void f3( int [] v){
        for(int i = 0; i<5; i++){
            if(i%2 == 0){
                System.out.print(v[i] * v[i] + "|");
            }
        }      
    }
    public static void f4( int [] v){
        int soma = 0;
        for(int i = 0; i<5; i++){
            if(i%4 == 0){
                soma = soma+v[i];
            }
        }  
        System.out.println(" A soma dos numeros divisiveis por 4 e : " + soma);      
    }
}