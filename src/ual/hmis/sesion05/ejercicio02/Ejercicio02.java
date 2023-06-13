package ual.hmis.sesion05.ejercicio02;

public class Ejercicio02 {

	public boolean login(final String username, final String password) {
		// comprobar que sean distintos de vacio
		if (username == null || password == null) {
			return false;
		}
		// comprobar que la longitud sea < 30
		if (username.length() >= 30 || password.length() >= 30) {
			return false;
		}
		// FALTA UNA LETRA MAYUSCULA, MINUSCULA Y DIGITO
		// llamar al metodo de la bbdd
		return compruebaLoginEnBD(username, password);
	}

	public boolean compruebaLoginEnBD(final String username,
			final String password) {
		// m�todo mock (simulado)
		if (!username.equals("user") || !password.equals("pass")) {
			return false;
		}
		return true;
	}
}
