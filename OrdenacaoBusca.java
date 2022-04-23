import java.util.Random;
import java.util.Scanner;

public class OrdenacaoBusca{
    static void geraVetor (int v[]) {
        Random random = new Random();//Classe random cria numeros aleatorios
        for (int i=0; i<v.length; i++){
            v[i] = random.nextInt(10*v.length);
        }    
    }
    static void exibeVetor (int v[], String msg){
        System.out.println(msg);//exibe na tela os numeros
        for (int i=0; i<v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();//pula uma linha
    }
    static void bubleSort(int v[]){
        for(int i=1; i<v.length; i++){
            for(int j=0; j<v.length-i; j++ ){
                if (v[j] > v[j+1]){
                    int temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                }
            }
        }
    }
    static boolean buscaSimples (int x, int v[]) {
        for (int i=0; i<v.length; i++ ) {
            if (v[i] == x) return true;            
        }
        return false;
    }
    static int buscaSimplesOcorrencia (int x, int v[]) {
        int cont=0;
        for (int i=0; i<v.length; i++ ) {
            if (v[i] == x) cont++;   
        }
        return cont; 
     
    }
    static void buscaSimplesPosicoesOcorrencias (int x, int v[], int ocorrencias[]) {
        for (int i=0, cont=0; i<v.length; i++ ) {
            if (v[i] == x){
                ocorrencias[cont++] = i;
           }   
        }
    }
    static int buscaSimplesComContador (int x, int v[]) {
        int cont=0;
        for (int i=0; i<v.length; i++ ) {
            cont++;
            if (v[i] == x) return cont;            
        }
        return cont;
    }
    static boolean buscaBinaria (int x, int v[]) {
        int ini =0;
        int fim = v.length-1;
        while ( ini <= fim ){
            int meio = (ini = fim)/2;
            if (v[meio] == x) return true;
            if (x > v[meio]) ini = meio +1 ;
            else fim = meio -1;
        }
        return false;
    }
    static int buscaBinariaOcorrencias (int x, int v[]) {
        int meio=0;
        int cont=0;
        int ini =0;
        int fim = v.length-1;
        while ( ini <= fim ){
            meio = (ini = fim)/2;
            if (v[meio] == x) cont=1;
            if (x > v[meio]) ini = meio +1 ;
            else fim = meio -1;
        }
        if (cont==0){
            for (int i=meio-1; i>=0 && v[i]==x; cont++, i--);
            for (int i=meio+1; i>=0 && v[i]==x; cont++, i--);
            
        }return cont;
    }
    static int buscaBinariaComContador (int x, int v[]) {
        int cont=0;
        int ini =0;
        int fim = v.length-1;
        while ( ini <= fim ){
            int meio = (ini = fim)/2;
            cont++;
            if (v[meio] == x) return cont;
            if (x > v[meio]) ini = meio +1 ;
            else fim = meio -1;
        }
        return cont;
    }
    //Trecho da main do programa
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//instanciando um objeto scanner
        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();//le o primeiro inteiro que entrara 
        int[] v = new int[n];
        
        geraVetor(v);
        //exibeVetor(v, "Vetor Original: ");
        
        if (buscaSimples(56, v))
            System.out.println("50 econtrado.");
        else
            System.out.println("50 nao encontrado");
        System.out.println("Comparacoes na busca simples: " + buscaSimplesComContador(56, v));
        
        System.out.println("Ordenando...");
        bubleSort(v);
        //exibeVetor(v, "Vetor Ordenado");
        System.out.println("Comparacoes na busca binaria: " + buscaBinariaComContador(56, v));
        System.out.println("Ocorrencias na busca binaria: " + buscaSimplesOcorrencia(56, v));
        
        scanner.close();//free libera o objeto
    }
}   