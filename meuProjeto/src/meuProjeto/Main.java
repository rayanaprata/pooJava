package meuProjeto;

public class Main {

	public static void main(String[] args) {
		
		String[] wordListOne = {"verdadeira", "excitante", "alegre", "horripilante", "fatal", "apaixonante", "tr�gica", "sangrenta", "famosa", "grande", "penosa", "triste", "desastrosa", "formosa", "obscura", "gloriosa", "infeliz", "emocionante", "fant�stica", "terr�vel", "aborrecida", "incr�vel", "desgra�ada", "lament�vel", "c�mica", "miser�vel"};
		String[] wordListTwo = {"fa�anha", "reencarna��o", "batalha", "exist�ncia", "morte", "miss�o", "vingan�a", "anedota", "vida", "lenda", "hist�ria", "biografia"};
		String[] wordListThree = {"assassino/a", "louco/a", "fan�tico/a", "sonhador/a", "g�nio incompreendido", "s�mbolo sexual", "alc�latra", "guerreiro/a", "aventureiro/a", "bipolar"};
		
		//descobrir o quantas palavras existem em cada lista
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		//gerar n�meros aleat�rios
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		System.out.println("O livro da sua vida se chama: ");
		
		//construir/exibir a frase
		System.out.println("A " + wordListOne[rand1] + " " + wordListTwo[rand2] + " de um " + wordListThree[rand3] + ".");

	}

}
