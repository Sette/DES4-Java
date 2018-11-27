/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mb;

import bean.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author razer
 */
@Named(value = "alunosMB")
@RequestScoped
public class AlunosMB {
    private List<Aluno> alunos;
    @PostConstruct
    public void init() {
        alunos = new ArrayList<>();
        Aluno a = new Aluno();
        a.setNome("João");
        alunos.add(a);
        a = new Aluno();
        a.setNome("Maria");
        alunos.add(a);
        a = new Aluno();
        a.setNome("José");
        alunos.add(a);
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
