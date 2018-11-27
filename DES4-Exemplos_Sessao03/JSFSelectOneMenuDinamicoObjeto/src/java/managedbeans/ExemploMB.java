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
    private Estado selecionado;
    private List<Estado> listaEstados;

    /**
     * Creates a new instance of ExemploMB
     */
    public ExemploMB() {
        listaEstados = Estado.buscarTodos();
    }

    public List<Estado> getListaEstados() {
        return listaEstados;
    }

    public void setListaEstados(List<Estado> listaEstados) {
        this.listaEstados = listaEstados;
    }

    public Estado getSelecionado() {
        return selecionado;
    }

    public void setSelecionado(Estado selecionado) {
        this.selecionado = selecionado;
    }
    
    
}
