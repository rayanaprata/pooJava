package meuProjeto;

public class Matriz {

	public static int[][] mat;
	
	public static int[][] criar (int lin, int col, int val) {
		
		mat = new int[lin][col];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = val;
			}
		}
		
		return mat;
		
	}
	
	public static int[][] criar (int lin, int col) {
		
		mat = new int[lin][col];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = (int) (Math.random() * 9);;
			}
		}
		
		return mat;
		
	}
	
	public static void imprimir (int[][] mat) {
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.print(" " + mat[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	public static boolean buscar (int[][] mat, int num) {
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if (num == mat[i][j]) {
					return true;
				}
			}
		}
		return false;

	}
	
}
