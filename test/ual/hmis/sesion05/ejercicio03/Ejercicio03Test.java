package ual.hmis.sesion05.ejercicio03;

import ual.hmis.sesion05.ejercicio03.Ejercicio03;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio03Test extends Ejercicio03 {
	@ParameterizedTest//(name = "{0} => Con pass ({1}) devuelve ({2})")
	@CsvSource({"123,password demasiado corto","12345,********","123456789101112,************","1234567,********","123456789101,************",
		"usereeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee,password demasiado largo"})
	public void testcifradop(String st1,String result) {
		Ejercicio03 ej =new Ejercicio03();
		assertEquals(result,ej.encriptarPassword(st1));
		}
}
