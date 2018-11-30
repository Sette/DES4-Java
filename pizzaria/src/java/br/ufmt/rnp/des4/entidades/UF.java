/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.rnp.des4.entidades;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author aluno
 */
@Entity
@Table(name="tb_uf")
@SequenceGenerator(name = "uf_seq", allocationSize = 1, 
        sequenceName = "seq_tb_uf_id")
public class UF {
    @Id
    @GeneratedValue(generator = "uf_seq",strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private String sigla;
    @OneToMany(mappedBy = "uf", cascade = CascadeType.ALL)
    private List<Cliente> clientes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
    
}
