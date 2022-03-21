import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) throws IOException {
				ArrayList<Controle> contas = new ArrayList<Controle>();
			
				Scanner entrada = new Scanner(System.in);
				
				String agencia;
				String conta;
				String telefone;
				String nome;
				String email; 
				double saldo;
				boolean rodando = true;
				while (rodando) {
					System.out.println("\n============== MENU ==============");
					System.out.println("1 - Cadastrar Clientes");
					System.out.println("2 - Listar Clientes");
					System.out.println("3 - Gravar em arquivo texto");
					System.out.println("4 - Consultar arquivo texto");
					System.out.println("5 - Sair");
					System.out.println("==================================");
					System.out.println("Escolha a op��o desejada : ");
					String opcao = entrada.nextLine();
					
//					if (opcao == 5) {
//						System.out.println("Saindo do Sistema!!");
//					} else {
						switch (opcao) {
						case "1": {
							System.out.println("Digite sua ag�ncia: ");
							agencia = entrada.nextLine();
							System.out.println("Digite sua conta: ");
							conta = entrada.nextLine();
							System.out.println("Digite seu nome: ");
							nome = entrada.nextLine();
							System.out.println("Digite seu email: ");
							email = entrada.nextLine();
							System.out.println("Digite seu tefelone: ");
							telefone = entrada.nextLine();
							System.out.println("Digite o saldo da conta: ");
							saldo = entrada.nextDouble();
							Controle c = new Controle();
							c.setAgencia(agencia);
							c.setConta(conta);
							c.setNome(nome);
							c.setEmail(email);
							c.setTelefone(telefone);
							c.setSaldo(saldo);
							System.out.println("Contas cadastradas com sucesso!");
						}
							break;
						case "2":{
							if (contas.isEmpty()) {
								System.out.println("Nenhum cliente cadastrado!");
							} else {
								for (Controle registros:contas) {
									System.out.println(registros);
								}
							} 
							break;
						}
						case "3":{
							// abre um espa�o na mem�ria
							FileWriter arquivo = new FileWriter("C:\\arquivo.txt");
							
							// guarda o conte�do no espa�o alocado
							PrintWriter gravarArquivo = new PrintWriter(arquivo);
							
							gravarArquivo.println("Registro de Contas :");
							for (Controle registros:contas) {
								gravarArquivo.println(registros); 
							}
							
							arquivo.close();	
							System.out.println("Gravado na mem�ria.");
							System.out.println("Local salvo: C:\\arquivo.txt");
							System.out.println("Nome do arquivo: Registro_de_cadastros");
							break;
						}
						case "4":{
							String nomeArquivo="C:\\arquivo.txt"; 
							String linha = "";
							File arq = new File(nomeArquivo);
							
							// analisa para verificar se o arquivo existe
							if(arq.exists()) {					
								// processo de tentativa da leitura das informac�es contidas no arquivo
								try {
									FileReader reader = new FileReader(nomeArquivo);
									
									// l� todo o arquivo e armazena no Buffer da mem�ria
									BufferedReader leitor = new BufferedReader(reader);
									while(true) {
										linha = leitor.readLine();
										System.out.println(linha);
										if(linha == null)
											break;
									}
								}
								catch(Exception erro) {}
							} else {
								System.out.println("Arquivo Nao Existe!");
							} 
							break;
						}
						case "5": {
							System.out.println("Saindo...");
							System.out.println("Obrigado, volte sempre!");
							rodando = false;
							break;
						}
						default:
							System.out.println("Op��o inv�lida. Tente novamente!");
						}
					}
						entrada.close();
				}

			}
