/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mb;

import br.ufmt.rnp.des4.entidades.Cliente;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="clienteMB")
@RequestScoped
public class ClienteMB {
    
    @Inject
    private UFMB ufMB;
    
    private Cliente cliente = new Cliente();
    private String sigla;
    
    public void salvar(){
        System.out.println("salvar");
        cliente.setUf(ufMB.find(sigla));
        //Inserção no Banco
        System.out.println(cliente.getNome());
        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getTelefone());
        System.out.println(cliente.getUf().getSigla());
        cliente = new Cliente();
        sigla = null;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public UFMB getUfMB() {
        return ufMB;
    }

    public void setUfMB(UFMB ufMB) {
        this.ufMB = ufMB;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
    
    
    
    
}
