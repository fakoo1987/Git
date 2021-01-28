package com.Tonyluis.Trabajo1;

public class Trabajosemana1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int miArreglo2D[][] = new int[4][4];
		
		//Llenado de la matriz
		int x = 2;
		for (int i = 0; i < miArreglo2D.length; i++) {
			for (int j = 0; j < miArreglo2D[i].length; j++) {
				miArreglo2D[i][j] = x;
				x += 2;
			}						
		}		
		
		//Visualizacion de la matriz
		for (int i = 0; i < miArreglo2D.length; i++) {
			for (int j = 0; j < miArreglo2D[i].length; j++) {
				if (i==0) {
					System.out.print(" "+miArreglo2D[i][j] + " ");
				}				
				else {
					System.out.print(miArreglo2D[i][j] + " ");
				}
			}
			System.out.println();
	}

}
}
