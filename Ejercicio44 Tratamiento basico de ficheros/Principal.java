import java.io.FileWriter;// importando la clase FileWriter
import java.io.File;
import java.io.IOException; // Importando la clase IOException para manejar errores y excepciones
public class Principal {
	public static void main(String[] args) {
		try {
		 File myObj = new File("fichero.txt");
		 if(myObj.createNewFile()) {
		 	System.out.println("El archivo ha sido creado con exito: " + myObj.getName());
		 } else {
		   	System.out.println("El archivo ya existe");
		 
		 }
		
		
		
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error");
			e.printStackTrace();
		
		
		}

		try {
			FileWriter myWriter = new FileWriter("fichero.txt");
			myWriter.write("Esto es una prueba");
			myWriter.close();
			System.out.println("Se ha escrito correctamente al fichero");
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error");
			e.printStackTrace();
		
		
		
		}

		


			
	
	}




}

