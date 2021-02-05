package ec.edu.ups.PachoRobertoSriJEE.services;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import ec.edu.ups.PachoRobertoSriJEE.ON.Aleatorio;


@Path("SRI")
public class ClienteServiceREST {
	
	@Inject
	private Aleatorio aleatorio;
	
	@POST
	public String guardar() throws Exception {
		
		return aleatorio.claveAleatoria();
	}
	
}

