package meuProjeto;

public class Turma {

	private String nomeTurma;
	private int[][] notas = new int[5][3];
	
	public Turma (String nomeTur, int nt[][]) {
		nomeTurma = nomeTur;
		notas = nt;
	}
	
	public void imprimirNotas () {
		
		double soma;
		double medAluno;
		
		System.out.println("Notas da Turma " + nomeTurma);
		System.out.println("P1   P2   P3   Média");
		for(int i=0; i<notas.length; i++) {
			soma=0;
			for(int j=0; j<notas[i].length; j++) {
				System.out.print(notas[i][j] + "   ");
				soma += notas[i][j];
			}
			medAluno = soma/3;
			System.out.println(medAluno + " ");
		}
		
	}
	
	public double mediaTurma () {
		double media;
		double soma=0;
		
		for(int i=0; i<notas.length; i++) {
			for(int j=0; j<notas[i].length; j++) {
				soma += notas[i][j]; 
			}
		}
		
		media = soma/15;
		return media;
		
	}
	
	public int maiorNota () {
		int maiorNota;
		
		maiorNota = notas[0][0];
		
		for(int i=0; i<notas.length; i++) {
			for(int j=0; j<notas[i].length; j++) {
				if (maiorNota < notas[i][j]) {
					maiorNota = notas[i][j];
				}
			}
		}
		
		return maiorNota;
		
	}
	
	public int menorNota () {
		int menorNota;
		
		menorNota = notas[0][0];
		
		for(int i=0; i<notas.length; i++) {
			for(int j=0; j<notas[i].length; j++) {
				if (menorNota > notas[i][j]) {
					menorNota = notas[i][j];
				}
			}
		}
		
		return menorNota;
		
	}
	
	
	
}
