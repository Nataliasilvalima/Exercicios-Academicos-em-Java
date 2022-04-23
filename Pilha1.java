public class Pilha1 {
    private int[] v;
    private int topo;
    public Pilha1 (int capacidade) {
        this.v = new int[capacidade];
        this.topo = 0;
    }
    public int getTopo() {
        return this.topo;
    }
    public boolean estaVazia () {
        return this.topo == 0;
    }
    public boolean estaCheia () {
        return this.topo == v.length;
    }
    public void push (int elemento) { //empilha
        this.v[this.topo++] = elemento;
    }
    public int pop () { //desempilha
        return this.v[--this.topo];
    }
    public int tamanhoPilha(){
        return this.topo - 1;
    }
    public void pilhasIguais( Pilha1 p, Pilha1 l){
        for(int i = 0; i < p.v.length; i++){
            for (int j =0; j < l.v.length; j++){
                if ( p.equals(l)){
                    System.out.println("Pilhas iguais");
                }
                else {
                    System.out.println("Pilhas diferentes");
                }
            }
        }

    }
    public boolean pushMenor (int elemento){
        topo = topo - 1;
        if(elemento < topo){
            push(elemento);
            return true;
        }
        return false;
        
    }
    @Override
    public String toString () {
        String s = "Pilha: [ ";
        if (this.estaVazia()) {
            s+= "vazia ";
        }
        else {
            for (int i=topo-1; i>=0; i--) {
                s+= this.v[i] + " ";
            }
        }
        s+= "]";
        return s;
    }
}
