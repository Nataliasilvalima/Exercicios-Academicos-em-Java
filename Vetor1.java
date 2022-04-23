import javax.swing.JOptionPane;

public class Vetor1{

    static void leVetor(int[] v){
        System.out.println("digite" + v.length + "elementos");
        for (int i=0; i<v.length; i++){
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("posicao " + i));
        }
    }
    static int somaVetor(int[] v){
        int s=0;
        for (int i =0; i<v.length; i++){
            s+= v[i];
        }
        return s;
    } 
    static void mostraVetor(int[] v){
        for(int i =0; i<v.length; i++){
            JOptionPane.showMessageDialog(null, v[i]);
        }
    }
    public static void main(String[] args){
       //declarando
        int a, v3[]; 
        //instanciando seu obejto
        v3 = new int[10];

        int[] v1 = new int[4];

        int n = Integer.parseInt(JOptionPane.showInputDialog("digite o tamanho do vetor"));
        int[] v2 = new int[n];

        leVetor(v3);
        leVetor(v2);
        mostraVetor(v3);
        mostraVetor(v3);


        JOptionPane.showMessageDialog(null,"soma do vetor v3 = " + somaVetor(v3));
        JOptionPane.showMessageDialog(null,"soma do vetor v2 = " + somaVetor(v2));
    }
}