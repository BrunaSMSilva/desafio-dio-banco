import javax.swing.JOptionPane;

public class Main {
	
	public static void main (String [] args) {
		
		String nome = JOptionPane.showInputDialog("Qual seu nome: ");
		System.out.println(nome);
		Conta cc = new ContaCorrente();
		cc.depositar(2000);
		cc.sacar(50);
		
		Conta poupanca = new ContaPoupanca();
		cc.transferir(500, poupanca);
		poupanca.sacar(30);
		
	
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	
	
 }
}
