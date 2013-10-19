package service;

import java.text.ParseException;
import repository.ClientRepository;

public class Test {
	public String requestClients(String clients) throws ParseException 
    {
    	return ClientRepository.getClients();
    }
}