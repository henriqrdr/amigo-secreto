package Trabalho;
import java.util.Random;
import java.util.Scanner;
public class Main {
	Scanner scan1;
	int conta;
	public Pessoa[]pessoas;
	public Mensagem[]msgs;
	public Main() {
		this.scan1 = new Scanner(System.in);
		this.pessoas = new Pessoa[10];
		this.msgs = new Mensagem[10];
	}
	public void adm() {
		System.out.println("Cadastre um administrador");
		pessoas[conta] = new Pessoa();
		pessoas[conta].cadastrarAdmin();
		conta++;
	}
	public int login() {
		System.out.println("******LOGIN******");
		System.out.println("Digite seu codinome");
		String user = scan1.nextLine();
		Pessoa usuario = new Pessoa();
		usuario = verificaNome(user,conta);
		if(usuario == null) {
			System.out.println("Nome nao encontrado");
			return 0;
		}
		System.out.println("Digite sua senha");
		String senha = scan1.nextLine();
		if(senha.equals(usuario.senha)) {
			System.out.println("Login efetuado com sucesso");
			return usuario.tipo;
		}
		else {
			System.out.println("Senha errada");
			return 0;
		}
	}
	public int menuAdmin(){
		int opcao = 0,contamsg=0;
		this.scan1 = new Scanner(System.in);
		do {
		System.out.println("******MENU ADM******\n");
		System.out.println("Digite uma op��o\n");
		System.out.println("1 Cadastrar um novo usuario");
		System.out.println("2 Cadastrar sugest�o de presente");
		System.out.println("3 Sortear automaticamente");
		System.out.println("4 Cadastrar uma mensagem");
		System.out.println("5 Listar mensagens enviadas");
		System.out.println("6 Exibir sugest�o de presente ");
		System.out.println("7 Cadastrar uma sugest�o");
		System.out.println("8 Listar sugest�es ");
		System.out.println("9 Ranking de mensagens ");
		System.out.println("10 Revelar amigo secreto ");
		System.out.println("11 Cadastrar e exibir aviso geral ");
		System.out.println("12 Listar pessoas");
		System.out.println("0 Para sair ");
		opcao = this.scan1.nextInt();
			if (opcao >12) {
				System.out.println("Op��o inv�lida");
				opcao = 0;
			}
				
		switch (opcao) {
			case 1:
				System.out.println("1 Para cadastrar um novo usuario");
				pessoas[conta] = new Pessoa();
				pessoas[conta].cadastrarUser();
				conta++;
				break;
			case 2:
				System.out.println("2 Cadastrar sugest�o de presente");
				System.out.println("Digite o codinome que deseja cadastrar o presente");
				scan1.nextLine();
				String pesquisapresente = scan1.nextLine();
				Pessoa spresente = new Pessoa();
				spresente = verificaNome(pesquisapresente,conta);
				if(spresente == null) {
					System.out.println("Nome nao encontrado");
					break;
				}
				System.out.println(spresente.toString());
				System.out.println("Qual a sujest�o do presente?");
				spresente.presente = scan1.nextLine();
				
				break;
			case 3:
				System.out.println("3 Sortear automaticamente");
				embaralhavetor(conta);
				break;
			case 4:
				System.out.println("4 Cadastrar uma mensagem");
				System.out.println("Digite o codinome do destinatario");
				scan1.nextLine();
				String destinatario = scan1.nextLine();
				Pessoa destino = new Pessoa();
				destino = verificaNome(destinatario,conta);
				if(destino == null) {
					System.out.println("Nome nao encontrado");
					break;
				}
				System.out.println(destino.toString());
				System.out.println("Digite o codinome do remetente");
				String remetente = scan1.nextLine();
				Pessoa remete = new Pessoa();
				remete = verificaNome(remetente,conta);
				if(remete == null) {
					System.out.println("Nome nao encontrado");
					break;
				}
				System.out.println(remete.toString());
				msgs[contamsg] = new Mensagem();
				msgs[contamsg].novaMensagem(destino,remete);
				contamsg ++;
				remete.sendcont++;
				destino.inboxcont++;
				break;
			case 5:
				System.out.println("5 Listar mensagens enviadas");
				listarMensagens(contamsg);
				break;
			case 6:
				System.out.println("6 Exibir sugest�o de presente ");
				break;
			case 7:
				System.out.println("7 Cadastrar uma sugest�o");
				break;
			case 8:
				System.out.println("8 Listar sugest�es ");
				break;
			case 9:
				System.out.println("9 Ranking de mensagens ");
				break;
			case 10:
				System.out.println("10 Revelar amigo secreto ");
				break;
			case 11:
				System.out.println("11 Cadastrar e exibir aviso geral ");
				break;
			case 12:
				System.out.println("12 Listar pessoas");
				listarpessoas(conta);
				break;
			case 0:
				System.out.println("Saiu !!");
				break;
			}
		
		}while (opcao != 0);
		return 0;
	}
	public int menuUser() {
		int opcao = 0;
		do {
		System.out.println("******MENU USUARIO******\n");
		System.out.println("Digite uma op��o\n");
		System.out.println("1 Mostrar Amigo Secreto");
		System.out.println("2 Enviar uma Mensagem");
		System.out.println("3 Trocar senha");
		System.out.println("4 Cadastrar uma sujestao\n");
		System.out.println("0 Para sair\n");
		opcao = this.scan1.nextInt();
			if (opcao >4) {
				System.out.println("Op��o inv�lida");
				opcao = 0;
			}
		switch (opcao) {
			case 1:
				System.out.println("1 Para cadastrar um novo usuario");
				pessoas[conta] = new Pessoa();
				pessoas[conta].cadastrarUser();
				conta++;
				break;}
		}while (opcao != 0);
		return 0;
	}
	public void listarpessoas(int conta) {
		for (int i = 0; i < conta; i++) {
			System.out.println(pessoas[i].toString());
		}
	}
	public void listarMensagens(int contamsg) {
		for (int i = 0; i < contamsg; i++) {
			System.out.println(msgs[i].toString());
		}
	}
	
	public void embaralhavetor(int conta) {
	        int index;
	        Random gerador = new Random();
	        for (int i= conta ; i>1; i--){
	        	index = gerador.nextInt(conta);
	            Pessoa aux  = new Pessoa();
	            aux = pessoas[i-1];
	            pessoas[i-1] = pessoas[index];
	           pessoas[index] = aux;
	        }
	}
	public Pessoa verificaNome(String nome, int conta) {
		for (int i = 0; i < conta ;i++) {
			if(pessoas[i].codinome.equals(nome)) {
				return pessoas[i];
				}
			else 
				System.out.println("nao encontrado nessa volta");
			}
			return null;
		}
	public static void main(String args[]){
		Main p = new Main();
		int user = 0 ;
		p.adm();
		while(user == 0) {
			user = p.login();
			if(user == 1) {
			user = p.menuAdmin();
			}
			else { if(user == 2) {
				user = p.menuUser();
				}
			
			}
		}
		
	}

}
