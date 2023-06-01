import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Date;

public class Autor implements Recordable {

	private String nome;
	private Date dataNascimento;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}
	@Override
	public void read(DataInputStream in) throws IOException {

		nome = in.readUTF();

		if (nome.equals(NULL_DATA)) {

			nome = null;
		}

		long time = in.readLong();

		if (time == -1) {

			dataNascimento = null;
		} else {

			dataNascimento = new Date(time);
		}

	}
	@Override
	public void write(DataOutputStream out) throws IOException {

		if (nome != null) {
			out.writeUTF(nome);
		} else {

			out.writeUTF(NULL_DATA);
		}

		if (dataNascimento != null) {
			out.writeLong(dataNascimento.getTime());
		} else {

			out.writeLong(-1);
		}
	}
	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", dataNascimento=" + dataNascimento + "]";
	}

}
