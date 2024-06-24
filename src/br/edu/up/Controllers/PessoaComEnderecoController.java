package br.edu.up.Controllers;

import br.edu.up.Daos.GravarDados;
import br.edu.up.Daos.LerDados;
import br.edu.up.Models.Endereco;
import br.edu.up.Models.PessoaComEndereco;

public class PessoaComEnderecoController {
    public void GravarPessoasComEndereco(){
        LerDados ler = new LerDados();
        GravarDados gravar = new GravarDados();
        
        try{
        var ListaEndereco = ler.BuscarListaEnderecos();

        for(Endereco endereco : ListaEndereco){
            PessoaComEndereco pessoaComEndereco = new PessoaComEndereco();
            pessoaComEndereco.setEndereco(endereco);
            pessoaComEndereco.setPessoa(endereco.getPessoaProprietaria()); 
            gravar.GravarPessoasComEndereco(pessoaComEndereco);
        }
    }
    catch(Exception ex){
        System.out.println(ex.getMessage());
    }
    }
}
