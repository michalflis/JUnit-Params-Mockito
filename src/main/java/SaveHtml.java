import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SaveHtml {

    private String fileName;
    private String addressUri;

    public SaveHtml(String fileName, String addressUri) {
        this.fileName = fileName;
        this.addressUri = addressUri;
    }

    public void saveHtmlToFile() throws Exception {

        String path = "src/main/resources/" + fileName;

        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpRequest httpRequest =
                HttpRequest.newBuilder(new URI(addressUri))
                        .GET()
                        .build();

        HttpResponse<String> httpResponse = httpClient
                .send(httpRequest, HttpResponse.BodyHandlers.ofString());

        String html = httpResponse.body();

        Files.writeString(Paths.get(path), html);

     }
}
