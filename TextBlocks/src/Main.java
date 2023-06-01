
public class Main {

	public static void main(String[] args) {

//		String html =
//				"<html>\n" +
//				"\t<body>\n" +
//				"\t\t<h1>Texto qualquer<h1>\n" +
//				"\t</body>\n" +
//				"</html>\n";
//		System.out.println(html);

//		String html =
//				"<html>\n" +
//				"    <body>\n" +
//				"        <h1>Texto qualquer<h1>\n" +
//				"    </body>\n" +
//				"</html>\n";
//		System.out.println(html);

//		String html = """				
//				      <html>
//				          <body>
//				              <h1>Texto qualquer<h1>
//				          </body>
//				      </html>
//				      """;
//		
//		System.out.println(html);

		String texto = "Texto qualquer";

		String html = """
				<html>
				    <body>
				        <h1>
				        """ + texto + """
				        </h1>
				    </body>
				</html>
				""";

		System.out.println(html);
	}
}