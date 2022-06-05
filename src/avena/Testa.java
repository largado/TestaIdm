package avena;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;



public class Testa {
    public static void main(String[] args) throws IOException, InterruptedException {
        while (true){
            Thread.sleep(10000);
            HttpClient cliente = HttpClient.newBuilder().build();
            HttpRequest requisicao = HttpRequest.newBuilder().GET()
                    .uri((URI.create("https://avena.azurewebsites.net"))).build();
            HttpResponse<String> resposta = cliente.send(requisicao, BodyHandlers.ofString());
            System.out.println(resposta.statusCode());
            System.out.println(resposta.body());

        }

    }

}
