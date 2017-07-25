package listaCircular;

/* Uma lista dinâmica possui Nodos, ou seja, elementos que podem possuir dados e referências para outras partes da lista
 * Tal classe possui o dado, que será passado como parâmetro, e a referência para o próximo Nodo da lista
 */
public class Nodo {
	protected String dado;
	protected Nodo proximo = null;
	
	public Nodo(String d) {
		this.dado = d;
		this.proximo = null;
	}
}
