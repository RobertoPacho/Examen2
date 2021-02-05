/**
 * 
 */
package ec.edu.ups.PachoRobertoSriJEE.ON;

import java.util.Random;

import javax.ejb.Stateless;

/**
 * @author RobertoPacho
 *
 */
@Stateless
public class Aleatorio {

	public boolean aprobar() {
		Random rd = new Random(); 
	      return rd.nextBoolean();
	}
	
	public String claveAleatoria() {
		String clave="Solicitud no aprobada";
		if(aprobar()) {
		// La variable palabra almacena el resultado final
		// La variable caracteres es un número aleatorio entre 2 y 20 que define la
		// longitud de la palabra.
		int caracteres = (int) (Math.random() * 20) + 2;
		// Con un bucle for, que recorreremos las veces que tengamos almacenadas en la
		// variable caracteres, que será como mínimo 2, iremos concatenando los
		// caracteres aleatorios.
		for (int i = 0; i < caracteres; i++) {
			// Para generar caracteres aleatorios hay que recurrir al valor numérico de
			// estos
			// caracteres en el alfabeto Ascii. En este programa vamos a generar palabras
			// con
			// letras minúsculas, que se encuentran en el rango 97-122. El método floor
			// devuelve el máximo entero.
			int codigoAscii = (int) Math.floor(Math.random() * (122 - 97) + 97);
			// para pasar el código a carácter basta con hacer un cast a char
			clave = clave + (char) codigoAscii;
		}
		return clave;
	}
		return clave;
	}
}
