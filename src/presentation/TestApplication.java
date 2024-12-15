package presentation;

import entities.Client;
import services.ClientService;

public class TestApplication {

	public static void main(String[] args) {
		Client c1=new Client("ALaoui","ALi","06666666","@");
		ClientService cs=new ClientService();
		cs.create(c1);

	}

}
