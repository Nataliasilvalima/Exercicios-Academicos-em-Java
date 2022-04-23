import java.util.Scanner;

public class CalculoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do Veiculo de fabrica: ");
        int veiculo = scanner.nextInt();
        int distribuidor, impostos, total;

        distribuidor = (veiculo * 32)/ 100;
        impostos = (veiculo * 41) /100;
        total = veiculo + distribuidor + impostos;

        System.out.println(" O valor do veiculo para o consumidor e: " + total);

      scanner.close();
    }
    
}
