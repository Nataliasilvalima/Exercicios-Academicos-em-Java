public class No {
    //atributos
    private int info;
    private No proximo;
    //construtores 
    public No (int info){
        this.info = info;
        this.proximo = null;
    }
    //metodos de acessos = getters
    public int getInfo() {
        return this.info;
    }
    public No getProximo() {
        return this.proximo;
    }
    public void setInfo( int info){
        this.info = info;
    }
    public void setProximo (No proximo){
        this.proximo = proximo;
    }
    //redefinir o toString = representação textual de um objeto
    @Override
    public String toString (){
        return this.info + " ";
    }

}

