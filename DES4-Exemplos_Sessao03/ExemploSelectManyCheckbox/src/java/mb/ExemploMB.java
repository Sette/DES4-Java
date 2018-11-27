/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mb;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import java.util.*;
import javax.annotation.PostConstruct;

@Named(value = "exemploMB")
@RequestScoped
public class ExemploMB {
    private List<String> escolhidos = new ArrayList<>();
    
    public ExemploMB() {
    }
    @PostConstruct
    public void init() {
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
