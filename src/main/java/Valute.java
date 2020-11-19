import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "valute")
@XmlAccessorType(XmlAccessType.FIELD)
public class Valute{

    @XmlElement(name = "valCurs")
    private List<ValCurs> valute = null;

    public List<ValCurs> getEmployees() {
        return valute;
    }

    public void setEmployees(List<ValCurs> employees) {
        this.valute = valute;
    }
}