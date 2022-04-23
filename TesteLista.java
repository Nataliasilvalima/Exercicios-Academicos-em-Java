public class TesteLista {
    public static void main(String[] args) {
        Lista l = new Lista();
        System.out.println("lista criada:\n" + l);

        l.insereInicio(2);
        l.insereInicio(4);
        l.insereInicio(6);
        l.insereInicio(8);
        l.insereInicio(1);
        l.insereInicio(3);
        System.out.println("lista depois das insecoes de inicio:\n" + l);
        
        l.tamanhoLista();
        System.out.println(l.getTamanho());

        l.removePosicao(5);
        System.out.println("lista depois da remocao\n" + l);

        l.inserePosicao(3, 20);
        System.out.println("lista depois das insecao na posicao:\n" + l);

        l.insereFim(1);
        l.insereFim(3);
        l.insereFim(5);
        l.insereFim(7);
        l.insereFim(9);
        l.insereFim(11);
        System.out.println("lista depois das insercoes de fim:\n" + l);

        l.tamanhoLista();
        System.out.println(l.getTamanho());

        if (!l.estaVazia()) {
            System.out.println(l.removeInicio() + " foi removido do inicio");
            System.out.println("lista depois da remocao de inicio:\n" + l);
        }
        if (!l.estaVazia()) {
            System.out.println(l.removeFim() + " foi removido do fim da lista");
            System.out.println("lista depois da remocao de fim:\n" + l);
        }
    }
}
