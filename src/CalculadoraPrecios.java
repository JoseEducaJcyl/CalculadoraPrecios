// Clase CalculadoraPrecios que extiendes la clase ConstantesDescuento
// con un metodo calcularPrecio, que recibe dos variables
public class CalculadoraPrecios extends ConstantesDescuento {
    public double calcularPrecio(double base, String cliente) {
        double descuento =  0;
        switch (cliente) {
            case "estudiante":
                descuento = (base * ESTUDIANTE) + IVA;
                break;
            case "adulto_mayor":
                descuento = (base * ADULTO_MAYOR) + IVA;
                break;
            case "vip":
                descuento = (base * VIP) + IVA;
                break;
            default:
                System.out.println("Error: cliente invalido");
                break;
        }
        return descuento;
    }
}
