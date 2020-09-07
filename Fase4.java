import java.util.ArrayList;

public class Fase4 {

	public static void main(String[] args) {
		
	ArrayList<String> nombre = new ArrayList<>();
	ArrayList<String> apellido = new ArrayList<>();
	ArrayList<String> Fullname = new ArrayList<>();
	
	
	nombre.add("L");
	nombre.add("L");
	nombre.add("U");
	nombre.add("I");
	nombre.add("S");
	apellido.add("S");
	apellido.add("I");
	apellido.add("T");
	apellido.add("J");
	apellido.add("E");
	apellido.add("S");
	
	nombre.toString();
	apellido.toString();
	
	Fullname.addAll(nombre);
	Fullname.add(" ");
	Fullname.addAll(apellido);
	
	System.out.println(Fullname);
	
	}
}
