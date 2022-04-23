import javax.swing.JOptionPane;

public class Variaveis {
    public static void main (String[] args){
        int a=5, b=3;
        double x = 4.56;
        boolean logica = true;
        char letra = 'z';
        String frase = "aprendendo Java";

        System.out.printf("a = %d\nx = %.2f\n",a, x);
        System.out.println("Soma = "+ (a + b));
        System.out.println("Divisao = "+ (double)a / b);
        JOptionPane.showMessageDialog(null, "divisao real = " + String.format("%.3f",a/x));  
        System.out.println(logica);
        logica = !logica;
        System.out.println("contrario: " + logica);
        System.out.println(frase + ""  + letra);


    }
}
