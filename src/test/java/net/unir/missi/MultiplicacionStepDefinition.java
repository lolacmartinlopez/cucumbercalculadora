package net.unir.missi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiplicacionStepDefinition {
	
	
	//Definicion de las clases a crear/usar en el test
	
		private Calculadora calculadora;
		private Integer resultado;
		private Exception exception;

	@Given("Quiero multiplicar dos numeros")
	public void quiero_multiplicar_dos_numeros() {
		calculadora = new Calculadora();
	}

	@When("Multiplico {int} y {int}")
	public void multiplico_y(Integer int1, Integer int2) {
		try {
			resultado = calculadora.multiplicar(int1, int2);
			exception = null;
		}
		catch (Exception ex)
		{
			resultado = null;
			exception = ex;
		}
	}
	
	//Primer caso: Funcione bien la multiplicación. 
	@Then("Compruebo que el resultado de la multiplicacion es {int}")
	public void compruebo_que_el_resultado_de_la_multiplicacion_es(Integer int1) {
	    assertEquals(resultado, int1);
	}
	
	//Segundo caso: La multiplicación no esté bien implementada.
	@Then("Compruebo que el resultado es la excepción de {string} con mensaje {string}")
	public void compruebo_que_el_resultado_de_la_multiplicacion_es(String string, String string2) {
		assertEquals(exception.getClass().getCanonicalName(), string);
		assertEquals(exception.getMessage(), string2);
	}
	
	
	
}
