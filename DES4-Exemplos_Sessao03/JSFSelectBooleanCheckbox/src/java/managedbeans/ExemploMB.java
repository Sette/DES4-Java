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
   private boolean fumante;
   private boolean cardiaco;

    public boolean isFumante() {
        return fumante;
    }

    public void setFumante(boolean fumante) {
        this.fumante = fumante;
    }

    public boolean isCardiaco() {
        return cardiaco;
    }

    public void setCardiaco(boolean cardiaco) {
        this.cardiaco = cardiaco;
    }
   
}
