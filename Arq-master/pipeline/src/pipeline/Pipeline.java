package pipeline;

import java.io.*;
import java.util.*;

public class Pipeline {
    
    public static void main (String Args[]){
        //|Busca||Decodificação||Execução||AcessoM||escrita|
        //|NOOP-||NOOP---------||NOOOP---||NOOP---||NOOP---|
        
        ArrayList<String> instrucao = new ArrayList<String>();
        String linha = new String();
        
        try{
            FileReader arq = new FileReader("instrução");
            BufferedReader lerArq = new BufferedReader(arq);
            
            do{
                linha = lerArq.readLine();
                instrucao.add(linha);                
            }while (linha != null);
            
            while(){
                // instrução->bi->lista1->decod->list2->exe->list3->acesso->list4->escrita
                /*escrita: puxa da lista 4 e escreve no registrado
                acesso: ler da list3
                execução:ler da list2 a funcao e executar com os registrador reg[i],reg[n] escrever
                decodificação:ler da list1 e grava na lista 2 (nome da funçao, reg[i],reg[n])
                busca:ler a linha de instrução e passar para list1
                */
            }
            
            
        } catch (IOException e){
            System.err.printf("Erro na abertura do arquivo: %s.\n",e.getMessage());
        }
        
    }
}

