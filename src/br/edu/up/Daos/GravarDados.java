package br.edu.up.Daos;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import br.edu.up.Models.PessoaComEndereco;

public class GravarDados {


    public String ArquivosCaminho = "C:\\Users\\autologon\\Documents\\Simulado\\Simulado\\src\\br\\edu\\up\\Arquivos\\";

        public Scanner scanner = new Scanner(System.in);

        public void GravarPessoasComEndereco(PessoaComEndereco pessoaEndereco){  
        var arquivo = ArquivosCaminho + "PessoasComEndereco.csv";

        try{
            FileWriter arquivoGravar = new FileWriter(arquivo, true);
            PrintWriter gravador = new PrintWriter(arquivoGravar);

            gravador.println(pessoaEndereco.toCvs());
            gravador.close();

        }
        catch(Exception ex){

        }

}
}
