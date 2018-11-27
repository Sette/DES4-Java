/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.rnp;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class IdadeBean {
    private int idade;
    private String nome;
    private String classe;
    
    public String faixaEtaria(){
        if (idade < 0){
            classe = "Idade inválida";
        }else if(idade <= 12){
            classe = "Criança";
        }else if(idade <= 17){
            classe = "Adolescente";
        }else if(idade <= 50){
            classe = "Jovem";
        }else if(idade <= 80){
            classe = "Adulto";
        }else{
            classe = "Idoso";
        }
        
        return "faixaEtaria";
        
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    
}
