package ual.hmis.sesion05.ejercicio05;
import java.util.ArrayList;
public class Ejercicio05 {
	public  ArrayList<Integer> fusionar(ArrayList<Integer> A1 ,ArrayList<Integer> A2) {
		ArrayList<Integer> result= A1;
		for (Integer i : A2) {
			result.add(i);
		}
		result.sort(null);
		return result;
	}
}
