package ual.hmis.sesion05.ejercicio02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio02Test {

	@ParameterizedTest (name = "{index} => Con entrada ({0},{1}) sale {2}")
	@CsvSource({", , false",
		"user, , false",
		"averylongusernametomakethetestfail,pass,false",
		"user,averylongpasswordtomakethetestfail,false",
		"user,pass,true",
		"user,password,false",
		"usuario,pass,false"})
	//FALTA LO DE LA MAYUSCULA, MINUSCULA Y EL DIGITO
	void testLogin(String usuario, String contrasenia, boolean expected) {
		Ejercicio02 c = new Ejercicio02();
		assertEquals(expected, c.login(usuario,contrasenia));
	}
}
