import javax.swing.JOptionPane;

public class LerString {
    public static void main(String[] args) {
        String nome1 = JOptionPane.showInputDialog("Digite um nome");
        String nome2 = JOptionPane.showInputDialog("Digite um nome");

        System.out.println("Voce digitou os nomes " + nome1 +" " + nome2);
        System.out.println("A segunda letra do nome1 e " + nome1.charAt(1) + " " + "\nA segunda letra do nome2 e " + nome2.charAt(1));

    }

}
