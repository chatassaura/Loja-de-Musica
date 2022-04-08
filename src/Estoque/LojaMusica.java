package Estoque;

import java.util.Scanner;

public class LojaMusica {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Adm[] adms = new Adm[3];
		adms[0] = new Adm("Anderson");
		adms[1] = new Adm("Fernanda");
		adms[2] = new Adm("ADM");		
		
		System.out.println("Insira o nome do Adm");
		String restricao = leitor.next();		
		
		for(int j=0; j<adms.length; j++) {
			if(adms[j] != null && restricao.equals(adms[j].getNome())) {		
			
			// Padrão
			Estoque[] instrumentos = new Estoque[2];
			instrumentos[0] = new Estoque("Violão",5,1.500); 
			instrumentos[1] = new Estoque("Cavaquinho",5,1.500); 
			
			//Novos
			Estoque[] instrumentos2 = new Estoque[1];		
	
				do {
					System.out.println();
					System.out.println("***** Estoque Musical *****");
					System.out.println();
					System.out.println("1- Analisar Estoque");
					System.out.println("2- Cadastrar um Instrumento");
					System.out.println("3- Analisar um Instrumento");
					System.out.println("4- Editar um Cadastro");
					System.out.println("5- Fechar Estoque");
					System.out.println();
					System.out.println("***************************");
					System.out.println();
					System.out.println("Escolha a opção desejada: ");
					int opcao = leitor.nextInt();		
					int dados = instrumentos2.length;
					switch(opcao) {
					
						case 1:					
							System.out.println(" ***** Análise do Estoque *****");
							
							for(int i=0; i<instrumentos.length; i++) {
								System.out.println();
								System.out.println("- Quantidade em Estoque: " + instrumentos[i].getQuantidade());
								System.out.println("- Nome do Instrumento: " + instrumentos[i].getNome());	
								System.out.println("- Preço do Instrumento: " + instrumentos[i].getPreco());
								System.out.println("----------------------------");
								
							}		
							
							for(int i=0; i<dados; i++) {
										
									 if ( i == 0 && instrumentos2[i] != null) {
										
										System.out.println("- Quantidade em Estoque: " + instrumentos2[i].getQuantidade());
										System.out.println("- Nome do Instrumento: " + instrumentos2[i].getNome());	
										System.out.println("- Preço do Instrumento: " + instrumentos2[i].getPreco());
										System.out.println("---------------------------- /n");
										System.out.println("***** Fim da Lista 2 *****");
									}else {
										System.out.println("***** Fim da Lista *****");;
										break;
									}
									System.out.println("valor i: " + i);
								}
							break;
							
						case 2:
							System.out.println(" ***** Cadastro em Estoque *****");
							System.out.println();					
							
							for(int i=0; i<instrumentos2.length; i++) {
									
								if(i == 0 && instrumentos2[i] == null) {
									System.out.println("Digite a quantidade do Novo Instrumento: ");
									int quantidade = leitor.nextInt();
									
									System.out.println("Digite o Nome do Novo Instrumento: ");		
									String nome = leitor.next();
									
									System.out.println("Digite o Preço do Novo Instrumento: ");
									double preco = leitor.nextDouble();
									
									instrumentos2[i] = new Estoque(nome, quantidade, preco);	
									System.out.println("Cadastro Concluído!!");
									
									System.out.println("- Quantidade em Estoque: " + instrumentos2[i].getQuantidade());
									System.out.println("- Nome do Instrumento: " + instrumentos2[i].getNome());	
									System.out.println("- Preço do Instrumento: " + instrumentos2[i].getPreco());
								}else {		
									System.out.println("Estoque Cheio!");
								}
							}
		
							
						break;
						
						case 3:
							System.out.println("Digite o Instrumento que deseja Consultar: ");
							String consulta = leitor.next();
							
						
							for(int i=0; i<instrumentos2.length; i++) {	
								if( instrumentos2[i] != null && consulta.equals(instrumentos2[i].getNome())) {	
										System.out.println("- Quantidade em Estoque: " + instrumentos2[i].getQuantidade());
										System.out.println("- Nome do Instrumento: " + instrumentos2[i].getNome());	
										System.out.println("- Preço do Instrumento: " + instrumentos2[i].getPreco());
										System.out.println("- Preço Total em Estoque: " + instrumentos2[i].calcularValorTotal());
								}
							}
							
							for(int i=0; i<instrumentos.length; i++) {
								if(consulta.equals(instrumentos[i].getNome())) {
									System.out.println("- Quantidade em Estoque: " + instrumentos[i].getQuantidade());
									System.out.println("- Nome do Instrumento: " + instrumentos[i].getNome());	
									System.out.println("- Preço do Instrumento: " + instrumentos[i].getPreco());
									System.out.println("- Preço Total em Estoque: " + instrumentos[i].calcularValorTotal());
								}
							}		
						break;
						
						case 4:
							System.out.println("Digite o Instrumento que deseja Editar: ");
							String edicao = leitor.next();
							boolean verificacao = false;
						
							for(int i=0; i<instrumentos2.length; i++) {	
								if(instrumentos2[i] != null && edicao.equals(instrumentos2[i].getNome())  ) {	
										System.out.println("- Quantidade em Estoque: " + instrumentos2[i].getQuantidade());
										System.out.println("- Nome do Instrumento: " + instrumentos2[i].getNome());	
										System.out.println("- Preço do Instrumento: " + instrumentos2[i].getPreco());
										
										System.out.println();
										System.out.println("Editando Instrumento: " + edicao);
										
										System.out.println("Nova Quantidade: ");
										instrumentos2[i].setQuantidade(leitor.nextInt());
										
										System.out.println("Novo Preço: ");
										instrumentos2[i].setPreco(leitor.nextDouble());
										
										verificacao = true;
								}
							}
							
							for(int i=0; i<instrumentos.length; i++) {
								if(edicao.equals(instrumentos[i].getNome())) {
									System.out.println("- Quantidade em Estoque: " + instrumentos[i].getQuantidade());
									System.out.println("- Nome do Instrumento: " + instrumentos[i].getNome());	
									System.out.println("- Preço do Instrumento: " + instrumentos[i].getPreco());
									System.out.println();
									System.out.println("Editando Instrumento: " + edicao);
									
									System.out.println("Nova Quantidade: ");
									instrumentos[i].setQuantidade(leitor.nextInt());
									
									System.out.println("Novo Preço: ");
									instrumentos[i].setPreco(leitor.nextDouble());
									
									verificacao = true;
								}
							}	
							if(verificacao == false) {
								System.out.println("Nenhum dado Encontrado!");						
							}
							
						break;
						
						case 5:
							System.out.println();
							System.out.println("***** Fechando Estoque *****");
							leitor.close();
							System.exit(0);
						
						default:
							System.out.println("***** OPÇÃO INVÁLIDA!!! *****");
							break;
					}	
				}while(true);
			}
		}	
		System.out.println("ACESSO NEGADO;");
		leitor.close();
	}
}
