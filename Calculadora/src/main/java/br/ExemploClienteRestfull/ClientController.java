package br.ExemploClienteRestfull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

/*	AVISO: 
	Para esse controlador e as rotas funcionarem, é preciso colocar os 
	arquivos .java do pacote br.ExemploClienteRestfull dentro do pacote 
	br.CalculadoraCientificaRestfull
*/

@RestController
public class ClientController {

	private List<Client> clients;
	
	public ClientController() {
		this.clients = new ArrayList<Client>();
		
		Client cliente1 = new Client();
		cliente1.setId(1);
		cliente1.setName("cliente1");
		Address addr1 = new Address();
		addr1.setLogradouro("rua 1");
		addr1.setNumber(111);
		cliente1.setAddress(addr1);
		
		Client cliente2 = new Client();
		cliente2.setId(2);
		cliente2.setName("cliente2");
		Address addr2 = new Address();
		addr2.setLogradouro("rua 2");
		addr2.setNumber(222);
		cliente2.setAddress(addr2);
		
		clients.add(cliente1);
		clients.add(cliente2);
	}
	
	// Routes:
	// [1] GET    /clients
	// [2] GET    /clients/{id}
	// [3] POST   /client
	// [4] DELETE /client/{id}
	// [5] PUT    /client/{id}
	
	// [1]
	@GetMapping("/clients")
	public List<Client> getClients() {
		return clients;
	}
	
	// [2]
	@GetMapping("/clients/{id}")
	public Client getClientById(@PathVariable int id) {
		
		for (Iterator<Client> i = clients.iterator(); i.hasNext();) {
			
			Client client = i.next();
			if (client.getId() == id) return client;
		}
		return null;
	}
	
	// [3]
	@PostMapping("/client")
	@ResponseStatus(HttpStatus.CREATED)
	public int createClient(@RequestBody Client newClient) {
		
		int id = this.clients.size() +1;
		newClient.setId(id);
		clients.add(newClient);
		return id;
	}
	
	// [4]
	@DeleteMapping("/client/{id}")
	public Client deleteClientById(@PathVariable int id) {
		
		for (Iterator<Client> i = clients.iterator(); i.hasNext();) {
			
			Client client = i.next();
			if (client.getId() == id) {
				i.remove();
				return client;
			}
		}
		
		return null;
	}
	
	// [5]
	@PutMapping("/client/{id}")
	public Client updateClientById(@PathVariable int id, @RequestBody Client newClientInfo) {
		
		String newName = newClientInfo.getName();
		Address newAddr = newClientInfo.getAddress();
		int newId = newClientInfo.getId();
		
		for (Iterator<Client> i = clients.iterator(); i.hasNext();) {
			
			Client client = i.next();
			if (client.getId() == id) { // Busca o cliente com id especificado
				
				if (newId == 0) { 
					// Mantem id caso o novo id for igual a 0
					client.setName(newName);
					client.setAddress(newAddr);
				} else if (newId > 0) {
					// Atualiza id caso o novo id for maior que 0 (Aviso: não colocar 2 id iguais)
					client.setName(newName);
					client.setAddress(newAddr);
					client.setId(newId);
				}
				return client;
			}
		}
		return null;
	}
}
