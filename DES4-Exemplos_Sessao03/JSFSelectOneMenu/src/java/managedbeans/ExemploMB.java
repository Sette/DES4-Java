/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author razer
 */
@ManagedBean
@RequestScoped
public class ExemploMB {
    private String sexo;
    
    /**
     * Creates a new instance of ExemploMB
     */
    public ExemploMB() {
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
