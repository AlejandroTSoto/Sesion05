package ual.hmis.sesion05.ejercicio02;

public class Ejercicio02 {
	public boolean login (String username, String password){
		int auxMayus=0;
		int auxNum=0;
		// comprobar que sean distintos de vacio
		if(username==null || password==null) 
			return false;
		// comprobar que la longitud sea < 30
		if(username.length() >= 30||password.length() >= 30) 
			return false;
		for (int j =0; j < password.length();j++) {
			if (password.charAt(j)==Character.toUpperCase(password.charAt(j)) ) {
				auxMayus++;
			}
			if (Character.isDigit(password.charAt(j)) ) {
				auxNum++;
			}
		}
		if(auxMayus<1||auxNum<1) return false;
		// llamar al método de la bbdd
			return compruebaLoginEnBD(username, password);
	}	
	public boolean compruebaLoginEnBD(String username, String password){
	// método mock (simulado)
		if (username.equals("user") && password.equals("passWord2")) {
		return true;
		} else
		return false;
	}
}
