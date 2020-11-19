import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlType(name = "Valute")
@XmlRootElement
public class Valute implements Serializable {

    private long NumCode;
    private String CharCode;
    private long Nominal;
    private String Name;
    private double Value;

    public double getValue() {
        return Value;
    }

    @XmlElement(name = "Value")
    public void setValue(double value) {
        Value = value;
    }
}