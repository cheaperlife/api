package cl.api.service;

import java.text.ParseException;

import cl.api.repository.ClientRepository;

public class Test {
	public String requestClients() throws ParseException 
    {
    	return ClientRepository.getClients();
    }
}