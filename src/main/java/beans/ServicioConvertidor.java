package beans;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;
import convertidor.Convertir;

@LocalBean
@Stateless
@WebService(endpointInterface = "beans.ServicioConvertidorInterfaz")
public class ServicioConvertidor implements ServicioConvertidorInterfaz {

    @EJB

    @Override
    public String convertir(String XML_STRING) {

        String res;
        Convertir c = new Convertir();
        res = c.xmlJson(XML_STRING);

        return res;
        // return "Mensaje Enviado";
    }
}
