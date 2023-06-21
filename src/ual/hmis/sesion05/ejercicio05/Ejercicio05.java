package ual.hmis.sesion05.ejercicio05;
import java.util.*;

public class Ejercicio05 {
	public static <T extends Comparable<? super T>> Set<T> mergeSets(Set<T> set1, Set<T> set2) {
        Set<T> mergedSet = new TreeSet<>();

        Iterator<T> iterator1 = set1.iterator();
        Iterator<T> iterator2 = set2.iterator();

        T element1 = null;
        T element2 = null;

        if (iterator1.hasNext()) {
            element1 = iterator1.next();
        }
        if (iterator2.hasNext()) {
            element2 = iterator2.next();
        }

        while (element1 != null && element2 != null) {
            if (element1.compareTo(element2) < 0) {
                mergedSet.add(element1);
                if (iterator1.hasNext()) {
                    element1 = iterator1.next();
                } else {
                    element1 = null;
                }
            } else if (element1.compareTo(element2) > 0) {
                mergedSet.add(element2);
                if (iterator2.hasNext()) {
                    element2 = iterator2.next();
                } else {
                    element2 = null;
                }
            } else {
                mergedSet.add(element1);
                if (iterator1.hasNext()) {
                    element1 = iterator1.next();
                } else {
                    element1 = null;
                }
                if (iterator2.hasNext()) {
                    element2 = iterator2.next();
                } else {
                    element2 = null;
                }
            }
        }

        while (element1 != null) {
            mergedSet.add(element1);
            if (iterator1.hasNext()) {
                element1 = iterator1.next();
            } else {
                element1 = null;
            }
        }

        while (element2 != null) {
            mergedSet.add(element2);
            if (iterator2.hasNext()) {
                element2 = iterator2.next();
            } else {
                element2 = null;
            }
        }

        return mergedSet;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9));
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(2, 4, 6, 8, 10));

        Set<Integer> mergedSet = mergeSets(set1, set2);

        System.out.println("Conjunto 1: " + set1);
        System.out.println("Conjunto 2: " + set2);
        System.out.println("Conjunto combinado: " + mergedSet);
    }

}
