
public class Pilha extends Colecao {
	
	protected int posAtual;
	
	public Pilha() {
		super();
	}
	
	public Pilha(int tamanho) {
		super(tamanho);
	}
	
	public void inserirItem(Object item) {
		itens[posAtual] = item;
		posAtual++;
	}
	
	public Object removerItem() {
		posAtual--;
		Object item = itens[posAtual];
		itens[posAtual] = null;
		return item;
	}

}
