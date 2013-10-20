package cl.api.repository;

import java.util.List;

import javax.persistence.Query;

import cl.api.app.ORM;
import cl.api.entity.Client;

public class ClientRepository {
	public static String getClients(){
		Query q = ORM.em.createQuery(
				"SELECT c " +
				"FROM Client c ");
		
		@SuppressWarnings("unchecked")
		List<Client> list = q.getResultList();
		
		String str = "";
		
		for (int i = 0; i < list.size(); i++) {
			str = str + list.get(i).getLastName() + " ";
		}
		
		return str;
	}
}
