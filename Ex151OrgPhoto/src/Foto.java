import java.util.Date;

public class Foto {
	
	private int id;
	private Date data;
	private String local;
	
	public Foto(int id, Date data, String local) {
		this.id = id;
		this.data = data;
		this.local = local;		
	}

	public int getId() {
		return id;
	}

	public Date getData() {
		return data;
	}

	public String getLocal() {
		return local;
	}
	
	

}
