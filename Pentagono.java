/**
 * Clase {@code Pentagono}
 * Extiende de la clase {@link PoligonoRegular}
 * 
 * @author Luis Fernando Quintana López
 * @author Erick Xavier Martinez Briones
 * @version 1.0.0
 * @since 2026
 * 
 */

public class Pentagono extends PoligonoRegular {

    /** Numero de lados de la figura */
    private static final int LADOS = 5;
    /** Cadena con el tipo de figura */
    private static final String TIPOFIGURA = "Pentagono";
    /** Valor de PI */
    public double PI = 3.1416;

    /**
     * Constructor de la clase {@code Pentagono}
     * 
     * @param longitudLado longitud de un lado del pentagono
     */
    public Pentagono(double longitudLado) {
        super(LADOS, longitudLado, TIPOFIGURA);
    }

    /**
     * Metodo para calcular el area del Pentagono
     * Implementa el metodo calcularArea() de la interfaz {@link Figura}
     * 
     * @return area del Pentagono
     */
    @Override
    public double calcularArea() {
        return ((calcularPerimetro() * calcularApotema()) / 2);
    }

    /**
     * Metodo para calcular el apotema del pentagono
     * 
     * @return apotema del pentagono
     */
    public double calcularApotema() {
        return longitudLado / (2 * Math.tan(PI / LADOS));
    }

}