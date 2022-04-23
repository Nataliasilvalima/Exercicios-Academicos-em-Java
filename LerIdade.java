import java.util.Scanner;
public class LerIdade {
    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);
        int mes, ano, dias, total, total2, total3;
        
        System.out.println("Digite sua idade em anos, meses e dias: ");
        ano = entra.nextInt();
        mes = entra.nextInt();
        dias = entra.nextInt();

        total = 365 * ano;
        total2 = 30 * mes;
        total3 = total + total2 +dias;
        
        System.out.println("Sua idade em dias e: " + total3);
 
        entra.close();
    }
}