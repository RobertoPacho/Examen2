package ec.edu.ups.PachoRobertoSriJEE.services;



import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;
import ec.edu.ups.PachoRobertoSriJEE.ON.Aleatorio;

@WebService
public class ClienteServiceSOAP {
	
	@Inject
	private Aleatorio aleatorio;
	
	@WebMethod
	public String saludar() {
		return aleatorio.claveAleatoria();
	}
	
	
}

