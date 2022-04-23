public class PilhaP3 implements ListaP3 {
    
    private NoP3 primeiro;
    
    public boolean estaVazia() {
        return this.primeiro == null;
    }
    public void push (int i) {
        NoP3 novo = new NoP3(i);
        if (!this.estaVazia()) {
            novo.setProximo(this.primeiro);
        }
        this.primeiro = novo;
    }
    public double pop () {
        double i = this.primeiro.getInfo();
        this.primeiro = this.primeiro.getProximo();
        return i;
    }
    @Override
    public String toString() {
        String s = "";
        if (this.estaVazia()) {
            s+= " Lista Vazia";
        }
        else {
            NoP3 aux = this.primeiro;
            while (aux != null) {
                s+= aux;
                aux = aux.getProximo();
            }
        }
        return s;
    }
    @Override
    public void inserirElementos() {
        // TODO Auto-generated method stub
        push(0);
        
    }
    @Override
    public void removerElementos() {
        // TODO Auto-generated method stub
        pop();
    }
    @Override
    public void verificarListaVazia() {
        // TODO Auto-generated method stub
        estaVazia();                
    } 
}

    

