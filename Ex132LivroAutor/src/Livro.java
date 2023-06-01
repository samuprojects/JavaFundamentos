import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Livro implements Recordable {

	private String titulo;
	private int numPaginas;
	private Autor autor;

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public Autor getAutor() {
		return autor;
	}

	public void read(DataInputStream in) throws IOException {

		titulo = in.readUTF();
		if (titulo.equals(NULL_DATA)) {
			titulo = null;
		}

		numPaginas = in.readInt();

		if (autor == null) {
			autor = new Autor();
		}

		autor.read(in);
	}

	public void write(DataOutputStream out) throws IOException {

		if (titulo == null) {
			out.writeUTF(NULL_DATA);
		} else {
			out.writeUTF(titulo);
		}

		out.writeInt(numPaginas);

		if (autor != null) {
			autor.write(out);
		}
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", numPaginas=" + numPaginas + ", autor=" + autor + "]";
	}

}
