package ual.hmis.sesion05.ejercicio03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio03Test {
    private final Ejercicio03 ejercicio03 = new Ejercicio03();

    @ParameterizedTest
    @CsvSource({"1234, password demasiado corto", //Menos de 5
        "passw, ********", //Igual a 5
        "passww, ********", //Entre 5 y 8
        "password, ********", //Igual a 8
        "securePassword, ************", //Mas de 12 y menos de 40
        "contrase�aextremadamentelargaparalaprueba, password demasiado largo"})//Mas de 40
    
    public void encriptarPasswordTest(String password, String expected) {
        String encriptado = ejercicio03.encriptarPassword(password);
        assertEquals(expected, encriptado);
    }
}
