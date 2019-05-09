package Trabalho;
import java.util.Scanner;
public class Mensagem {
	Scanner scan1;
	Pessoa remetente;
	Pessoa destinatario;
	public String texto;
	
	public Mensagem() {
		this.remetente = null;
		this.destinatario = null;
		texto = "";
		
	}
	public void novaMensagem(Pessoa destinatario,Pessoa remetente) {
		this.scan1 = new Scanner(System.in);
		this.destinatario = destinatario;
		this.remetente = remetente;
		System.out.println("Digite sua mensagem");
		this.texto= scan1.nextLine();
	}
	@Override
	public String toString() {
		return "Mensagem [remetente=" + remetente + ", destinatario=" + destinatario + ", texto=" + texto + "]";
	}
	

}
