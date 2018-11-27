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
    private String texto;
    private String acao;

    /**
     * Creates a new instance of ExemploMB
     */
    public ExemploMB() {
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }
    public void acaoBotao() {
        this.acao = "Pressionou um BOTÃO de ação";
    }
    public void acaoLink() {
        this.acao = "Pressionou um LINK de ação";
    }
}
