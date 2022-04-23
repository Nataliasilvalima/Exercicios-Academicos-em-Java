import java.util.Random;

public class TesteP3 {
    public static void main(String[] args) {
        FilaP3 fila = new FilaP3();
        Random random = new Random();

        do {
            if (random.nextInt(2) == 1) {
                double f = random.nextInt(10);
                System.out.println(f + " entrou na fila");
                fila.insere(f);
                System.out.println(fila);
            }
            else {
                if (!fila.estaVazia()) {
                    System.out.println(fila.remove() + " saiu da fila");
                    System.out.println(fila);
                }
            }
        } while (!fila.estaVazia());

        PilhaP3 pilha = new PilhaP3();
        int j=1;
        while (j<=6) {
            pilha.push(random.nextInt(10));
            System.out.println(pilha);
            j++;
        }
        while (!pilha.estaVazia()) {
            pilha.pop();
            System.out.println(pilha);
        }
        
    }
    
}
