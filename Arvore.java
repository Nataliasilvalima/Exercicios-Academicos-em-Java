public class Arvore {
    public static void main(String[] args) {
        double arvore1 = 1.5;
        double arvore2 = 1.1;
        int ano = 0;

        System.out.println("Calculando...:");
    
        while (arvore1 >= arvore2){
            arvore1 = arvore1 + 0.05;
            arvore2 = arvore2 + 0.01;
            ano = ano + 1;
        }
        System.out.println(ano + " Anos");
       
    }
    
}
