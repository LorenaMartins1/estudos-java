package locadora;

public class Conta extends Cliente {
	private Cliente titular;
	private double saldo = 1000;
	private int numero;
	
	public Conta(Cliente titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public void paga(double preco) {
		this.saldo = saldo - preco;
	}	
}
