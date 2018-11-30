/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.rnp.des4.mb;

import br.ufmt.rnp.des4.dao.ClienteDAO;
import br.ufmt.rnp.des4.entidades.Cliente;
import br.ufmt.rnp.des4.util.Util;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="clienteMB")
@RequestScoped
public class ClienteMB  {
    @Inject
    private Cliente cliente ;
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private ClienteDAO dao;

    
    
    public String salvar(){
        System.out.println("salvar");
        //Inserção no Banco
        dao.salvar(cliente);
        clientes = dao.consultar();
        cliente = null;
        
        Util.addMensagem("Salvo com sucesso");
        return "index";
    }
    
    public void excluir(int id){
        
        for (int i = 0; i < clientes.size(); i++) {
            Cliente c = clientes.get(i);
            if(c.getId() == id){
                clientes.remove(i);
                FacesMessage msg = new FacesMessage("Removido","Cliente removido com sucesso!");
                msg.setSeverity(FacesMessage.SEVERITY_INFO);
                FacesContext.getCurrentInstance().addMessage(null, msg);
                break;
            }
        }
        
    }
    
    public String editar(int id){
        cliente = dao.getByid(id);
        return "cliente";
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public ClienteDAO getDao() {
        return dao;
    }

    public void setDao(ClienteDAO dao) {
        this.dao = dao;
    }
    
}
