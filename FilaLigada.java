public class FilaLigada {
    private int tamanho;
    private No primeiro;
    private No ultimo;

    //por clareza, vamos escrever o construtor padrão
    public FilaLigada () {
        this.tamanho=0;
        this.primeiro=null;
        this.ultimo=null;
    }
    public int getTamanho () {
        return this.tamanho;
    }
    public boolean estaVazia(){
        return this.tamanho==0;
    }
    public void insere (int i) {
        No novo = new No(i);
        if (this.estaVazia()) {
            this.primeiro = novo;
        }
        else {
            this.ultimo.setProximo(novo);
        }
        this.ultimo = novo;
        this.tamanho++;
    }
    public int remove () {
        int copia = this.primeiro.getInfo();
        this.primeiro = this.primeiro.getProximo();
        this.tamanho--;
        if (this.tamanho==0)
            this.ultimo = null;
        return copia;
    }
    public void inverter (int i) {
        Pilha p = new Pilha();
        No novo = new No(i);
        if (this.estaVazia()) {
            this.primeiro = novo;
        }
        else {
            this.ultimo.setProximo(novo);
        }
        this.ultimo = novo;
        this.tamanho++;
        this.primeiro = this.ultimo;
    }
    public int tamanhoFila (int n ){
       return getTamanho();
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilaLigada filaLigada = (FilaLigada) o;
        return primeiro == filaLigada.primeiro;
    
    }
    public void iguais( FilaLigada f, FilaLigada p){
        if (f.equals(p)){
            System.out.println("Filas iguais");
        }
        else {
            System.out.println("Filas diferentes");
        }
    }

    @Override
    public String toString() {
        String s = "";
        if (this.tamanho == 0) {
            s+= "fila vazia";
        }
        else {
            No aux = this.primeiro;
            while (aux != null) {
                s+= aux.getInfo() + "->";
                aux = aux.getProximo();
            }
            s+= "//";
        }
        return s;
    }
}
