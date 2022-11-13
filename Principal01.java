package calculadoraTestes;

import javax.swing.JOptionPane;

public class 	Principal01 {
		public static void main(String[] args) {
			
			Calculadora calc = new Calculadora();
			double v1, v2, result;
			int op;
			
			do {
				op = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o que deseja:\n1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n\n0-Encerrar" , "Menu",3));
				switch(op) {
				case 0:
					JOptionPane.showMessageDialog(null, "Programa encerrado com sucesso", "Concluido", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 1:
					v1 =  Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 1� valor", "Soma", 3));
					v2 =  Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 2� valor", "Soma", 3));
					
					result = calc.somar(v1,v2);
					JOptionPane.showMessageDialog(null, v1+" + "+v2+" = "+result,"Resultado", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:
					v1 =  Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 1� valor", "Subtra��o", 3));
					v2 =  Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 2� valor", "Subtra��o", 3));
					
					result = calc.subtrair(v1, v2);
					JOptionPane.showMessageDialog(null, v1+" - "+v2+" = "+result,"Resultado", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					v1 =  Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 1� valor", "Multiplic��o", 3));
					v2 =  Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 2� valor", "Multiplica��o", 3));
					
					result = calc.multiplicar(v1, v2);
					JOptionPane.showMessageDialog(null, v1+" x "+v2+" = "+result,"Resultado", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4:
					v1 =  Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 1� valor", "Divis�o", 3));
					v2 =  Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o 2� valor", "Divis�o", 3));
					
					if(v2==0) {
						JOptionPane.showMessageDialog(null, "opera��o n�o permitida", "Erro", JOptionPane.ERROR_MESSAGE);
					}else {
						result = calc.dividir(v1, v2);
						JOptionPane.showMessageDialog(null, v1+" / "+v2+" = "+result,"Resultado", JOptionPane.INFORMATION_MESSAGE);
					}
					break;
				case 5:
					System.out.println("Outros");
					
					
						
				default:
					JOptionPane.showMessageDialog(null, "opera��o n�o permitida", "Erro", JOptionPane.ERROR_MESSAGE);	
			}
			
		}while(op != 0);
			
	}
}
