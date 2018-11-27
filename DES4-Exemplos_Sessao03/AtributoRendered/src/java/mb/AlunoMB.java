/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mb;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author razer
 */
@Named(value = "alunoMB")
@RequestScoped
public class AlunoMB {
    private boolean mostrarAluno = false;
    private double media = 0.0;

    /**
     * Creates a new instance of AlunoMB
     */
    public AlunoMB() {
    }

    public boolean isMostrarAluno() {
        return mostrarAluno;
    }

    public void setMostrarAluno(boolean mostrarAluno) {
        this.mostrarAluno = mostrarAluno;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    
}
