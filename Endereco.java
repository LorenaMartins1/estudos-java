package locadora;

import java.util.Scanner;

public class Endereco extends Cliente {
	private String estado;
	private String cidade;
	private String bairro; 
	private String logradouro;
	private int numeroCasa;
	
 	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public void cadastroEnde() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ESTADO:");
		setEstado(sc.nextLine());
		System.out.println("CIDADE:");
		setCidade(sc.nextLine());
		System.out.println("BAIRRO:");
		setBairro(sc.nextLine());
		System.out.println("LOGRADOURO:");
		setLogradouro(sc.nextLine());
		System.out.println("NUMERO DA CASA:");
		setNumeroCasa(sc.nextInt());
	}
	
	
	

}
