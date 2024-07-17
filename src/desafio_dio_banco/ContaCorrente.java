package desafio_dio_banco;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imrprimirExtrato() {
		System.out.println("Extrato Conta Corrente");
		super.imprimirInfosComuns();
	}
	
}
