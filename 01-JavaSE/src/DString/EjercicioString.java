package DString;

public class EjercicioString {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            String nombre = args[i].trim().substring(1, 2).toUpperCase().concat(".").concat(args[i].substring(args[i].length() - 2));

            if (i < (args.length - 1)) {
                nombre = nombre.concat("_");
            }

            System.out.print(nombre);
        }
    }
}