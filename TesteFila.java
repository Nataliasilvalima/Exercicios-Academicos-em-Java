import java.util.Random;

public class TesteFila {
    public static void main(String[] args) {
        FilaLigada f = new FilaLigada();
        FilaLigada p = new FilaLigada();
        Random random = new Random();

        
        do {
            if (random.nextInt(2) == 1) {
                int n = random.nextInt(10);
                System.out.println(n + " entrou");
                f.insere(n);
                System.out.println(f);
                for (int i =0; i!=n;i++);
            }
            else {
                //if (!f.estaVazia()) {
                    //System.out.println(f.remove() + " foi atendido");
                    //System.out.println(f);
                //}
            }
        } while (!f.estaVazia());

        do {
            if (random.nextInt(2) == 1) {
                int n = random.nextInt(10);
                System.out.println(n + " entrou");
                p.insere(n);
                System.out.println(f);
                for (int i =0; i!=n;i++);
            }
            else {
                //if (!f.estaVazia()) {
                   // System.out.println(f.remove() + " foi atendido");
                   // System.out.println(f);
                //}
            }
        } while (!f.estaVazia());
        
        f.iguais(f,p);
        p.iguais(f,p);
        //tamanhoFila(i);
    }

}
