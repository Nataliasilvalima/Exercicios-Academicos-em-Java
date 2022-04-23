import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros;
        numeros = new int[10];
        System.out.println("Digite 10 numeros inteiros:");
        for(int i=0; i<numeros.length;i++){
            numeros[i] = scanner.nextInt();
        }
        
        saoAmigos(numeros);

        scanner.close();
    }
    public static void saoAmigos( int [] v){
        int [] amigos;
        amigos= new int[5];
        int [] acumulador;
        acumulador= new int[10];
        int m=0;
        
        for(int i=0; i<v.length;i++){
            System.out.println("\nOs divisores de "+ v[i]+ " sao: ");
            for(int j=1; j<=v[i]/2; j++){
                if(v[i]%j == 0){
                    System.out.print("| " +j+" | "); 
                    acumulador[i] += j; 
                }
            }System.out.println(" ");
        }
        for(int i=0; i<v.length; i+=2){
            if(v[i] == acumulador[i+1] && v[i+1] == acumulador[i]){
                amigos[m] = 1;
            }else{
                amigos[m] = 0;
            }
            m++;
        }
        System.out.println("\nNumeros digitados:");
        for(int i=0; i<v.length;i++){
            System.out.print(" | "+ v[i] + " | ");
        }
        System.out.println("\n\nAmigos:");
        for(int i=0; i<amigos.length;i++){
            System.out.print(" | " + amigos[i] + " | ");
        }
        System.out.println( " ");      
    }
}