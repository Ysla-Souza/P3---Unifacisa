package banco;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Conta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int agencia;
	private int conta;
	private double saldo;
	private String titular;
	private double limite;
	private final double valorLimite = 1.500;

	public void sacar(double valor) {
		if (valor > this.valorLimite && valor > this.saldo) {
			throw new RuntimeException("Liso");
		}
		this.saldo -= valor;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
}