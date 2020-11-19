
import java.io.File;
import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class Parser {
    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) throws IOException, JAXBException {
        Parser example = new Parser();
        String response = example.run("http://www.cbr.ru/scripts/xml_daily.asp");
        //System.out.println(response);

        File file = new File(response);
        JAXBContext jaxbContext = JAXBContext.newInstance(Valute.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Valute valCurs = (Valute) unmarshaller.unmarshal(file);
        System.out.println(valCurs);

    }

}