package net.unir.missi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SumaSencillaStepsDefinition {

	private Calculadora calculadora;
	private Integer resultado;

	@Given("Quiero sumar dos numeros")
	public void quiero_sumar_dos_numeros() {
		calculadora = new Calculadora();
	}

	@When("Sumo {int} y {int}")
	public void sumo_y(Integer int1, Integer int2) {
		resultado = calculadora.sumar(int1, int2);
	}

	@Then("Compruebo que el resultado de la suma es {int}")
	public void compruebo_que_el_resultado_de_la_suma_es(Integer int1) {
		assertEquals(resultado, int1);
	}	
	
}
