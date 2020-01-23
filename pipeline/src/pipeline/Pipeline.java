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
            
            while(!instrucao.isEmpty()){
            
            }
            
            
        } catch (IOException e){
            System.err.printf("Erro na abertura do arquivo: %s.\n",e.getMessage());
        }
        
    }
}

