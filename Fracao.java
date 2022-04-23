public class Fracao { 
    //atributos encapsulados
    private int denominador;
    private int numerador;
        
    //construtor com parâmetros
    public Fracao (int numerador, int denominador) {
        this.setNumerador(numerador);
        this.setDenominador(denominador);
    }
    public void setDenominador(int denominador2) {
        this.denominador = denominador2;
    }
    public void setNumerador(int numerador2) {
        this.numerador = numerador2;
    }
    //refaz o construtor padrão
    public Fracao () {
        
    }
    public int getNumerador(){
        return this.numerador;
    }
    public int getDenominador(){
        return this.denominador;
    }

    public String toString () {
        return "Fracao numerador = " + this.getNumerador() + ", denominador = " + this.getDenominador() + "";
    }
}
