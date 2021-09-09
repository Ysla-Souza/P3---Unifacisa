package banco;

import java.io.Serializable;

public class ContaPoupanca extends Conta implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final double JUROS1 = 1.50;
	private static final double JUROS2 = 0.50;

	@Override
	public void sacar(double valor) {
		super.sacar(valor);
	}

	@Override
	public void depositar(double valor) {
		super.depositar(valor);
	}

	public double getJuros1() {
		return JUROS1 * getSaldo();
	}

	public double getJuros2() {
		return JUROS2 * getSaldo();
	}
}