import javax.xml.bind.annotation.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@XmlRootElement(name = "valCurs")
@XmlAccessorType(XmlAccessType.FIELD)

public class ValCurs{

    @XmlElement(name = "valute")
    private List<Valute> valCurs = null;

    //Date Date1 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse("01-02-2018");
    @XmlAttribute
    String Date = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
    @XmlAttribute
    String name = "Foreign Currency Market";

    public ValCurs() throws ParseException {
    }

    public List<Valute> getValCurs() {
        return valCurs;
    }

    public void setValCurs(List<Valute> valCurs) {
        this.valCurs = valCurs;
    }
}