
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "valute")
@XmlAccessorType(XmlAccessType.FIELD)
public class Valute {

    private String NumCode;
    private String AUD;
    private Integer Nominal;
    private String Name;
    private double Value;
    @XmlAttribute
    private String ID;

    public String getNumCode() {
        return NumCode;
    }
    public void setNumCode(String numCode) {
        NumCode = numCode;
    }
    public String getAUD() {
        return AUD;
    }
    public void setAUD(String AUD) {
        this.AUD = AUD;
    }
    public Integer getNominal() {
        return Nominal;
    }
    public void setNominal(Integer nominal) {
        Nominal = nominal;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public double getValue() {
        return Value;
    }
    public void setValue(double value) {
        Value = value;
    }

    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
}
