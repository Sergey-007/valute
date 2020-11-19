import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "valCurs")
@XmlAccessorType(XmlAccessType.FIELD)
public class ValCurs{

    @XmlElement(name = "valute")
    private List<Valute> valCurs = null;

    public List<Valute> getValCurs() {
        return valCurs;
    }

    public void setValCurs(List<Valute> valCurs) {
        this.valCurs = valCurs;
    }
}