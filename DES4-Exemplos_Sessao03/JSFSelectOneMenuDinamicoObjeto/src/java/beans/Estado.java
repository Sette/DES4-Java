/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author razer
 */
public class Estado {
    private String sigla;
    private String nome;

    public Estado() {
    }
    public Estado(String s, String n) {
        this.sigla = s;
        this.nome = n;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    public boolean equals(Object e) {
        return (this.sigla.equalsIgnoreCase(((Estado)e).getSigla()));
    }
    public int hashCode() {
        return this.sigla.hashCode();
    }
    public static Estado buscar(String sigla) {
        if (sigla.equals("PR"))
            return new Estado("PR", "Paraná");
        if (sigla.equals("SC"))
            return new Estado("SC", "Santa Catarina");
        if (sigla.equals("RS"))
            return new Estado("RS", "Rio Grande do Sul");
        if (sigla.equals("MG"))
            return new Estado("MG", "Minas Gerais");
        return null;
    }
    public static List<Estado> buscarTodos() {
        List<Estado> listaEstados = new ArrayList<Estado>();
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
        
        return listaEstados;        
    }
    
    
}
