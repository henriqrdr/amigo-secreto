package Trabalho;
import java.util.Scanner;

public class Pessoa {
	Scanner scan1;
	String nome;
	String codinome;
	String departamento;
	String presente;
	Pessoa amigo;
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
		
	}
	public void cadastrar() {
		this.scan1 = new Scanner(System.in);
		System.out.println("Digite o nome do participante:");
		this.nome = scan1.nextLine();
		System.out.println("Digite o codinome do participante:");
		this.codinome = scan1.nextLine();
		System.out.println("Digite o departamento do participante:");
		this.departamento = scan1.nextLine();
		System.out.println("Digite o ramal do participante:");
		this.ramal = scan1.nextInt();
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", codinome=" + codinome + ", departamento=" + departamento + ", ramal=" + ramal
				+ "]";
	}
	
	

}
