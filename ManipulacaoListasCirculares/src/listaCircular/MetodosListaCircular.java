package listaCircular;

/* Implementação de alguns métodos de manipulação de listas circulares, que são listas dinâmicas nas quais não há fim, ou seja, 
 * o ponteiro do último elemento aponta para o início da lista.
 * Nesse caso, só há um ponteiro para o próximo, configurando uma "lista circular simplesmente encadeada" */
public class MetodosListaCircular {
	// Referência de Nodo para o fim da lista (trata-se de uma padronização)
	protected Nodo fim;
	
	public MetodosListaCircular() {
		this.fim = null;
	}
	// Adiciona nodo no início da lista (como só há referência para o fim, deve-se inserir no seu próximo)
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
	// Busca um dado inserido em um Nodo, devolvendo sua posição na lista (índice inicia em 0, mas posição é impressa a partir de 1)
	public void buscaElemento(String conteudo) {
		Nodo nodoAtual = this.fim.proximo;
		int cont = 0, achou = 0; // contador de posições e flag para achar
		while (nodoAtual != this.fim && achou == 0) {
			if (conteudo == nodoAtual.dado) {
				achou = 1; 
			}
			else {
				nodoAtual = nodoAtual.proximo; 
			}
			cont++; 
		}
		// Depois que varreu a lista, imprime a posição ou que não achou
		if (achou == 1) {
			System.out.println ("\nA posição do elemento "+conteudo+" é: "+cont);
		}
		else {
			System.out.println ("O elemento "+conteudo+" não foi encontrado!");
		}
	}
	// Impressão dos dados da lista inseridos até o momento da sua chamada (ordenadamente conforme sua proposta)  
	public void imprimeConteudo() {
		System.out.println ("Lista Circular: ");
		Nodo nodoAtual = this.fim.proximo;
		while (nodoAtual != this.fim) {
			System.out.print (nodoAtual.dado +" ");
			nodoAtual = nodoAtual.proximo;
		}
		System.out.print(this.fim.dado + " ");
	}
	// Chamada das funções desenvolvidas acima, explorando sua funcionalidade
	public static void main (String [] args) {	
		MetodosListaCircular list = new MetodosListaCircular();
		list.adicionaFim("Técnicas");
		list.adicionaFim("Avançadas");
		list.adicionaFim("EAD");
		list.adicionaInicio("Revisão de código - "); 
		list.imprimeConteudo();
		list.buscaElemento("Avançadas");
		list.buscaElemento("Oi");
	}	
}
