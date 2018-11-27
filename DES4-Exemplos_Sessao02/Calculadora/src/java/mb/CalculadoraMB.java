/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mb;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author razer
 */
@Named(value = "calculadoraMB")
@RequestScoped
public class CalculadoraMB {
    private int valorA;
    private int valorB;
    private int resultado;
    
    /**
     * Creates a new instance of CalculadoraMB
     */
    public CalculadoraMB() {
    }

    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }

    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }
    
    public int getResultado() {
        return this.resultado;
    }
    
    public String somar() {
        this.resultado = valorA + valorB;
        return "resultado";
    }
    public String subtrair() {
        this.resultado = valorA - valorB;
        return "resultado";
    }
    public String multiplicar() {
        this.resultado = valorA * valorB;
        return "resultado";
    }
    public String dividir() {
        this.resultado = valorA + valorB;
        return "resultado";
    }
    
    
}
