/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mb;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author razer
 */
@Named(value = "exemploMB")
@RequestScoped
public class ExemploMB {
    private String nome;
    private String senha;
    private String descricao;

    /**
     * Creates a new instance of ExemploMB
     */
    public ExemploMB() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
