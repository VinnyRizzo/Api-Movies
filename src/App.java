import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;


public class App {

	public static void main(String[] args) throws Exception {
		
		// Fazer uma conexao http e buscar os top 250 filmes
		String url = "https://api.themoviedb.org/3/movie/popular?api_key=93348e71624acc570a8c3346b0ac7ccf&language=pt-BR";
		URI endereco = URI.create(url);
		var client = HttpClient.newHttpClient();
		var request = HttpRequest.newBuilder(endereco).GET().build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		String body = response.body();
		System.out.println(body);

		// extrair so os dados que interessam {titulo, poster, classificacao 

		// exibir e manipular os dados
	}

}
