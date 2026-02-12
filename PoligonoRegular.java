/**
 * Clase abstracta {@code PoligonoRegular}
 * Implementa la interfaz {@link Figura}
 * 
 * @author Luis Fernando Quintana López
 * @author Erick Xavier Martinez Briones
 * @version 1.0.0
 * @since 2026
 * 
 */

public abstract class PoligonoRegular implements Figura {
    /** Numero de lados del poligono */
    protected int numeroLados;

    /** Longitud de uno de los lados de la figura */
    protected double longitudLado;

    /** Tipo de poligono regular */
    protected String tipoFigura;

    /**
     * Constructor de la clase {@code PoligonoRegular}
     * 
     * @param numeroLados  numero de lados del poligono
     * @param longitudLado longitud de uno de los lados de la figura
     * @param tipoFigura   tipo de poligono regular
     */
    public PoligonoRegular(int numeroLados, double longitudLado, String tipoFigura) {
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
        this.tipoFigura = tipoFigura;
    }

    /**
     * Metodo que calcula el perimetro del poligono regular
     * 
     * @return perimetro del poligono
     */
    @Override
    public double calcularPerimetro() {
        return numeroLados * longitudLado;
    }

    /**
     * Metodo abstracto que calcula el area del poligono
     */
    @Override
    public abstract double calcularArea();

    /**
     * Metodo toString que devuelve una representacion en cadena de la informacion
     * del poligonoRegular
     * 
     * @return cadena con el tipo de figura, area y perimetro
     */
    @Override
    public String toString() {
        return "El tipo de figura es: " + this.tipoFigura +
                "\n Su área es: " + this.calcularArea() +
                "\n Y su perímetro es: " + this.calcularPerimetro();
    }
}