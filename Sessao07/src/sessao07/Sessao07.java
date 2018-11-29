
package sessao07;


import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class Sessao07 {

    
    public static void main(String[] args) {
        
        Session s = HibernateUtil.getSessionFactory().openSession();
        
        Query consulta = s.createQuery("select p from Pessoa p");
        List<Pessoa> pessoas = consulta.list();
        
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getId() + " " + pessoa.getNome());
        }
       
        s.close();
        
  
    }
    
}
