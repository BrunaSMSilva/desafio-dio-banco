
public abstract class Conta implements IConta{
	
	private static final int agencia_padrao = 1;
	private static int SEQUENCIAL = 1;
	
	
	protected int agencia; 
	protected int numeroconta; 
	protected double saldo; 
	protected Cliente Cliente; 
	
		public Conta () {
		this.agencia = Conta.agencia_padrao;
		this.numeroconta = SEQUENCIAL++;
		this.Cliente = Cliente; 
		}
	
	public Cliente getCliente() {
			return Cliente;
		}

		public void setCliente(Cliente liente) {
			this.Cliente = Cliente;
		}

	public int getAgencia() {
		return agencia;
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor; 
		
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor; 
		
	}

	@Override
	public void transferir(double valor, Conta ContaDestino) {
		this.sacar(valor);
		ContaDestino.depositar(valor);
		
	}

	protected void ImprimirInfosComuns() {
		System.out.println(String.format("Agencia: %d", agencia));
		System.out.println(String.format("Conta: %d", numeroconta));
		System.out.println(String.format("Saldo: %.2f", saldo));
	
}
}


