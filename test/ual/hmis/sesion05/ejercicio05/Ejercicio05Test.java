package ual.hmis.sesion05.ejercicio05;
import ual.hmis.sesion05.ejercicio05.Ejercicio05;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
public class Ejercicio05Test extends Ejercicio05 {
	static Stream<Arguments> Lists(){
		ArrayList<Integer>  M1 = new ArrayList<Integer>() ;
		M1.add(1);
		M1.add(2);
		M1.add(3);
		ArrayList<Integer>  M2 = new ArrayList<Integer>() ;
		M2.add(4);
		M2.add(5);
		M2.add(6);
		M2.add(7);
		ArrayList<Integer>  result12 = new ArrayList<Integer>() ;
		result12.add(1);
		result12.add(2);
		result12.add(3);
		result12.add(4);
		result12.add(5);
		result12.add(6);
		result12.add(7);
		
		return Stream.of(Arguments.of(M1, M2,result12));
	}
	@ParameterizedTest//(name = "{0} => Con pass ({1}) devuelve ({2})")
	@MethodSource("Lists")
	public void testFusionar(ArrayList<Integer> A1,ArrayList<Integer> A2,ArrayList<Integer>result) {
		Ejercicio05 ej = new Ejercicio05();
		assertEquals(result, ej.fusionar(A1, A2));
	}
}
