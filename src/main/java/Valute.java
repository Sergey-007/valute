
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "valute")
@XmlAccessorType(XmlAccessType.FIELD)
public class Valute {

    private String NumCode;
    private String AUD;
    private Integer Nominal;
    private String Name;
    private double Value;
}
