package br.edu.up.Models;

public class PessoaComEndereco {
    private Pessoa Pessoa;
    private Endereco Endereco;
    public Pessoa getPessoa() {
        return Pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        Pessoa = pessoa;
    }
    public Endereco getEndereco() {
        return Endereco;
    }
    public void setEndereco(Endereco endereco) {
        Endereco = endereco;
    }
    public String toCvs(){
        return Pessoa.getId() + ";" + Pessoa.getNome() + ";" + Endereco.getRua() + ";" + Endereco.getCidade();
    }
}
