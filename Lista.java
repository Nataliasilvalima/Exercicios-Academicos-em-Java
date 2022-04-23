public class Lista {
    private No primeiro;
    private int tamanho=0;

    //usaremos apenas o construtor: primeiro = null
    public No getPrimeiro() {
        return this.primeiro;
    }
    public int getTamanho() {
        return this.tamanho;
    }
    public void setPrimeiro (No primeiro) {
        this.primeiro = primeiro;
    }
    public boolean estaVazia() {
        if (this.primeiro == null)
            return true;
        return false;
        //return this.primeiro == null;
    }
    public void insereInicio (int i) {
        No novo = new No(i);
        if (!this.estaVazia()) {
            novo.setProximo(this.getPrimeiro());
        }
        this.setPrimeiro(novo);
        tamanho++; 
    }
    public void insereFim (int i) {
        No novo = new No(i);
        if (this.estaVazia()) {
            this.setPrimeiro(novo);
        }
        else {
            No aux = this.primeiro;
            while (aux.getProximo() != null) { //papaleguas
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
            tamanho++;
        }
    }
    public int tamanhoLista(){
        return this.tamanho;
    }
    @Override
    public String toString() {
        String s = "Lista: ";
        if (this.estaVazia()) {
            s+= "esta vazia.";
        }
        else {
            No aux = this.primeiro;
            while (aux != null) { //coiote
                s+= aux;
                aux = aux.getProximo();
            }
            s+= "//";
        }
        return s;
    } 
    
    public int removeInicio () {
        int i = this.primeiro.getInfo();
        this.setPrimeiro(this.primeiro.getProximo());
        return i;
    }
    public int removeFim () {
        int i;
        if (this.primeiro.getProximo() == null) { //tem um só
            i = this.primeiro.getInfo();
            this.setPrimeiro(null); //esvaziei a lista
        }
        else { //tem mais que um
            No aux = this.primeiro;
            while (aux.getProximo().getProximo() != null) {
                aux = aux.getProximo();
            }
            i = aux.getProximo().getInfo();
            aux.setProximo(null);
        }
        return i;
    }
    public int removePosicao (int p) {
       int i;
       int j = 1;
       No aux = this.primeiro;
       while (aux.getProximo().getProximo() != null) {
            aux = aux.getProximo();
            j++;
            if (j == p)
                break;
        }
        i = aux.getProximo().getInfo();
        aux.setProximo(null);
        
        return i;
    }
    public void inserePosicao (int i, int n) {
        No aux = this.primeiro;
        int j=1;
        while (aux.getProximo().getProximo() != null) {
            aux = aux.getProximo();
            j++;
            if(j == i);
                break; 
        }        
        No novo = new No(n);
        aux.setProximo(novo);
        tamanho++;
        
    }
}
