import java.util.ArrayList;

public class Fase2 {

	public static void main(String[] args) {
		
		ArrayList<String> caracters = new ArrayList<>();
		caracters.add("L");
		caracters.add("L");
		caracters.add("U");
		caracters.add("I");
		caracters.add("S");
		
		for (int i=0; i<caracters.size(); i++) {
			String lletres = (caracters.get(i));
			if (lletres == ("1")) {
				if (lletres == ("2")) { 
					if (lletres == ("3")) {
						if (lletres == ("4")) {
							if (lletres == ("5")) {
								if (lletres == ("6")) {
									if (lletres == ("7")) {
										if (lletres == ("8")) {
											if (lletres == ("9")) {
												if (lletres == ("0")) {
													
												}
											}
										}
										
									}
								}
							}
						}
					}
				}
				System.out.println("Els noms de persones no contenen números.");
			} else {
		switch (lletres) {
			case "A":
				System.out.println("La lletra " + lletres + " es una vocal.");
			break;
			case "E":
				System.out.println("La lletra " + lletres + " es una vocal.");
			break;
			case "I":
				System.out.println("La lletra " + lletres + " es una vocal.");
			break;
			case "O":
				System.out.println("La lletra " + lletres + " es una vocal.");
			break;
			case "U":
				System.out.println("La lletra " + lletres + " es una vocal.");
			break;
			default:
				System.out.println("La lletra " + lletres + " es una consonant.");
		}
		}
	}
	}	
}
