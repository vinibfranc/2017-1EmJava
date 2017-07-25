package atividadepratica3;

public class Questoes {
	
	private String[] questoes;
	
	public Questoes()
	{
		questoes= new String[7];
		// pergunta
		questoes[0]="Qual é a capital do Brasil?";
		// opções
		questoes[1]="Belém";
		questoes[2]="Rio de Janeiro";
		questoes[3]="São Paulo";
		questoes[4]="Brasília";
		questoes[5]="Salvador";
		// resposta
		questoes[6]="Brasília";
	}

	
	public String getPergunta()
	{
		return questoes[0];
		
	}
	
	public String[] getOpcoes()
	{
		String[] opcoes={questoes[1],questoes[2],questoes[3],questoes[4],questoes[5]};
		return opcoes;
	}
	
	public String getResposta()
	{
		return questoes[6];
	}

}

