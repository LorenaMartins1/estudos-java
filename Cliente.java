package locadora;

public class Cliente {
	private String nome;
	private long cpf;
	private Endereco endereco;
	private int idade;
	private long contato;
	private Conta conta;

	public Cliente(String nome, long cpf, Endereco endereco, int idade, long contato, Conta conta) {
 		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.idade = idade;
		this.contato = contato;
		this.conta = conta;
	}

	public Cliente() {
 	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Cliente endereco) {
		this.endereco = (Endereco) endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public long getContato() {
		return contato;
	}

	public void setContato(long contato) {
		this.contato = contato;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public String dados(){
		return "Nome: "+getNome()+"\nCPF: "+getCpf()+"\nIdade: "+getIdade()+
				"\nContato: "+getContato();
	}
}