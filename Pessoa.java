public class Pessoa {//Modelo de pessoa
    int idade;
    String nome;
    //Construtor com parametros
    public Pessoa(int i, String n){
        idade = i;
        nome = n;
    }
 //refaz o construtor padrao
    public Pessoa(){
        idade = 0;
        nome = null;
    }

    void fazAniversario (){
        idade++;
    }
}
