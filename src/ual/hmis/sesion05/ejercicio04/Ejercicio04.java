	package ual.hmis.sesion05.ejercicio04;

public class Ejercicio04 {
	public static int[][] obtenerDiagonales(int[][] matriz){
		int[] diagonal1={0,0,0,0,0};
		int[] diagonal2={0,0,0,0,0};
		
		int aux1=0;
		int aux2=matriz.length-1;
		 for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
				if(aux1==j) diagonal1[i]=matriz[i][j];
				if(aux2==j) diagonal2[i]=matriz[i][j];
			}
	            aux2--;
	            aux1++;
		}
		
		 int[][]result = {diagonal1,diagonal2};
		
		
		
		return result;
	}
	public static double [] sumarColumnas(double [][] matriz) {
		double columna0=0;
		double columna1=0;
		double columna2=0;
		double columna3=0;
		double columna4=0;
		 for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	            switch (j) {
				case 1:
					columna1=columna1+matriz[i][j];
					break;
				case 2:
					columna2=columna2+matriz[i][j];
					break;
				case 3:
					columna3=columna3+matriz[i][j];
					break;
				case 4:
					columna4=columna4+matriz[i][j];
					break;
					
				default:
					columna0=columna0+matriz[i][j];
					break;
	            }
	            }
	     }
		 double []result={columna0,columna1,columna2,columna3,columna4};
		return result;
		
	}

}
