package beans;

import javax.ejb.Local;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
@Local
public interface ServicioConvertidorInterfaz {

    @WebMethod
    public String convertir(String a);
}
