package Estoque;

public class Adm {
	
	//Pré Cadastro
		
	//Atributos 
	private String resp;
	
	//Construtor Vendedor 
	public Adm(String resp) {
		this.resp = resp;	
	}
	
	//Get and Set 
	public String getNome() {
		return resp;
	}
	public void setNome(String resp) {
		this.resp = resp;
	}
}
