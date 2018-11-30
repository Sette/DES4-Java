

package br.ufmt.rnp.des4.webpessoa.mb;

import br.ufmt.rnp.des4.webpessoa.dao.PessoaDAO;
import br.ufmt.rnp.des4.webpessoa.entidades.Endereco;
import br.ufmt.rnp.des4.webpessoa.entidades.Pessoa;
import br.ufmt.rnp.des4.webpessoa.utils.Util;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value="pessoaMB")
@RequestScoped

public class PessoaMB {
    private Pessoa pessoa;
    private PessoaDAO dao;
    private List<Pessoa> pessoas;
    private Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    @PostConstruct
    public void init(){
        pessoa = new Pessoa();
        endereco = new Endereco();
        dao = new PessoaDAO();
        pessoas = dao.consultar();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public void salvar(){
        
        pessoa.getEnderecos().add(endereco);
        
        if(pessoa.getId() == 0){
            dao.inserir(pessoa);
        }else{
            
            dao.editar(pessoa);
        }
        
        pessoa = new Pessoa();
        endereco = new Endereco();
        pessoas = dao.consultar();
        
    }
    
    public void excluir(Pessoa pessoa){
        dao.excluir(pessoa);
        pessoas=dao.consultar();
        Util.addMensagem("Registro removido com Sucesso");
        
    }
    
    public void editar(Pessoa pessoa){
        this.pessoa = pessoa;
        for (Endereco end : pessoa.getEnderecos()) {
            this.endereco = end ;
            break;
        }
        
        
    }


    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
    
    
}
