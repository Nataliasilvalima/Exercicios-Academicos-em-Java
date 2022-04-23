import java.util.Random;

public class TestePilha {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        Pilha aux = new Pilha();
        Random random = new Random();
        int i=1;  
        
        while (i<=4) {
            p.push(random.nextInt(5));
            System.out.println(p);

            
            //p.pushLeve(i);
            //System.out.println(p);
            //aux.push(i);
            i++;
        }

        System.out.println();

        while (i<=4) {
            aux.push(random.nextInt(5));
            System.out.println(aux);
            i++;
        }
        p.iguais(p, aux);

        //while (!p.estaVazia()) {
           // p.pop();
            //System.out.println(p);
        //}
    }
}
