
public class Fila extends Colecao {
	
	protected int posInserir;
	protected int posRemover;
	
	public Fila() {
		super();
	}
	
	public Fila(int tamanho) {
		super(tamanho);
	}
	
	public void inserirItem(Object item) {
		itens[posInserir] = item;
		posInserir++;
	}
	
	public Object removerItem() {
		Object item = itens[posRemover];
		itens[posRemover] = null;
		return item;
	}

}
