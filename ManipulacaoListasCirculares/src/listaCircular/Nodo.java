package listaCircular;

/* Uma lista din�mica possui Nodos, ou seja, elementos que podem possuir dados e refer�ncias para outras partes da lista
 * Tal classe possui o dado, que ser� passado como par�metro, e a refer�ncia para o pr�ximo Nodo da lista
 */
public class Nodo {
	protected String dado;
	protected Nodo proximo = null;
	
	public Nodo(String d) {
		this.dado = d;
		this.proximo = null;
	}
}
