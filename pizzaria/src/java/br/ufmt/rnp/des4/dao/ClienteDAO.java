
package br.ufmt.rnp.des4.dao;

import br.ufmt.rnp.des4.entidades.Cliente;
import br.ufmt.rnp.des4.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class ClienteDAO {
    public void salvar(Cliente cliente){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(cliente);
        session.getTransaction().commit();
        session.close();
    }
    
    public Cliente getByid(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (Cliente) session.get(Cliente.class,id);
    }
    
    
    public void editar(Cliente cliente){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(cliente);
        session.getTransaction().commit();
        session.close();
    }
    
    public void excluir(Cliente cliente){
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(cliente);
        session.getTransaction().commit();
        session.close();
    }
    
    public List<Cliente> consultar(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Cliente");
        return query.list();
    }
    
}
