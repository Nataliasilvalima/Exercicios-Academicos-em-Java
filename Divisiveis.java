import java.util.Scanner;

public class Divisiveis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] vet;
        int i, j,total;
        int cont = 0;
        total = 10;
        vet = new int[total];
        System.out.println("Digite os valores: ");
        i=0;
        while(i<total){
          j = scanner.nextInt();
            if(j %5== 0){
                vet[i] = j;
                i++;
            }
            else{
                 cont = cont+1;
            }
        }
        for (i=0; i<10; i++){
            System.out.print(vet[i] + "|");
        }
       System.out.println("A quantidade de valores nao divisiveis por 5 e: "+ cont);

       scanner.close();
    } 
}
