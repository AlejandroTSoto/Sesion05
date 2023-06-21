	package ual.hmis.sesion05.ejercicio04;

public class Ejercicio04 {
	public static int[][] obtenerDiagonales(int[][] matriz) {
        int n = matriz.length;
        int[][] diagonales = new int[2][n];

        for (int i = 0; i < n; i++) {
            diagonales[0][i] = matriz[i][i]; // Diagonal principal
            diagonales[1][i] = matriz[i][n - i - 1]; // Diagonal secundaria
        }

        return diagonales;
    }

    public static double[] sumarColumnas(double[][] matriz) {
        int n = matriz.length;
        double[] sumaColumnas = new double[n];

        for (int i = 0; i < n; i++) {
            double suma = 0;
            for (int j = 0; j < n; j++) {
                suma += matriz[j][i];
            }
            sumaColumnas[i] = suma;
        }

        return sumaColumnas;
    }

}
