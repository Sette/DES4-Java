
package br.ufmt.rnp.des4.webpessoa.utils;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

public class Util {
    public static void addMensagem(String mensagem){
        addMensagem(mensagem,FacesMessage.SEVERITY_INFO);
        
    }
    
    public static void addMensagem(String mensagem, Severity severity){
        FacesMessage msg = new FacesMessage(mensagem);
        msg.setSeverity(severity);
        FacesContext.getCurrentInstance().addMessage(null, msg);
        
    }
}
