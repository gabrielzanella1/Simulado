package br.edu.up.Models;

public class Endereco {
    private String Rua;
    private String Cidade;
    private Pessoa PessoaProprietaria;
    

    public Pessoa getPessoaProprietaria() {
        return PessoaProprietaria;
    }
    public void setPessoaProprietaria(Pessoa pessoaProprietaria) {
        PessoaProprietaria = pessoaProprietaria;
    }

    public String getRua() {
        return Rua;
    }
    public void setRua(String rua) {
        Rua = rua;
    }
    public String getCidade() {
        return Cidade;
    }
    public void setCidade(String cidade) {
        Cidade = cidade;
    }

}
