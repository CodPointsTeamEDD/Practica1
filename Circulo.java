/**
 * Clase {@Circulo}
 * Implementa a la interfaz {@link Figura}
 * 
 * @author Luis Fernando Quintana López
 * @author Erick Xavier Martinez Briones
 * @version 1.0.0
 * @since 2026
 * 
 */
public class Circulo implements Figura {

    /** Longitud del diametro del circulo */
    public double diametro;

    /** Valor de PI */
    public double PI = 3.1416;

    /**
     * Constructor de la clase circulo
     * 
     * @param diametro longitud del diametro del circulo
     */
    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    /**
     * Metodo para calcular el area de un circulo
     * Implementa el metodo calcularArea() de {@link Figura}
     *
     * @return double del area del circulo
     */
    @Override
    public double calcularArea() {
        return PI * (Math.pow((diametro / 2), 2));
    }

    /**
     * Metodo para calcular el perimetro de un circulo
     * Implementa el metodo calcularPerimetro() de {@link Figura}
     * 
     * @return double del perimetro del circulo
     */
    @Override
    public double calcularPerimetro() {
        return PI * diametro;
    }

    /**
     * Metodo para mostrar en pantalla la informacion del circulo
     * 
     * @return cadena con informacion del circulo (Tipo, area, perimetro)
     */
    @Override
    public String toString() {
        return "El tipo de figura es: Círculo" +
                "\n Su área es: " + this.calcularArea() +
                "\n Y su perímetro es: " + this.calcularPerimetro();
    }
}