package locadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Locadora {

	Scanner sc = new Scanner(System.in);
	List<Cliente> listaCliente = new ArrayList<Cliente>();
	List<Veiculo> listaVeiculo = new ArrayList<Veiculo>();

	public void cadastrarVeiculo() {
		Veiculo veiculo = new Veiculo();
		System.out.println("    CADASTRAR VE�CULO  ");

		System.out.println("TIPO: ");
		veiculo.setTipo(sc.next());

		System.out.println("N�MERO DE IDENTIFICA��O: ");
		veiculo.setNumero(sc.nextInt());

		System.out.println("MARCA: ");
		veiculo.setMarca(sc.next());

		System.out.println("MODELO: ");
		veiculo.setModelo(sc.next());

		System.out.println("COR: ");
		veiculo.setCor(sc.next());

		System.out.println("ANO: ");
		veiculo.setAno(sc.nextInt());

		System.out.println("FABRICANTE: ");
		veiculo.setFabricante(sc.next());

		System.out.println("PLACA: ");
		veiculo.setPlaca(sc.next());

		System.out.println("KM RODADOS: ");
		veiculo.setKm(sc.nextDouble());

		listaVeiculo.add(veiculo);
	}

	public void cadastrarCliente() {

		Endereco endereco = new Endereco();
		Cliente cliente = new Cliente();

		System.out.println("    CADASTRAR CLIENTE:   ");

		System.out.println("NOME:");
		cliente.setNome(sc.next());

		System.out.println("IDADE:");
		cliente.setIdade(sc.nextInt());
		
		System.out.println("CPF:");
		cliente.setCpf(sc.nextLong());
	
		System.out.println("CONTATO:");
		cliente.setContato(sc.nextLong());

		System.out.println("     ENDERE�O:    ");
		endereco.cadastroEnde();
		cliente.setEndereco(endereco);

		if (cliente.getIdade() < 18) {
			System.out.println("N�o foi poss�vel realizar cadastro\n(cliente n�o � maior de idade)");
		} else {
			listaCliente.add(cliente);
			System.out.println("Cliente adicionado com sucesso!");
		}
	}

	public void alugaCarro() {
		System.out.println("Digite o n�mero de identifica��o do veiculo desejado: ");
		int numero = sc.nextInt();
		for (Veiculo veiculo : listaVeiculo) {
			if (veiculo.getNumero() == numero) {
				System.out.println("Veiculo encontrado" + "\nTipo: " +veiculo.getTipo()+"\nPlaca: "
						+ veiculo.getPlaca()+"\nMarca: " + veiculo.getMarca());
				if (veiculo.getAlugado() == true) {
					System.out.println("Ve�culo j� alugado");
				} else {
					System.out.println("Deseja realmente alugar este veiculo? ");
					System.out.println("Digite 1 para sim e 2 para n�o:");
					int op = sc.nextInt();
					if (op == 1) {
						System.out.println("Digite CPF do cliente:");
						int cpf = sc.nextInt();
						for (Cliente cliente : listaCliente) {
							if (cliente.getCpf() == cpf) {
								System.out.println("Pesquisa encontrou:" + cliente.getCpf());
								System.out.println("Digite por quantos dias deseja alugar este ve�culo: ");
								int dia = sc.nextInt();
								double preco = dia * 100;
								Conta conta = new Conta(cliente);
								if (conta.getSaldo() >= preco) {
									System.out.println("Total a pagar: " + preco);
									conta.paga(preco);
									veiculo.setAlugadopor(cliente);
									veiculo.setAlugado(true);
									System.out.println("Carro alugado com sucesso!");
								} else
									System.out.println(
											"O cliente n�o possui saldo o suficiente para realizar transfer�ncia");
							} else
								System.out.println("Cliente n�o cadastrado!");
						}
					} else {
						System.out.println("Opera��o finalizada!");
					}
				}
			} else
				System.out.println("Ve�culo n�o encontrado!");
		}
	}

	public void alugaMoto() {
		System.out.println("Digite o n�mero de identifica��o do veiculo desejado: ");
		int numero = sc.nextInt();
		for (Veiculo veiculo : listaVeiculo) {
			if (veiculo.getNumero() == numero) {
				System.out.println("Veiculo encontrado" + "\nTipo: " + veiculo.getTipo() + "Placa: "
						+ veiculo.getPlaca() + "\n" + "Marca: " + veiculo.getMarca());
				if (veiculo.getAlugado() == true) {
					System.out.println("Ve�culo j� alugado");
				} else {
					System.out.println("Deseja realmente alugar este veiculo? ");
					System.out.println("Digite 1 para sim e 2 para n�o:");
					int op = sc.nextInt();
					if (op == 1) {
						System.out.println("Digite CPF do cliente:");
						int cpf = sc.nextInt();
						for (Cliente cliente : listaCliente) {
							if (cliente.getCpf() == cpf) {
								System.out.println("Pesquisa encontrou:" + cliente.getCpf());
								System.out.println("Digite por quantos dias deseja alugar este ve�culo: ");
								int dia = sc.nextInt();
								double preco = dia * 85;
								Conta conta = new Conta(cliente);
								if (conta.getSaldo() >= preco) {
									System.out.println("Total a pagar: " + preco + "$");
									conta.paga(preco);
									veiculo.setAlugadopor(cliente);
									veiculo.setAlugado(true);
									System.out.println("Moto alugada com sucesso!");
								} else
									System.out.println(
											"O cliente n�o possui saldo o suficiente para realizar transfer�ncia");
							} else
								System.out.println("Cliente n�o cadastrado!");
						}
					} else {
						System.out.println("Opera��o finalizada!");
					}
				}
			} else
				System.out.println("Ve�culo n�o encontrado!");
		}
	}

	public void buscaVeiculo() {
		System.out.println("Digite o n�mero de identifi��o do ve�culo: ");
		int numero = sc.nextInt();

		for (Veiculo veiculo : listaVeiculo) {
			if (veiculo.getNumero() == numero) {
				System.out.println("Tipo: " + veiculo.getTipo() + "\nPlaca: " + veiculo.getPlaca());
			} else {
				System.out.println("Ve�culo n�o encontrado! Tente novamente!");
			}
			if (veiculo.getAlugado() == true) {
				System.out.println("Ve�culo alugado");
			} else
				System.out.println("Ve�culo dispon�vel!");
		}
	}

	public void buscaCliente() {
		System.out.println("Digite o cpf: ");
		int cpf = sc.nextInt();

		for (Cliente cliente : listaCliente) {
			if (cliente.getCpf() == (cpf)) {
				System.out.println("Cliente: " + cliente.getNome() + "," + "cpf: " + cliente.getCpf());
			} else
				System.out.println("Cliente n�o encontrado! Tente novamente!");
		}
	}

	public void editarCliente() {
		System.out.println("Digite o cpf: ");
		int cpf = sc.nextInt();

		for (Cliente cliente : listaCliente) {
			if (cliente.getCpf() == (cpf)) {
				System.out.println("Cliente: " + cliente.getNome() + "," + "cpf: " + cliente.getCpf());

				do {
					System.out.println(
							"1- Nome\n2- Idade\n3- CPF\n4- Contato\n5- Estado\n6- Cidade\n7- Bairro\n8- Logradouro\n9- N�mero da casa");
					System.out.println("Digite a op��o que deseja alterar: ");
					int op = sc.nextInt();

					switch (op) {
					case 1:
						System.out.println("Digite o novo nome do cliente: ");
						cliente.setNome(sc.next());
						break;
					case 2:
						System.out.println("Digite a nova idade do cliente: ");
						cliente.setIdade(sc.nextInt());
						break;
					case 3:
						System.out.println("Digite o novo CPF do cliente: ");
						cliente.setCpf(sc.nextInt());
						break;
					case 4:
						System.out.println("Digite o novo contato do cliente: ");
						cliente.setContato(sc.nextInt());
						break;
					case 5:
						System.out.println("Digite o novo estado do Cliente: ");
						cliente.getEndereco().setEstado(sc.next());
						break;
					case 6:
						System.out.println("Digite a nova cidade: ");
						cliente.getEndereco().setCidade(sc.nextLine());
						break;
					case 7:
						System.out.println("Digite o novo bairro: ");
						cliente.getEndereco().setBairro(sc.next());
						break;
					case 8:
						System.out.println("Digite o novo logradouro: ");
						cliente.getEndereco().setLogradouro(sc.next());
						break;
					case 9:
						System.out.println("Digite o novo n�mero da casa: ");
						cliente.getEndereco().setNumeroCasa(sc.nextInt());
						break;
					}

				} while (cpf < 0);
			} else
				System.out.println("Cliente n�o encontrado! Tente novamente!");
		}
	}

	public void excluiCliente() {
		int decisao;
		System.out.println("Digite cpf: ");
		int cpf = sc.nextInt();

		for (Cliente cliente : listaCliente) {
			if (cliente.getCpf() == (cpf)) {
				System.out.println("Cliente: " + cliente.getNome() + "\n" + "cpf: " + cliente.getCpf());
			}
			System.out.println("Deseja realmente excluir este cliente?\nDigite 1 para sim ou 2 para n�o: ");
			decisao = sc.nextInt();
			if (decisao == 1) {
				listaCliente.remove(cpf);
				System.out.println("Cliente excluido com sucesso");
			} else
				System.out.println("Opera��o finalizada, o cliente n�o foi excluido.");
		}

	}

	public void encerraAluguel() {
		System.out.println("Digite o n�mero de identifi��o do ve�culo: ");
		int numero = sc.nextInt();
		for (Veiculo veiculo : listaVeiculo) {
			if (veiculo.getNumero() == numero) {
				System.out.println("N�mero de identifica��o do ve�culo: " + veiculo.getNumero() + "," + "Placa: "
						+ veiculo.getPlaca() + veiculo.getAlugadopor().getNome());
				veiculo.setAlugadopor(null);
				veiculo.setAlugado(false);
				System.out.println("ALUGUEL ENCERRADO!");
			} else {
				System.out.println("Veiculo n�o encontrado!");
			}
		}
	}

	public void listarVeiculo() {
		for (Veiculo veiculo : listaVeiculo)
			System.out.println("   VE�CULOS   \n" + veiculo.dados());
	}

	public void listarCliente() {
		for (Cliente cliente : listaCliente)
			System.out.println("   CLIENTES   \n" + cliente.dados());
	}
}
