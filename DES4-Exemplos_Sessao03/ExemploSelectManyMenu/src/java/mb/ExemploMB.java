/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mb;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "exemploMB")
@RequestScoped
public class ExemploMB {
    private List<String> estados;

    public List<String> getEstados() {
        return estados;
    }

    public void setEstados(List<String> estados) {
        this.estados = estados;
    }
    
}
