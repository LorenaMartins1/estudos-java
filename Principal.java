package locadora;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		int op;
 		int menu = 0;
 		
 		Locadora locadora = new Locadora();
 		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1-Cadastrar veículo\n2-Cadastrar Cliente\n3-Buscar Cliente\n4-Buscar Veículo\n5-Alugar veículo"
					+ "\n6-Lista de veículos\n7-Lista de clientes\n8-Encerrar Aluguel\n9-Excluir cliente\n10-Editar dados do Cliente"));
			switch (op) {
			case 1:
				locadora.cadastrarVeiculo();
				break;
			case 2:
				locadora.cadastrarCliente();
				break;
			case 3:
				locadora.buscaCliente();
				break;
			case 4:
				locadora.buscaVeiculo();
				break;
			case 5:
				Scanner sc = new Scanner(System.in);
				System.out.println("   ALUGAR VEÍCULO:  ");
				System.out.println("Digite 1 para carro e 2 para moto: ");
				int a = sc.nextInt();
				if(a == 1) {
					locadora.alugaCarro();
				}
				if(a == 2) {
					locadora.alugaMoto();
				}
				break;
			case 6:
				locadora.listarVeiculo();
				break;
			case 7:
				locadora.listarCliente();
				break;
			case 8:
				locadora.encerraAluguel();
				break;
			case 9:
				locadora.excluiCliente();
				break;
			case 10:
				locadora.editarCliente();
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}

		} while (menu == 0);

	}

}
 