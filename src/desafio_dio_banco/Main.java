package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		Cliente gustavo = new Cliente();
		gustavo.setNome("Gustavo");
		
		Conta corrente = new ContaCorrente(gustavo);
		corrente.depositar(100);
		
		Conta poupanca = new ContaPoupanca(gustavo);
		
		corrente.transferir(100, poupanca);
		
		corrente.imrprimirExtrato();
		poupanca.imrprimirExtrato();

	}

}
