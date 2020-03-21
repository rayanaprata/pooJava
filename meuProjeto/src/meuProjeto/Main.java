package meuProjeto;

public class Main {

	public static void main(String[] args) {
		
		String[] wordListOne = {"verdadeira", "excitante", "alegre", "horripilante", "fatal", "apaixonante", "trágica", "sangrenta", "famosa", "grande", "penosa", "triste", "desastrosa", "formosa", "obscura", "gloriosa", "infeliz", "emocionante", "fantástica", "terrível", "aborrecida", "incrível", "desgraçada", "lamentável", "cômica", "miserável"};
		String[] wordListTwo = {"façanha", "reencarnação", "batalha", "existência", "morte", "missão", "vingança", "anedota", "vida", "lenda", "história", "biografia"};
		String[] wordListThree = {"assassino/a", "louco/a", "fanático/a", "sonhador/a", "gênio incompreendido", "símbolo sexual", "alcólatra", "guerreiro/a", "aventureiro/a", "bipolar"};
		
		//descobrir o quantas palavras existem em cada lista
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		//gerar números aleatórios
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		System.out.println("O livro da sua vida se chama: ");
		
		//construir/exibir a frase
		System.out.println("A " + wordListOne[rand1] + " " + wordListTwo[rand2] + " de um " + wordListThree[rand3] + ".");

	}

}
