import javax.swing.JOptionPane;

public class Entrada {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite ma palavra");
        System.out.println("voce digitou " + palavra);

        String aux = JOptionPane.showInputDialog("Digite um inteiro");//Tipos de entrada
        int i = Integer.parseInt(aux);
        System.out.println("voce digitou " + aux);//para aparecer na janela
        System.out.println("voce digitou " + i);
        
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite um real"));//Converte string em real
        System.out.println("voce digitou " + x);

        char simbolo = JOptionPane.showInputDialog("Digite um caracter").charAt(0); //Converte string em simbolo
        System.out.println("voce digitou " + simbolo);




    }
}
