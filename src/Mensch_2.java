import com.sun.xml.internal.ws.wsdl.writer.document.Part;

public class Mensch_2{
    private Partner partner;

    public Mensch_2(Partner partner){
        this.partner = null;
    }

    public void neuerPartner(Partner einPa){
        if (this.partner == null){
            this.partner = einPa;
        }
    }
}
