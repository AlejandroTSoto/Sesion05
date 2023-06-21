package ual.hmis.sesion05.ejercicio05;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio05Test {
	@ParameterizedTest
    @MethodSource("provideSets")
    void testMergeSets(Set<Integer> set1, Set<Integer> set2, Set<Integer> expectedMergedSet) {
        Set<Integer> mergedSet = Ejercicio05.mergeSets(set1, set2);
        assertEquals(expectedMergedSet, mergedSet);
    }

    static List<Object[]> provideSets() {
        List<Object[]> testCases = new ArrayList<>();

        // Caso de prueba con conjuntos vacíos
        testCases.add(new Object[]{new TreeSet<>(), new TreeSet<>(), new TreeSet<>()});

        // Caso de prueba con un conjunto vacío y otro no vacío
        Set<Integer> set1 = new TreeSet<>(Arrays.asList(1, 3, 5));
        Set<Integer> set2 = new TreeSet<>();
        Set<Integer> expectedMergedSet1 = new TreeSet<>(Arrays.asList(1, 3, 5));
        testCases.add(new Object[]{set1, set2, expectedMergedSet1});

        // Caso de prueba con conjuntos que no se superponen
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(1, 3, 5));
        Set<Integer> set4 = new TreeSet<>(Arrays.asList(7, 9, 11));
        Set<Integer> expectedMergedSet2 = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9, 11));
        testCases.add(new Object[]{set3, set4, expectedMergedSet2});

        // Caso de prueba con conjuntos que se superponen parcialmente
        Set<Integer> set5 = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9));
        Set<Integer> set6 = new TreeSet<>(Arrays.asList(5, 7, 11));
        Set<Integer> expectedMergedSet3 = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9, 11));
        testCases.add(new Object[]{set5, set6, expectedMergedSet3});

        // Caso de prueba con conjuntos idénticos
        Set<Integer> set7 = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9));
        Set<Integer> set8 = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9));
        Set<Integer> expectedMergedSet4 = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9));
        testCases.add(new Object[]{set7, set8, expectedMergedSet4});

        return testCases;
    }

}
