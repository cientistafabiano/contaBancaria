package contaBancaria;

public class ContaBancaria {
	//numero da conta não pode ser alterado entao não terá setnConta
	private String nConta;
	//o nome pode ser alterado, metodos get e set
	private String nameTitular;
	//metodo get, porque ele só podera ser alterado pelos metodos deposito e saque
	private double saldoConta;
	
	//CONTRUTOR padrao que é uma sobrecarga
	public ContaBancaria() {
	}
	//CONTRUTOR
	public ContaBancaria(String nConta, String nameTitular, double inicioDeposito) {
		this.nConta = nConta;
		this.nameTitular = nameTitular;
		//é importante nas regras de negocio futuro caso haja alguma alteração, assim só alteramos
		//o metodo e não o construtor
		deposito(inicioDeposito);
	}
	//SOBRECARGA
	public ContaBancaria(String nConta, String nameTitular) {
		this.nConta = nConta;
		this.nameTitular = nameTitular;
	}
		// valor da taxa de saque
	public static final double CTE = 5.00;
	
	public void deposito(double deposito) {
		saldoConta += deposito;
	}
	public void saque(double saque) {
		saldoConta -= (saque + CTE);
	}
	//metodos GETters e SETters
	public String getnConta() {
		return nConta;
	}	
	public String getNameTitular() {
		return nameTitular;
	}
	public void setNameTitular(String nameTitular) {
		this.nameTitular = nameTitular;
	}
	public double getSaldoConta() {
		return saldoConta;
	}
	public String toString() {
		return "Account"+nConta+", Holder: "+nameTitular+", Balance: "+saldoConta;
	}

}
