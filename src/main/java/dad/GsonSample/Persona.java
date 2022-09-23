package dad.GsonSample;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	public Persona(String nombre,String apellido,int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public void setEdad(int edad) {this.edad = edad;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setApellido(String apellido) {this.apellido = apellido;}

}
