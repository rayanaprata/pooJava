package meuProjeto;


public class Main1{

   public static void main( String args[] ){
	   
      int notas[][] = { { 8, 9, 7 }, { 6, 8, 9 },{ 9, 10, 9 },
    		   { 10, 8, 8 }, { 8, 6, 8 }};
      
      Turma ads3 = new Turma("ADS3-POO", notas)
      
      ads3.imprimirNotas();
      
      System.out.println("M�dia da Turma: " + ads3.mediaTurma());
      System.out.println("Maior Nota: " + ads3.maiorNota());
      System.out.println("Menor Nota: "+ ads3.menorNota());
 
   } 
}
//SA�DA ESPERADA
//Notas da Turma ADS3-POO
//P1   P2   P3   M�dia
// 8    9    7   8.00
// 6    8    9   7.67
// 9   10    9   9.33
//10    8    8   8.67
// 8    6    8   7.33
//M�dia da Turma: 8.2
//Maior Nota: 10
//Menor Nota: 6

