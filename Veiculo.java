package locadora;

public class Veiculo {
	
	private String tipo;
	private String marca;
	private String modelo;
	private String cor;
	private int ano;
	private String fabricante;
	private String placa;
	private int numero;
	private double km;
	private Cliente alugadopor;
	private boolean alugado = false;
 	
	public Veiculo() {
	}
	
	public boolean getAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public Cliente getAlugadopor() {
		return alugadopor;
	}

	public void setAlugadopor(Cliente c) {
		this.alugadopor = c;
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String dados(){
		if(getAlugado() == true){
			return "Tipo: "+getTipo() +"\nNúmero de identificação: "+getNumero()+"\nPlaca: "+getPlaca()+"\nMarca: "+getMarca()+
					"\nCor: "+getCor()+"\nAlugado : "+getAlugado() + " Alugado Por: " + getAlugadopor().getNome();
					}else
						return "Tipo: "+getTipo() +"\nNúmero de identificação: "+getNumero()+"\nPlaca: "+getPlaca()+"\nMarca: "+getMarca()+
					"\nCor: "+getCor()+"\nAlugado : "+getAlugado();  
		}
}
