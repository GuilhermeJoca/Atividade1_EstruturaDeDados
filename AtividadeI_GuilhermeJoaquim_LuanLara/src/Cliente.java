
public class Cliente {

	private String cpf, nome;
	private double saldo;
	
	public Cliente(String cpf){
		this.cpf = cpf;
	}
	
	public double pegarSaldo() {
		return saldo;
	}

	public String pegarNome() {
		return nome;
	}

	public void especificarNome(String nome) {
		this.nome = nome;
	}
	
	public void saque(double valor){
		this.saldo -= valor;
	}
	
	public void deposito(double valor){
		this.saldo += valor;
	}
	
	public String relatorio() {
		return "Cliente: " + this.nome + " | CPF:  " + this.cpf + " | Saldo: R$ " + this.saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Cliente cliente = (Cliente) obj;
		return this.cpf.equals(cliente.cpf);
	}
	
}
