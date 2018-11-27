/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.rnp.mb;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class CalculadoraMB {
    private Double a;
    private Double b;
    private Double resultados;

    public String adicao(){
        resultados=a+b;
        return "resultado";
    }
    
    public String multiplicacao(){
        resultados=a*b;
        return "resultado";
    }
    
    public String divisao(){
        resultados=a/b;
        return "resultado";
    }
    
    public String subtracao(){
        resultados=a-b;
        return "resultado";
    }
    
    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public List<Double> getResultados() {
        return resultados;
    }

    public void setResultados(List<Double> resultados) {
        this.resultados = resultados;
    }
    
    
    
    
}
