package resources;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import com.google.gson.Gson;

public class CurrencyConverter {

    private static final String API_KEY = "74b5950c8e9af3f6a02b3956";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public double convertUSDToBRL(double value , String coin, String coinConvert) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + API_KEY + "/latest/"+ coin))
                .build();

        CompletableFuture<HttpResponse<String>> futureResponse = client.sendAsync(request, BodyHandlers.ofString());

        try {
            // Obter a resposta da requisição
            HttpResponse<String> response = futureResponse.get();
            // Salvar a resposta em uma variável
            String responseBody = response.body();
            // Exibir a resposta
            Gson gson = new Gson();
            CurrencyRates rates = gson.fromJson(responseBody, CurrencyRates.class);

            // Obter as taxas de conversão
            Map<String, Double> conversionRates = rates.getConversionRates();
            double exchange = conversionRates.get(coinConvert);
            return exchange * value;
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
