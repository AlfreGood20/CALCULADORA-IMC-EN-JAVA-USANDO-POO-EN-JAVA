package PRACTICA;
import java.util.*;
public class principal {
	public static void mensajePeso(int imc) {
		if(imc==-1) {
			System.out.println("peso ideal");
		}
		else if(imc==0) {
			System.out.println("debajo de su peso ideal");
		}
		else {
			System.out.println("tiene sobrepeso");
		}
	}
	
	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		int mci=0;
		boolean booleano;
		
		Metodos metodos = new Metodos();
		
		//PRIMER OBJETO
		System.out.println("Nombre: ");
		String nombre=lector.next();
		System.out.println("Edad: ");
		int edad=lector.nextInt();
		System.out.println("Sexo: ");
		String sexo=lector.next();
		System.out.println("Peso: ");
		float peso=lector.nextFloat();
		System.out.println("Altura: ");
		float altura=lector.nextFloat();
		
		Persona persona1=new Persona(nombre,edad,Metodos.generarDNI(),sexo,peso,altura);
		mci=metodos.calcularIMC(peso, altura);
		mensajePeso(mci);		
		booleano=metodos.esMayorDeEdad(edad);
		
		System.out.println("¿Es meyor de edad? "+booleano);
		System.out.println(persona1.toString());
		System.out.println("-------------------------------------------------");
		//SEGUNDO OBJETO
        Persona persona2 = new Persona(nombre, edad, Metodos.generarDNI(), sexo, 0.0f, 0.0f);
        mci = metodos.calcularIMC(persona2.getPeso(), persona2.getAltura());
        mensajePeso(mci);
        booleano = metodos.esMayorDeEdad(edad);
        
        System.out.println("¿Es mayor de edad? " + booleano);
        System.out.println(persona2.toString());
        System.out.println("-------------------------------------------------");
        
        //TERCER OBJETO
        Persona persona3 = new Persona();
        persona3.setNombre("Juan");
        persona3.setEdad(30);
        persona3.setSexo("H");
        persona3.setPeso(70);
        persona3.setAltura(1.75f);
        mci = metodos.calcularIMC(persona3.getPeso(), persona3.getAltura());
        mensajePeso(mci);
        booleano = metodos.esMayorDeEdad(persona3.getEdad());
        
        System.out.println("¿Es mayor de edad? " + booleano);
        System.out.println(persona3.toString());
		lector.close();
	}
}