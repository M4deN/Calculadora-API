package br.ExemploClienteRestfull;

public class Client {
	
	private String name;
	private int id;
	private Address address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String nome) {
		this.name = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address endereco) {
		this.address = endereco;
	}
	
}
