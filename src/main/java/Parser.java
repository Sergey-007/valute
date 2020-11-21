import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;

public class Parser {
    OkHttpClient client = new OkHttpClient();

    ValCurs run(String url) throws IOException, JAXBException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        JAXBContext jaxbContext = JAXBContext.newInstance(ValCurs.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        try (Response response = client.newCall(request).execute()) {
            ValCurs valCurs = (ValCurs) unmarshaller.unmarshal(response.body().charStream());
            return valCurs;
        }
    }
    public static void main(String[] args) throws IOException, JAXBException {
        Parser example = new Parser();
        ValCurs response = example.run("http://www.cbr.ru/scripts/xml_daily.asp");

        Valute resp = response.getValCurs().get(8);
        System.out.println(resp.getName());
        System.out.println(resp.getValue());
    }
}