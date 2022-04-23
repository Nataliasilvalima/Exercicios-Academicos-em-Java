import java.util.Random;

public class TestePilha2 {
    public static void main(String[] args) {
        Pilha1 p = new Pilha1(10);
        Pilha1 l = new Pilha1(10);
        Random random = new Random();
        int i=1;
        while (i<=6) {
            p.push(random.nextInt(10));
            System.out.println(p);
              i++;
        }
        p.tamanhoPilha();
        System.out.println(p.getTopo());

        /*while (i<=6){
            l.pushMenor(random.nextInt(5));
            System.out.println(l);
            i++;
        }*/
        l.tamanhoPilha();
        System.out.println(l.getTopo());

        while (i<=6) {
            l.push(random.nextInt(10));
            System.out.println(l);
            i++;
        }
        l.tamanhoPilha();
        System.out.println(l.getTopo());

        /*while (!p.estaVazia()) {
            p.pop();
            System.out.println(p);
        }*/
        
    }
}
