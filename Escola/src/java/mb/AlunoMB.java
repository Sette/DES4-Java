
package mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import beans.AlunoImpl;
@Named
@RequestScoped
public class AlunoMB {
    private AlunoImpl aluno;

    public AlunoImpl getAluno() {
        return aluno;
    }

    public void setAluno(AlunoImpl aluno) {
        this.aluno = aluno;
    }
    
    
}
