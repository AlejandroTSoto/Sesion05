package ual.hmis.sesion05.ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio04Test {
	@ParameterizedTest
	@CsvSource({
		"1,2,3; 4,5,6; 7,8,9, 1,9; 5,5; 7,3",
		"10,20,30,40; 50,60,70,80; 90,100,110,120, 10,60,100; 50,70,110",
		"1; 1, 1; 1,1; 1,1"
	})
	public void testObtenerDiagonales(int[][] matriz, int[][] expectedDiagonales) {
		int[][] actualDiagonales = Ejercicio04.obtenerDiagonales(matriz);
		assertArrayEquals(expectedDiagonales, actualDiagonales);
	}
	
	@ParameterizedTest
	@CsvSource({
		"1.5,2.5,3.5; 4.5,5.5,6.5; 7.5,8.5,9.5; 13.5,16.5,19.5",
		"10.2,20.4,30.6,40.8; 50.1,60.3,70.5,80.7; 90.9,100.11,110.13,120.15; 151.2,181.4,211.6",
		"1.0; 1.0, 1.0; 1.0, 1.0"
	})
	public void testSumarColumnas(double[][] matriz, double[] expectedSumaColumnas) {
		double[] actualSumaColumnas = Ejercicio04.sumarColumnas(matriz);
		assertArrayEquals(expectedSumaColumnas, actualSumaColumnas);
	}
}
