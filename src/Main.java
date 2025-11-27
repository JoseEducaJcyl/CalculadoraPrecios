// Clase Main con el metodo main para ejecutar el codigo
public class Main {
    public static void main(String[] args) {
        // Declaranos cuatro variables cliente, cliente2, cliente3 y libro
        String cliente = "estudiante";
        String cliente2 = "adulto_mayor";
        String cliente3 = "vip";
        double libro = 20.0;
        // Creamos un objeto calculadora
        CalculadoraPrecios calculadora = new CalculadoraPrecios();
        // Mostramos la informacion de que sale con las diferentes variables
        System.out.println(calculadora.calcularPrecio(libro, cliente));
        System.out.println(calculadora.calcularPrecio(libro, cliente2));
        System.out.println(calculadora.calcularPrecio(libro, cliente3));
    }
}
