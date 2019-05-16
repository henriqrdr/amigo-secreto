package Trabalho;
import java.util.Scanner;

public class Pessoa {
	Scanner scan1;
	String nome;
	String codinome;
	String departamento;
	String presente;
	String senha;
	Pessoa amigo;
	int tipo;
	int ramal;
	int sendcont;
	int inboxcont;

	public Pessoa() {
		nome = "";
		codinome = "";
		departamento = "";
		this.amigo = null;
		ramal = 0;
		sendcont = 0;
		inboxcont = 0;
		senha = "";
		tipo = 0;
		
	}
	public void cadastrarUser() {
		this.scan1 = new Scanner(System.in);
		/*System.out.println("Digite o tipo do usuário:");
		System.out.println("1 para admin 2 para user");
		this.tipo = scan1.nextInt();
		scan1.nextLine();*/
		System.out.println("Digite o nome do participante:");
		this.nome = scan1.nextLine();
		System.out.println("Digite o codinome do participante:");
		this.codinome = scan1.nextLine();
		System.out.println("Digite o departamento do participante:");
		this.departamento = scan1.nextLine();
		System.out.println("Digite o ramal do participante:");
		this.ramal = scan1.nextInt();
		scan1.nextLine();
		System.out.println("Digite uma senha:");
		this.senha = scan1.nextLine();
		String senha2 = "";
		do {
			System.out.println("Confirme sua senha:");
			senha2 = scan1.nextLine();
			if(! senha2.equals(this.senha))
				System.out.println("Senhas nao conferem");
		}	while (! senha2.equals(this.senha));
		this.tipo=2;
		
	}
	public void cadastrarAdmin() {
		this.scan1 = new Scanner(System.in);
		System.out.println("Digite o nome do administrador:");
		this.nome = scan1.nextLine();
		System.out.println("Digite o codinome do administrador:");
		this.codinome = scan1.nextLine();
		System.out.println("Digite uma senha:");
		this.senha = scan1.nextLine();
		String senha2 = "";
		do {
			System.out.println("Confirme sua senha:");
			senha2 = scan1.nextLine();
			if(! senha2.equals(this.senha))
				System.out.println("Senhas nao conferem");
		}	while (! senha2.equals(this.senha));
		this.tipo = 1;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", codinome=" + codinome + ", departamento=" + departamento + ", ramal=" + ramal
				+ "]";
	}
	
	

}
