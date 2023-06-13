package ual.hmis.sesion05.ejercicio01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio1Test {

	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"30, 1"})
	
	void testTransformar(int input, int expected) {
		Ejercicio01 c = new Ejercicio01();
		assertEquals(expected, c.transformar(input));
	}
}
