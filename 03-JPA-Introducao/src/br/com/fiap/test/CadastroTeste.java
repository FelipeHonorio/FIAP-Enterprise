package br.com.fiap.test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Massa;
import br.com.fiap.entity.Pastel;

public class CadastroTeste {

	public static void main(String[] args) {
		// Criar um entity manager
		// primeiro, criar a fabrica de entity maager
		EntityManagerFactory factory = // nome que est� no persistence.xml
				Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		//Criar o entity manager utilizando a f�brica
		EntityManager em = factory.createEntityManager();
		
		
		//Instanciar um Pastel
		Pastel pastel = new Pastel("Carne", 3, false, Massa.TRADICIONAL, new GregorianCalendar(19, 1, 17), null);
				
				
		em.persist(pastel);
		
		em.getTransaction().begin();		
		em.getTransaction().commit();
		
		
		em.clear();
		factory.close();
	}

}
