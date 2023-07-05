package net.unir.missi;

public class Calculadora {

	public int sumar(int numero1, int numero2) {
		return numero1 + numero2;
	}

	public int restar(int numero1, int numero2) {
		return numero1 - numero2;
	}

	public int multiplicar(int numero1, int numero2) {
		return numero1 * numero2;
	}

	public int dividir(int numero1, int numero2) throws Exception {
		if (numero2 == 0)
			throw new ArithmeticException("/ por cero");
		return numero1 / numero2;
	}

	public int fibonacci(int numero) {
		if (numero == 0) {
			return 0;
		} else if (numero == 1) {
			return 1;
		}
		return fibonacci(numero - 1) + fibonacci(numero - 2);
	}

}