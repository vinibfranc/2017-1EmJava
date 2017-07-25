package artigotdd.calculadora.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste {
	@Test
	public void deveriaSomarDoisValoresPassados() throws Exception {
		int valorA = 1;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.soma(valorA, valorB);
		assertEquals(3, soma);
	}
	@Test
	public void deveriaSubtrairDoisValoresPassados() throws Exception {
		int valorA = 1;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.subtrai(valorA, valorB);
		assertEquals(-1, soma);
	}
	
	@Test
	public void deveriaDividirDoisValoresPassados() throws Exception {
		int valorA = 6;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.divide(valorA, valorB);
		assertEquals(3, soma);
	}
	
	@Test(expected = ArithmeticException.class)
	public void deveriaLancarUmaExcecaoIndicandoFalhaAoDividirPorZero() throws Exception {
		int valorA = 6;
		int valorB = 0;
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.divide(valorA, valorB);
		assertEquals(0, soma);
	}
	
}
