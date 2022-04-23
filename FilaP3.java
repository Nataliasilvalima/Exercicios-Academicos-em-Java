public class FilaP3 implements ListaP3 {
    
    private int tamanho;
    private NoP3 primeiro;
    private NoP3 ultimo;

    public FilaP3 () {
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
    public void insere (double i) {
        NoP3 novo = new NoP3(i);
        if (this.estaVazia()) {
            this.primeiro = novo;
        }
        else {
            this.ultimo.setProximo(novo);
        }
        this.ultimo = novo;
        this.tamanho++;
    }
    public double remove () {
        double copia = this.primeiro.getInfo();
        this.primeiro = this.primeiro.getProximo();
        this.tamanho--;
        if (this.tamanho==0)
            this.ultimo = null;
        return copia;
    }

    @Override
    public String toString() {
        String s = "";
        if (this.tamanho == 0) {
            s+= "fila vazia";
        }
        else {
            NoP3 aux = this.primeiro;
            while (aux != null) {
                s+= aux.getInfo() + "->";
                aux = aux.getProximo();
            }
            s+= "//";
        }
        return s;
    }
    @Override
    public void inserirElementos() {
        // TODO Auto-generated method stub
        insere(tamanho);
    }
    @Override
    public void removerElementos() {
        // TODO Auto-generated method stub
        remove();
    }
    @Override
    public void verificarListaVazia() {
        // TODO Auto-generated method stub
        estaVazia();
    }
}

    