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
    private String estado;
    
    /**
     * Creates a new instance of ExemploMB
     */
    public ExemploMB() {
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}