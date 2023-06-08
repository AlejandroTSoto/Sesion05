package ual.hmis.sesion05.ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio04Test {

	@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {2}")
	@CsvSource({"holah,hierro,ho"})
	
	void testInterseccion(String p1, String p2, String expected) {
		Ejercicio04 c = new Ejercicio04();
		assertEquals(expected, c.interseccion(p1,p2));
	}
}
