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
@Named(value = "cicloMB")
@RequestScoped
public class CicloMB {
    private String texto;
    
    /**
     * Creates a new instance of CicloMB
     */
    public CicloMB() {
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
}
