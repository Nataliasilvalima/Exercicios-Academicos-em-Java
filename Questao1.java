import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a opcao desejada:" + "\n1 - Verificacao de Strings repetidas:" 
		+"\n2 - Verificacao de valores repetidos:" + "\n3 - Verificacao de matriz triangular:" + "\n0 - Sair:");
		int n = scanner.nextInt();
		int k , l;
		boolean z;
						
		while(n!=0) {
			if( n == 2){
				System.out.println("Digite um valor para a verificacao: ");
			}
			switch(n) {
				case 1:
					f1();
					break;
				case 2:
					k = scanner.nextInt();
					l = f2(k);
					if( l == 1){
						System.out.println("Numero digitado: " + k + ". Aparece duas vezez no vetor.");
					}
					else{
						System.out.println("Numero digitado: " + k + ". Nao aparece duas vezes no vetor.");
					}
					break;
				case 3:
					System.out.println("Digite a ordem da matriz:");
					int o = scanner.nextInt();
					int [][] matriz;
					matriz = new int[o][o];
					System.out.println("Digite os valores da matriz:");
					for(int i=0; i<o; i++){
						for(int j=0; j<o; j++){
							System.out.print("Digite o valor da posicao["+(i+1)+"]["+(j+1)+"] da matriz: ");
							matriz[i][j] = scanner.nextInt();
						}
					}
					z = f3(matriz , o);
					if( z == true){
						System.out.println("Matriz e triangular.");
					}
					else{
						System.out.println("Matriz nao e triangular.");
					}
					break;
				default:
					System.out.println("Opcao invalida!! Digite novamente:");	
					break;
			}
			System.out.println("\nDigite a opcao desejada:" + "\n1 - Verificacao de Strings repetidas:" 
			+"\n2 - Verificacao de valores repetidos:" + "\n3 - Verificacao de matriz triangular:"+ "\n0 - Sair:");
			n = scanner.nextInt();
		}

		System.out.println("Obrigada por utilizar nosso programa.");
		scanner.close();	
	}
	public static void f1()  {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String frase = scanner.nextLine();
		System.out.println("Digite uma palavra: " );
		String palavra = scanner.next();
		int conta = 0;

		for(int i=0; i<frase.length();i++){
			if (frase.substring(i).startsWith(palavra)){
				conta++;
			}
		}	
		System.out.println("A palavra "+ palavra + " se repete " + conta +" vezes."); 
	}
	public static int f2(int k){
		Scanner scanner = new Scanner(System.in);
		int [] vet;
		vet = new int[50];
		int repete = 0;
		int contar = 0;

		System.out.println("Digite os valores:");
		for(int i=0; i<vet.length; i++){
			vet[i] = scanner.nextInt();
		}
		for(int i=0; i<vet.length; i++){
			if(vet[i] == k){
				contar = contar + 1;
				repete = 1;
			} 
		}
		return repete;
	}
	public static boolean f3( int [][] matriz,int o) {
		boolean f = true;

		System.out.println("\nMatriz informada:  \n");
		for(int i=0;i<o;i++){
			for(int j=0;j<o;j++){	
				System.out.print(matriz[i][j]+" | ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");

		for(int i=0; i<o; i++){
			for(int j=0; j<o; j++){
				if(j<i && matriz[i][j] !=0){
					f = false;
				}
				
			}
		} 
		return f;	
	}	
}