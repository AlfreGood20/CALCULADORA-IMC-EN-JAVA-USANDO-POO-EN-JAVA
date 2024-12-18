package PRACTICA;
import java.util.*;

public class Metodos {
	
	
	public int calcularIMC(float peso,float altura) {
		double calculo=peso/(altura*altura);
		return (calculo<20)?-1:(calculo>=20 && calculo<25)?0:1;
	}
	
	public boolean esMayorDeEdad(int edad) {
		return edad>=18;
	}
	
	public String comprobarSexo(String sexo) {
		return (sexo!=null && (sexo.equals("H") || sexo.equals("M")))?sexo:"";
	}
	
	public static String generarDNI() {
		Random generadorAleatorios = new Random();
		String dni="";
		for(int i=0;i<8;i++) {
			int numero_aleatorio = 0+generadorAleatorios.nextInt(9);
			dni+=numero_aleatorio;
		}
		return dni;
	}
}