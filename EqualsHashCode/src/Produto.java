public class Produto {
	
	private int id;
	private String descricao;
	
	public Produto(int id, String descricao) {
		this .id = id;
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return id + ", " + descricao;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return id == other.id;
	}
	
	
	
//	public boolean equals(Object obj) {
//		if (obj == null) {
//			return false;
//		}
//		
//		if (!(obj instanceof Produto)) {
//			return false;
//		}
//		Produto other = (Produto) obj;
//		
//		if (this.id == other.id) {
//			return true;
//		}
//		
//		return false;
//	}
//	
	public int hashCode() {
		return (int) (Math.random() * 10);
//		return String.valueOf(id).hashCode();
	}
}
