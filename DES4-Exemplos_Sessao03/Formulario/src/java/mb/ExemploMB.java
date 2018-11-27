package mb;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
    
}
