import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class BuscadorDeCep {

    public Endereco buscarCep(String cep){
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpRequest request = HttpRequest.newBuilder().
                uri(endereco).
                build();
        try {
            HttpResponse<String> response = HttpClient.
                    newHttpClient().
                    send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
            
        } catch (Exception e){
            throw new RuntimeException("Não Consegui obter o endereço com este CEP.");
        }
    }
}
