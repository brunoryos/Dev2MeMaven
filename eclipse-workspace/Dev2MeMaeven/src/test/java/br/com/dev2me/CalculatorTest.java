package br.com.dev2me;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void deveriaSomarDoisValoresInformados() {
		
		int valor1 = 2;
		int valor2 = 2;
		int soma = 0;
		
		Calculator calc = new CalculatorImpl();
		soma = calc.sum(valor1, valor2);
				
		assertEquals(soma,4);
		}
	
	@Test
	public void deveriaSubtrairDoisValoresInformados() {
		
		int valor1 = 5;
		int valor2 = 2;
		int sub = 0;
		
		Calculator calc = new CalculatorImpl();
		sub = calc.subtraction(valor1, valor2);
				
		assertEquals(sub,3);
		}
	
	@Test
	public void deveriaMultiplicarDoisValoresInformados() {
		
		int valor1 = 5;
		int valor2 = 2;
		int multi = 0;
		
		Calculator calc = new CalculatorImpl();
		multi = calc.multiplication(valor1, valor2);
				
		assertEquals(multi,10);
		}
	@Test
	public void deveriaDividirDoisValoresInformados() {
		
		int valor1 = 10;
		int valor2 = 2;
		int div = 0;
		
		Calculator calc = new CalculatorImpl();
		div = calc.division(valor1, valor2);
				
		assertEquals(div,5);
		}
	@Test
	public void deveriaSerIgualDoisValoresInformados() {
		
		int valor1 = 10;
		int valor2 = 10;
		boolean igual = false;
		
		Calculator calc = new CalculatorImpl();
		igual = calc.equalIntegers(valor1, valor2);
				
		assertTrue(igual);
		}

}
