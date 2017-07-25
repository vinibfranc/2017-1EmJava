package listaCircular;

/* Implementa��o de alguns m�todos de manipula��o de listas circulares, que s�o listas din�micas nas quais n�o h� fim, ou seja, 
 * o ponteiro do �ltimo elemento aponta para o in�cio da lista.
 * Nesse caso, s� h� um ponteiro para o pr�ximo, configurando uma "lista circular simplesmente encadeada" */
public class MetodosListaCircular {
	// Refer�ncia de Nodo para o fim da lista (trata-se de uma padroniza��o)
	protected Nodo fim;
	
	public MetodosListaCircular() {
		this.fim = null;
	}
	// Adiciona nodo no in�cio da lista (como s� h� refer�ncia para o fim, deve-se inserir no seu pr�ximo)
	public void adicionaInicio(String dado) {
		Nodo novoNodo = new Nodo(dado);
		if (this.fim == null) {
			this.fim = novoNodo;
			novoNodo.proximo = novoNodo;
		}
		else {
			novoNodo.proximo = this.fim.proximo;
			this.fim.proximo = novoNodo;
		}
	}
	// Adiciona no fim da lista circular
	public void adicionaFim(String dado) {
		Nodo novoNodo = new Nodo(dado);
		if (this.fim == null) {
			this.fim = novoNodo;
			novoNodo.proximo = novoNodo;
		}
		else {
			novoNodo.proximo = this.fim.proximo;
			this.fim.proximo = novoNodo;
			this.fim = novoNodo;
		}
	}
	// Busca um dado inserido em um Nodo, devolvendo sua posi��o na lista (�ndice inicia em 0, mas posi��o � impressa a partir de 1)
	public void buscaElemento(String conteudo) {
		Nodo nodoAtual = this.fim.proximo;
		int cont = 0, achou = 0; // contador de posi��es e flag para achar
		while (nodoAtual != this.fim && achou == 0) {
			if (conteudo == nodoAtual.dado) {
				achou = 1; 
			}
			else {
				nodoAtual = nodoAtual.proximo; 
			}
			cont++; 
		}
		// Depois que varreu a lista, imprime a posi��o ou que n�o achou
		if (achou == 1) {
			System.out.println ("\nA posi��o do elemento "+conteudo+" �: "+cont);
		}
		else {
			System.out.println ("O elemento "+conteudo+" n�o foi encontrado!");
		}
	}
	// Impress�o dos dados da lista inseridos at� o momento da sua chamada (ordenadamente conforme sua proposta)  
	public void imprimeConteudo() {
		System.out.println ("Lista Circular: ");
		Nodo nodoAtual = this.fim.proximo;
		while (nodoAtual != this.fim) {
			System.out.print (nodoAtual.dado +" ");
			nodoAtual = nodoAtual.proximo;
		}
		System.out.print(this.fim.dado + " ");
	}
	// Chamada das fun��es desenvolvidas acima, explorando sua funcionalidade
	public static void main (String [] args) {	
		MetodosListaCircular list = new MetodosListaCircular();
		list.adicionaFim("T�cnicas");
		list.adicionaFim("Avan�adas");
		list.adicionaFim("EAD");
		list.adicionaInicio("Revis�o de c�digo - "); 
		list.imprimeConteudo();
		list.buscaElemento("Avan�adas");
		list.buscaElemento("Oi");
	}	
}
