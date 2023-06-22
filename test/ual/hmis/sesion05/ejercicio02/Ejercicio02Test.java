package ual.hmis.sesion05.ejercicio02;

import ual.hmis.sesion05.ejercicio02.Ejercicio02;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class Ejercicio02Test extends Ejercicio02{
	
	@ParameterizedTest//(name = "{0} => Con pass ({1}) devuelve ({2})")
	@CsvSource({"null, null,false",", ,false",",1,false","null,,false","user, null,false","null, pass,false",
		"user,passsssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss,false",
		"usereeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee,pass,false",
		"usereeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee,passsssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss,false",
		"usaer,pass,false","usaer,pasws,false","user,passWord3,false","user,pawss,false","user,PASWS,false","user1,passWord3,false","user,passWord2,true"})
	public void testlogin(String st1,String st2,Boolean result) {
	Ejercicio02 ej =new Ejercicio02();
	assertEquals(result,ej.login(st1,st2));
	}
}
