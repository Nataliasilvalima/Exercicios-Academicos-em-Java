/*Uma determinada empresa necessita  controlar seus estoques de cartonagens, contabilizando a quantidade
e conferencia de local de aramzenagem.
Faca um programa em Java que permita o usuário manipular esse dados informando a quantidade atual e o local
onde sera armazenado esses itens.
*/

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Questao3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [][] estoque;
        estoque = new String[6][5];

        estoque[0][0] = "Codigo        ";
        estoque[1][0] = "01            ";
        estoque[2][0] = "02            ";
        estoque[3][0] = "03            ";
        estoque[4][0] = "04            ";
        estoque[5][0] = "05            ";
        
        estoque[0][1] = "Produto        ";
        estoque[1][1] = "Box            ";
        estoque[2][1] = "File           ";
        estoque[3][1] = "Jumbo          ";
        estoque[4][1] = "Grande         ";
        estoque[5][1] = "Media          ";
       
        estoque[0][2] = "Peso suportado ";
        estoque[1][2] = "20 kg          ";
        estoque[2][2] = "5  kg          ";
        estoque[3][2] = "35 kg          ";
        estoque[4][2] = "50 kg          ";
        estoque[5][2] = "25 kg          ";
       
        estoque[0][3] = "Quant.         ";
        estoque[1][3] = "250            ";
        estoque[2][3] = "180            ";
        estoque[3][3] = "355            ";
        estoque[4][3] = "420            ";
        estoque[5][3] = "50             ";

        estoque[0][4] = "Bloco/Secao    ";
        estoque[1][4] = "A12            ";
        estoque[2][4] = "B06            ";
        estoque[3][4] = "A10            ";
        estoque[4][4] = "C15            ";
        estoque[5][4] = "A09            ";
       
        JOptionPane.showMessageDialog(null,"Acessando \nControle de Cartonagens. ");
        int opcao =  JOptionPane.showConfirmDialog(null,"Deseja visualizar a tabela com as quantidades em  estoque?");
        if(opcao == JOptionPane.YES_OPTION){
            visualizar(estoque);
        }
        else if(opcao == JOptionPane.NO_OPTION){
            int opcao2 = JOptionPane.showConfirmDialog(null,"Deseja realizar alteracoes em estoque? ");
            if(opcao2 == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null," Informe o codigo do produto a ser alterado: ");
                int produto = scanner.nextInt();
                if(produto == 01){
                    JOptionPane.showMessageDialog(null," Digite:\n 1 - Para alterar o Bloco/secao de armazegem do produto: \n" + " 2 - Para alterar a quantidade:");
                    int escolha = scanner.nextInt();
                    if(escolha == 1){
                        JOptionPane.showMessageDialog(null,"Informe o Bloco/secao: ");
                        estoque[1][4] = scanner.next();     
                        JOptionPane.showMessageDialog(null,"Local atualizado com sucesso. ");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Informe a quantidade: ");
                        estoque[1][3] = scanner.next();
                        JOptionPane.showMessageDialog(null,"Quantidade atualizada com sucesso. ");
                    }
                    visualizar(estoque);                            
                    }else if(produto == 02){
                        JOptionPane.showMessageDialog(null," Digite:\n 1 - Para alterar o Bloco/secao de armazegem do produto: \n" + " 2 - Para alterar a quantidade:");
                        int escolha = scanner.nextInt();
                        if(escolha == 1){
                            JOptionPane.showMessageDialog(null,"Informe o Bloco/secao: ");
                            estoque[2][4] = scanner.next();     
                            JOptionPane.showMessageDialog(null,"Local atualizado com sucesso. ");
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Informe a quantidade: ");
                            estoque[2][3] = scanner.next();
                            JOptionPane.showMessageDialog(null,"Quantidade atualizada com sucesso. ");
                        }
                        visualizar(estoque);     
                    }else if(produto == 03){
                        JOptionPane.showMessageDialog(null," Digite:\n 1 - Para alterar o Bloco/secao de armazegem do produto: \n" + " 2 - Para alterar a quantidade:");
                        int escolha = scanner.nextInt();
                        if(escolha == 1){
                            JOptionPane.showMessageDialog(null,"Informe o Bloco/secao: ");
                            estoque[3][4] = scanner.next();     
                            JOptionPane.showMessageDialog(null,"Local atualizado com sucesso. ");
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Informe a quantidade: ");
                            estoque[3][3] = scanner.next();
                            JOptionPane.showMessageDialog(null,"Quantidade atualizada com sucesso. ");
                        }
                        visualizar(estoque);  
                    }else if(produto == 04){
                        JOptionPane.showMessageDialog(null," Digite:\n 1 - Para alterar o Bloco/secao de armazegem do produto: \n" + " 2 - Para alterar a quantidade:");
                        int escolha = scanner.nextInt();
                        if(escolha == 1){
                            JOptionPane.showMessageDialog(null,"Informe o Bloco/secao: ");
                            estoque[4][4] = scanner.next();     
                            JOptionPane.showMessageDialog(null,"Local atualizado com sucesso. ");
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Informe a quantidade: ");
                            estoque[4][3] = scanner.next();
                            JOptionPane.showMessageDialog(null,"Quantidade atualizada com sucesso. ");
                        }
                        visualizar(estoque);  
                    }else if(produto == 05){
                        JOptionPane.showMessageDialog(null," Digite:\n 1 - Para alterar o Bloco/secao de armazegem do produto: \n" + " 2 - Para alterar a quantidade:");
                        int escolha = scanner.nextInt();
                        if(escolha == 1){
                            JOptionPane.showMessageDialog(null,"Informe o Bloco/secao: ");
                            estoque[5][4] = scanner.next();     
                            JOptionPane.showMessageDialog(null,"Local atualizado com sucesso. ");
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Informe a quantidade: ");
                            estoque[5][3] = scanner.next();
                            JOptionPane.showMessageDialog(null,"Quantidade atualizada com sucesso. ");
                        }
                        visualizar(estoque);  
                    }           
                    
                }else if(opcao2 == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null,"Obrigada(o) por utilizar nosso programa.");
                }else if(opcao2 == JOptionPane.CANCEL_OPTION){
                    JOptionPane.showMessageDialog(null,"Obrigada(o) por utilizar nosso programa.");
                }
            }
            else if(opcao == JOptionPane.CANCEL_OPTION){
                JOptionPane.showMessageDialog(null,"Obrigada(o) por utilizar nosso programa.");
            }
        
        scanner.close();
    }
    public static void visualizar( String [][] estoque){
        JOptionPane.showMessageDialog(null,"Estoque atualizado.");
        for(int i=0; i<6; i++){
            for(int j=0; j<5; j++){
                System.out.print(estoque[i][j] + " | ");
            }
             System.out.println(" ");
        }
        System.out.println(" ");
    }
}