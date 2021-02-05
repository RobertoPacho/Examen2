/**
 * 
 */
package ec.edu.ups.PachoRobertoCajeroJEE.ON;

import java.util.List;


import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.PachoRobertoCajeroJEE.Dao.TransaccionesDAO;
import ec.edu.ups.PachoRobertoCajeroJEE.modelo.Transacciones;

/**
 * @author RobertoPacho
 *
 */
@Stateless
public class TransaccionesON {
	
	@Inject
	TransaccionesDAO transaccionesDAO;
	
	
	public boolean agregar(Transacciones transaciones) throws Exception {
		transaccionesDAO.insert(transaciones);
		return true;
	}
	
	public void actualizar(Transacciones transaciones) throws Exception {
		transaccionesDAO.update(transaciones);
	}
	
	public Transacciones buscarID(int id) throws Exception {
		return transaccionesDAO.read(id);
	}
	
	public Transacciones fastTransaccion(int cuenta_id) throws Exception {
		return transaccionesDAO.ultimaTransaccion(cuenta_id);
	}
	
	public List<Transacciones> listaTransacciones() throws Exception {
		return transaccionesDAO.findAll();
	}
	
	public Double depositos(int cuentaid) {
		return transaccionesDAO.sumaDepositos(cuentaid);
	}
	
	public Double retiros(int cuentaid) {
		return transaccionesDAO.sumaRetiros(cuentaid);
	}
	
	public Double saldo(int cuentaid) {
		double saldo=depositos(cuentaid)-retiros(cuentaid);
		return saldo;
	}
	
}
