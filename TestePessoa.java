
public class TestePessoa {
    public static void main(String[] args){
        //declarando dois objetos da classe pessoa = 2 instancias da classe
        Pessoa p1, p2;
        //Instanciando o objeto p1 invocando o construtor padrao
        p1 = new Pessoa();
        System.out.println(p1.idade);
        System.out.println(p1.nome);

        p1.idade = 20;
        p1.nome = "Jose";

        System.out.println("novo nome = " + p1.nome + "nova idade = " + p1.idade);

        p1.fazAniversario();

        System.out.println(p1.nome + " fez aniversario. Sua idade e  " + p1.idade);

        p2 = new Pessoa(21, "Maria");
        System.out.println("p2: nome = " + p2.nome + " idade = " + p2.idade);

    }
    
}
