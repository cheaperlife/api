package app;

import java.text.ParseException;
import java.util.Scanner;

import repository.ClientRepository;

public class Main 
{
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) throws ParseException
	{
    	System.out.println(ClientRepository.getClients());
	}
}