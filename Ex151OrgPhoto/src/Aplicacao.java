import java.io.File;

public class Aplicacao {

	public static void main(String[] args) throws Exception {
		
		Organizador o = new Organizador();
		
		Album a = o.carregarFotos(new File("./fotos"));
		
		a.listarFotos();
	}

}

