package atividadepratica3;

public class Questoes {
	
	private String[] questoes;
	
	public Questoes()
	{
		questoes= new String[7];
		// pergunta
		questoes[0]="Qual � a capital do Brasil?";
		// op��es
		questoes[1]="Bel�m";
		questoes[2]="Rio de Janeiro";
		questoes[3]="S�o Paulo";
		questoes[4]="Bras�lia";
		questoes[5]="Salvador";
		// resposta
		questoes[6]="Bras�lia";
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

