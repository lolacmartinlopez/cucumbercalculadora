package net.unir.missi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DivisionStepsDefinition {

	private Calculadora calculadora;
	private Integer resultado;
	private Exception exception;

	@Given("Quiero dividir dos numeros")
	public void quiero_dividir_dos_numeros() {
		calculadora = new Calculadora();
	}

	@When("Divido {int} y {int}")
	public void divido_y(Integer int1, Integer int2) {
		try {
			resultado = calculadora.dividir(int1, int2);
			exception = null;
		}
		catch (Exception ex)
		{
			resultado = null;
			exception = ex;
		}
	}

	@When("Divido {int} por cero")
	public void divido_por_cero(Integer int1) {
		try {
			resultado = calculadora.dividir(int1, 0);
			exception = null;
		}
		catch (Exception ex)
		{
			resultado = null;
			exception = ex;
		}
	}
	
	@Then("Compruebo que el resultado de la division es {int}")
	public void compruebo_que_el_resultado_de_la_division_es(Integer int1) {
		assertEquals(resultado, int1);
	}	

	@Then("Compruebo que el resultado es la excepción de {string} con mensaje {string}")
	public void compruebo_que_el_resultado_es_la_excepción_de_con_mensaje(String string, String string2) {
		assertEquals(exception.getClass().getCanonicalName(), string);
		assertEquals(exception.getMessage(), string2);
	}

}
