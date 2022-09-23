package dad.GsonSample;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
	
	public static void main(String[] args) {
		Persona p = new Persona();
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Dame tu nombre: ");
		p.setNombre(scan.nextLine());
		System.out.println("Dame tus Apellidos: ");
		p.setApellido(scan.nextLine());
		System.out.println("Dame tu Edad: ");
		p.setEdad(scan.nextInt());
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		
		System.out.println(json);
		
		
	}

}
