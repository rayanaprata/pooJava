package meuProjeto;


public class Main2 {

	public static void main(String args[]) {  

		int matriz[][]

		System.out.println("Matrix 3x3:");
		matriz = Matriz.criar(3,3,-1);
		Matriz.imprimir(matriz);

		System.out.println("Matrix 3x3:");
		matriz = Matriz.criar(3,3,1);
		Matriz.imprimir(matriz);

		System.out.println("Matrix 3x4:");
		matriz = Matriz.criar(3,4);
		Matriz.imprimir(matriz);

		System.out.println("Matrix 5x5:");
		matriz = Matriz.criar(5,5);
		Matriz.imprimir(matriz);

		System.out.println("Buscando o valor 5: "+ Matriz.buscar(matriz, 5));
		System.out.println("Buscando o valor -1: "+ Matriz.buscar(matriz, -1));

	} 

}

//SAIDA 1
//Matrix 3x3:
//-1 -1 -1 
//-1 -1 -1 
//-1 -1 -1 
//Matrix 3x3:
//1 1 1 
//1 1 1 
//1 1 1 
//Matrix 3x4:
//7 3 0 4 
//9 6 1 2 
//0 9 5 0 
//Matrix 5x5:
//2 9 4 8 4 
//4 4 6 4 7 
//2 4 0 0 0 
//1 6 0 0 2 
//4 7 3 7 2 
//Buscando o valor 5: false
//Buscando o valor -1: false

//SAIDA 2
//Matrix 3x3:
//-1 -1 -1 
//-1 -1 -1 
//-1 -1 -1 
//Matrix 3x3:
//1 1 1 
//1 1 1 
//1 1 1 
//Matrix 3x4:
//0 2 0 2 
//5 8 3 8 
//8 0 5 9 
//Matrix 5x5:
//8 4 2 7 1 
//0 5 8 5 8 
//4 9 4 5 1 
//9 8 6 2 7 
//8 8 4 0 4 
//Buscando o valor 5: true
//Buscando o valor -1: false