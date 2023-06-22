package ual.hmis.sesion05.ejercicio04;
import ual.hmis.sesion05.ejercicio04.Ejercicio04;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Iterator;
import java.util.stream.Stream;
public class Ejercicio04Test extends Ejercicio04 {
	static Stream<Arguments> matrices(){
		int[][] M1 = {{1,3,2,2,4},{4,2,1,4,5},{1,3,5,5,2},{1,3,5,5,2},{2,3,5,8,0}};
		int[][] R1 = {{1,2,5,5,0},{4,4,5,3,2}};
		int[][] M2 = {{1,2,3,4,5},{4,5,6,2,3},{4,5,6,2,3},{1,2,5,5,0},{4,4,5,3,2}};
		int[][] R2 = {{1,5,6,5,2},{5,2,6,2,4}};
		int[][] M3 = {{1,2,3,9,7},{4,5,6,0,5},{7,8,9,2,9},{1,5,6,5,2},{5,2,6,2,4}};
		int[][] R3 = {{1,5,9,5,4},{7,0,9,5,5}};

		return Stream.of(Arguments.of(M1, R1),Arguments.of(M2, R2),Arguments.of(M3, R3));
	}
	static Stream<Arguments> Suma(){
		double[][] M1 = {{1,3,2,2,4},{4,2,1,4,5},{1,3,5,5,2},{1,3,5,5,2},{2,3,5,8,0}};
		double[] R1 = {9,14,18,24,13};
		double[][] M2 = {{1.3,2,3.3,4,5},{4,5,6,2,3},{4,5,6,2,3},{1,2,5,5,0},{4,4,5,3,2}};
		double[] R2 = {14.3,18,25.3,16,13};
		double[][] M3 = {{1,2,3,9,7},{4,5,6,0,5},{7,8,9,2,9},{1,5,6,5,2},{5,2,6,2,4}};
		double[] R3 = {18,22,30,18,27};
		return Stream.of(Arguments.of(M1, R1),Arguments.of(M2, R2),Arguments.of(M3, R3));
	}
	@ParameterizedTest//(name = "{0} => Con pass ({1}) devuelve ({2})")
	@MethodSource("matrices")
	public void testobtenerDiagonales(int[][] matriz,int[][] salida) {
		int[][] aux=Ejercicio04.obtenerDiagonales(matriz);
		for (int i = 0; i < aux.length; i++) {
	    	for (int j = 0; j < aux[i].length; j++) {
	            assertEquals(aux[i][j],salida[i][j]);
	        }
		}
	}
	@ParameterizedTest//(name = "{0} => Con pass ({1}) devuelve ({2})")
	@MethodSource("Suma")
	public void testSumaColumnas(double[][] matriz,double[] salida) {
		for (int i = 0; i < matriz.length; i++) {
	        assertEquals(Ejercicio04.sumarColumnas(matriz)[i],salida[i]);
		}
	}
}
