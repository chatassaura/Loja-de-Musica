package Estoque;

public class Estoque {		
	
	//Atributos 
	private String nome;
	private int quantidade;
	private double preco;
	//private int totalInstrumento;
	
	
	//Construtor Estoque
	public Estoque(String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		//this.totalInstrumento = totalInstrumento;
	} 
	
	//Método
	//Calcular valor total em estoque de um determinado instrumento
	double calcularValorTotal(){
		return quantidade * preco;
	}
	
	//Get e Set 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	/*public int getTotalInstrumento() {
		return totalInstrumento;
	}

	public void setTotalInstrumento(int totalInstrumento) {
		this.totalInstrumento = totalInstrumento;
	}*/	
}

