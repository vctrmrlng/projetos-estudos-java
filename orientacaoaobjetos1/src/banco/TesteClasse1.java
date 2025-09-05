package banco;

public class TesteClasse1 {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.setAgencia(1);
		conta1.setNumero(100);
		conta1.setSaldo(200);
		System.out.println("Saldo inicial = " + conta1.getSaldo());
		double valorDeposito = 10.00;
		conta1.deposita(valorDeposito);
		System.out.println("Valor do depósito = " + valorDeposito);
		System.out.println("Saldo após o depósito = " + conta1.getSaldo());
		int valorSaque = 10000;
		System.out.println("Valor do saque = " + valorSaque);
		if (conta1.saca(valorSaque))
			System.out.println("Saldo após = " + conta1.getSaldo());
		else
			System.out.println("Não foi possível efetuar o saque.");
	}

}
