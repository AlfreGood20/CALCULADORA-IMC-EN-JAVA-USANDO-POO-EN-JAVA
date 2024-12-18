package PRACTICA;

public class Persona {
	private static final String sexoPorDefecto="H";
	
	private String nombre;
	private int edad;
	private String dni;
	private String sexo;
	private float peso;
	private float altura;
	
	public Persona() {
	}

	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = (sexo!=null && (sexo.equals("H") || sexo.equals("M")))?sexo:sexoPorDefecto;
	}


	public Persona(String dni) {
		this.nombre = "";
		this.edad = 0;
		this.dni = dni;
		this.sexo = sexoPorDefecto;
		this.peso = 0.0f;
		this.altura = 0.0f;
	}


	public Persona(String nombre, int edad, String dni, String sexo, float peso, float altura) {
		this.nombre = (nombre!=null)?nombre:sexoPorDefecto;
		this.edad = edad;
		this.dni = dni;
		this.sexo = (sexo!=null && (sexo.equals("H") || sexo.equals("M")))?sexo:sexoPorDefecto;
		this.peso = peso;
		this.altura = altura;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getDni() {
		return dni;
	}

	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
}