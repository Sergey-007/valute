import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.text.ParseException;
import java.util.ArrayList;

public class ParserMarshall {
    static ValCurs valCurs;
    static
    {
        try {
            valCurs = new ValCurs();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        valCurs.setValCurs(new ArrayList<Valute>());
        //Create two employees
        Valute val1 = new Valute();
        val1.setID("R265");
        val1.setNumCode("036");
        val1.setAUD("USD");
        val1.setNominal(1);
        val1.setName("Something");
        val1.setValue(12.5);

        Valute val2 = new Valute();
        val2.setID("EU265");
        val2.setNumCode("812");
        val2.setAUD("EUR");
        val2.setNominal(1);
        val2.setName("Something else");
        val2.setValue(22.0);

        //Add the employees in list
        valCurs.getValCurs().add(val1);
        valCurs.getValCurs().add(val2);
    }

    private static void marshalingExample() throws JAXBException
    {
        JAXBContext jaxbContext = JAXBContext.newInstance(ValCurs.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        //Marshal the employees list in console
        jaxbMarshaller.marshal(valCurs, System.out);

    }

    public static void main(String[] args) throws JAXBException {
        marshalingExample();
    }
}
