public abstract class Contato {
	
	private String nome;
	private Endereco endereco; // = new Endereco(); //opção a
	
//	public Contato() {
//		endereco = new Endereco();
//	} //opção b
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		if (endereco == null) {
			endereco = new Endereco();
		}		
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
