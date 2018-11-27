/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mb;

import beans.Estado;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "exemploMB")
@RequestScoped
public class ExemploMB {
    private String selecionado;
    private List<Estado> listaEstados;
    
    @PostConstruct
    public void init() {
        listaEstados = new ArrayList<Estado>();
        Estado e = new Estado();
        e.setSigla("PR");
        e.setNome("Paraná");
        listaEstados.add(e);
        e = new Estado();
        e.setSigla("SC");
        e.setNome("Santa Catarina");
        listaEstados.add(e);
    }
    // setters/getters

    public String getSelecionado() {
        return selecionado;
    }

    public void setSelecionado(String selecionado) {
        this.selecionado = selecionado;
    }

    public List<Estado> getListaEstados() {
        return listaEstados;
    }

    public void setListaEstados(List<Estado> listaEstados) {
        this.listaEstados = listaEstados;
    }
}
