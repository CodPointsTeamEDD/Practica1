/**
 * Clase {@code MainFiguras}
 * 
 * @author Luis Fernando Quintana López
 * @author Erick Xavier Martinez Briones
 * @version 1.0.0
 * @since 2026
 * 
 */

public class MainFiguras{
	
	public static void main(String args[]){

		//Creando las Figuras

		Figura triangulo = new TrianguloEquilatero(10.0);
		Figura cuadrado = new Cuadrado(10.0);
		Figura pentagono = new Pentagono(10.0);
		Figura circulo = new Circulo(10.0);

		System.out.println(triangulo);
		System.out.println("_____________________________________________________________\n");

		System.out.println(cuadrado);
		System.out.println("_____________________________________________________________\n");


		System.out.println(pentagono);
		System.out.println("_____________________________________________________________\n");


		System.out.println(circulo);
	}
	
}