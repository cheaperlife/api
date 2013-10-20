package cl.api.app;

import java.text.ParseException;
import java.util.Scanner;

import cl.api.repository.ClientRepository;

public class Main 
{
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) throws ParseException
	{
    	System.out.println(ClientRepository.getClients());
	}
}