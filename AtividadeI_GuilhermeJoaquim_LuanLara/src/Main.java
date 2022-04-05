import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

	
		int opcao;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(Processo.menu()));
			if(opcao < 1 || opcao > 6) {
				JOptionPane.showMessageDialog(null, "Opcão inválida");
			}else {
				switch(opcao) {
				case 1:
					Processo.abrirConta();
					break;
				case 2:
					Processo.saque();
					break;
				case 3:
					Processo.deposito();
					break;
				case 4:
					Processo.relatorio();
					break;
				case 5:
					Processo.encerrarConta();
					break;
				}
			}
		} while(opcao != 6);
	}
	
}
