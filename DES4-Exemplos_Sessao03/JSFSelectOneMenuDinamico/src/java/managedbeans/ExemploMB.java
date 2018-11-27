/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import beans.Estado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author razer
 */
@ManagedBean
@RequestScoped
public class ExemploMB {
    private String selecionado;
    private List<Estado> listaEstados;

    /**
     * Creates a new instance of ExemploMB
     */
    public ExemploMB() {
        listaEstados = new ArrayList<Estado>();
        Estado e = new Estado();
        
        e.setSigla("PR");
        e.setNome("Paraná");
        listaEstados.add(e);
        
        e = new Estado();
        e.setSigla("SC");
        e.setNome("Santa Catarina");
        listaEstados.add(e);
        
        e = new Estado();
        e.setSigla("RS");
        e.setNome("Rio Grande do Sul");
        listaEstados.add(e);
        
        e = new Estado();
        e.setSigla("MG");
        e.setNome("Minas Gerais");
        listaEstados.add(e);
    }

    public List<Estado> getListaEstados() {
        return listaEstados;
    }

    public void setListaEstados(List<Estado> listaEstados) {
        this.listaEstados = listaEstados;
    }

    public String getSelecionado() {
        return selecionado;
    }

    public void setSelecionado(String selecionado) {
        this.selecionado = selecionado;
    }
    
    
}
