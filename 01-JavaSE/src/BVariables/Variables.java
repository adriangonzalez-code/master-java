package BVariables;

public class Variables {

    public static void main(String[] args) {

        String saludar = "Hola mundo desde Java";

        System.out.println(saludar);
        System.out.println("saludar = " + saludar.toUpperCase());

        int numero = 10;
        System.out.println("numero = " + numero);

        boolean valor = true;
        int numero2 = 10;

        if (valor) {
            System.out.println("numero = " + numero);
            numero2 = 10;
        }

        System.out.println("numero2 = " + numero2);

        String nombre;

        nombre = "Adrián";

        if (numero > 10) {
            nombre = "Juan";
        }

        System.out.println("nombre = " + nombre);
    }
}