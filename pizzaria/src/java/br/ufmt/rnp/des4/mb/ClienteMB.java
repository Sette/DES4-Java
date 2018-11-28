/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.rnp.des4.mb;

import br.ufmt.rnp.des4.entidades.Cliente;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named(value="clienteMB")
@RequestScoped
public class ClienteMB {
    
    
    private Cliente cliente = new Cliente();
    
    public void salvar(){
        System.out.println("salvar");
        //Inserção no Banco
        System.out.println(cliente.getNome());
        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getTelefone());
        System.out.println(cliente.getUf().getSigla());
        cliente = new Cliente();
        FacesMessage msg = new FacesMessage("Cliente salvo com sucesso!");
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
