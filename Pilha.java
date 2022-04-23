public class Pilha {
    private No primeiro;
    private int topo = 0;
    
    public boolean estaVazia() {
        return this.primeiro == null;
    }
    public void push (int i) {
        No novo = new No(i);
        if (!this.estaVazia()) {
            novo.setProximo(this.primeiro);
        }
        this.primeiro = novo;
        topo++;

    }
    public int pop () {
        int i = this.primeiro.getInfo();
        this.primeiro = this.primeiro.getProximo();
        topo --;
        return i;
    
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pilha p = (Pilha) o;
        return primeiro == p.primeiro;
        
    }
    public void iguais( Pilha p, Pilha l){
        if (p.equals(l)){
            System.out.println("Pilhas iguais");
        }
        else {
            System.out.println("Pilhas diferentes");
        }
    }
    @Override
    public String toString() {
        String s = "";
        if (this.estaVazia()) {
            s+= "nao há o que converter";
        }
        else {
            No aux = this.primeiro;
            while (aux != null) {
                s+= aux;
                aux = aux.getProximo();
            }
        }
        return s;
    } 
}
