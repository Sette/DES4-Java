
package mb;

import beans.Aluno;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

@Named
@RequestScoped
public class ExemploMB {
    @Inject
    private Aluno aluno;
    private String texto;
    private List<Aluno> alunos = new ArrayList<Aluno>();
    
    public void salvarAluno(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(aluno);
        session.getTransaction().commit();
        session.close();
    }
    @PostConstruct
    public void init(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("select a from Aluno a ");
        alunos = q.list();
    }
    
    public String pesquisarAluno(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("select a from Aluno a where a.nome like:criterio");
        q.setParameter("criterio","%"+texto+"%");
        alunos = q.list();
        return "list";
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
}
