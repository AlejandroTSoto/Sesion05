package ual.hmis.sesion05.ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio04Test {
	@ParameterizedTest
    @CsvSource({
            "1, 2, 3; 4, 5, 6; 7, 8, 9 | 1, 5, 9; 3, 5, 7",
            "9, 8; 7, 6 | 9, 6; 8, 7"
    })
    void testObtenerDiagonales(int[][] matriz, int[][] expectedDiagonals) {
        int[][] diagonals = Ejercicio04.obtenerDiagonales(matriz);
        assertArrayEquals(expectedDiagonals, diagonals);
    }

    @ParameterizedTest
    @CsvSource({
            "1.1, 2.2, 3.3; 4.4, 5.5, 6.6; 7.7, 8.8, 9.9 | 13.2, 16.5, 19.8",
            "0.5, 1.0; 1.5, 2.0 | 2.0, 3.0"
    })
    void testSumarColumnas(double[][] matriz, double[] expectedSumColumns) {
        double[] sumColumns = Ejercicio04.sumarColumnas(matriz);
        assertArrayEquals(expectedSumColumns, sumColumns);
    }

}
