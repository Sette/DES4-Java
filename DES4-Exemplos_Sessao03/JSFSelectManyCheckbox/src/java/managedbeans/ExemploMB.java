/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author razer
 */
@ManagedBean
@RequestScoped
public class ExemploMB {
    private List<String> escolhidos = new ArrayList<String>();
    /**
     * Creates a new instance of ExemploMB
     */
    public ExemploMB() {
        escolhidos.add("PR");
        escolhidos.add("SC");
    }

    public List<String> getEscolhidos() {
        return escolhidos;
    }

    public void setEscolhidos(List<String> escolhidos) {
        this.escolhidos = escolhidos;
    }
    
    
}
