package br.edu.up.Daos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.Models.Endereco;
import br.edu.up.Models.Pessoa;
import br.edu.up.Models.PessoaComEndereco;

public class LerDados {

    public String ArquivosCaminho = "C:\\Users\\autologon\\Documents\\Simulado\\Simulado\\src\\br\\edu\\up\\Arquivos\\";

    public Scanner scanner = new Scanner(System.in);

    public List<Pessoa> BuscarListaPessoas() throws Exception {

        try {
            List<Pessoa> ListaPessoas = new ArrayList<>();

            File arquivoLeitura = new File(ArquivosCaminho + "Pessoa.csv");
            Scanner leitor = new Scanner(arquivoLeitura);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(";");

                int pessoaId = Integer.parseInt(dados[0]);
                String nome = dados[1];

                Pessoa pessoa = new Pessoa();
                pessoa.setId(pessoaId);
                pessoa.setNome(nome);
                ListaPessoas.add(pessoa);

            }

            return ListaPessoas;

        } catch (Exception ex) {
            throw new Exception("algo deu errado buscar a lista de pessoas");
        }
    }

    public List<Endereco> BuscarListaEnderecos() throws Exception {

        try {
            List<Endereco> ListaEndereco = new ArrayList<>();

            File arquivoLeitura = new File(ArquivosCaminho + "Enderecos.csv");
            Scanner leitor = new Scanner(arquivoLeitura);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(";");

                String rua = dados[0];
                String Cidade = dados[1];
                int pessoaId = Integer.parseInt(dados[2]);

                Endereco endereco = new Endereco();
                endereco.setRua(rua);
                endereco.setCidade(Cidade);

                var ListaPessoa = BuscarListaPessoas();
                for (Pessoa pessoa : ListaPessoa) {
                    if (pessoa.getId() == pessoaId) {
                        endereco.setPessoaProprietaria(pessoa);
                    }
                }
                ListaEndereco.add(endereco);
            }

            return ListaEndereco;

        } catch (Exception ex) {
            throw new Exception("algo deu errado buscar a lista de enderecos");
        }
    }
}