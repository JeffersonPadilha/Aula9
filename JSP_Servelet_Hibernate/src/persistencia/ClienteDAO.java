package persistencia;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entidade.Cliente;

public class ClienteDAO {

	
	Session session;
	Transaction transaction;
	
	public void inserir(Cliente c) throws Exception{
		
		// Abrir uma sessao de acesso ao BD
		session = HibernateUtil.getSessionFactory().openSession();
		
		//Iniciar uma Transa��o
		transaction = session.beginTransaction();
		
		//Executar a��o
		session.save(c);
		
		//Confirmar transa��o
		
		transaction.commit();
		
		//Encerrar sessao
		session.close();
				
	}
	
	public List<Cliente> pesquisar() throws Exception{
		session = HibernateUtil.getSessionFactory().openSession();
		List<Cliente> lista = session.createQuery("FROM Cliente").list();
		session.close();
		return lista;
		
	}

}
