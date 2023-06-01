import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Organizador {
	
	public Album carregarFotos(File diretorio) throws Exception {
		
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		
		File[] arquivos = diretorio.listFiles();
		
		Album album = new Album();
		
		for (File arquivo : arquivos) {
			String nomeArquivo = arquivo.getName();
			nomeArquivo = nomeArquivo.substring(0, nomeArquivo.length() -4);
			
			Scanner scanner = new Scanner(nomeArquivo);
			scanner.useDelimiter("[-_]");
			
			String token = null;
			token = scanner.next();
			
			int id = Integer.parseInt(token.substring(3));
			
			token = scanner.next();
			
			Date data = df.parse(token);
			
			String local = null;
			if (scanner.hasNext()) {
				local = scanner.next();
			}
			
			scanner.close();
			album.adicionar(id, data, local);
		}
		return album;
	}
}
