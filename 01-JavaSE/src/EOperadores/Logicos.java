package EOperadores;

import java.util.Scanner;

public class Logicos {

    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b1 = i == j && k < l && m == false;
        System.out.println("b1 = " + b1);

        boolean b2 = i == j || k < l;
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && k > j || m == false;
        System.out.println("b3 = " + b3);

        boolean b4 = i == j || k < l && m == true;
        System.out.println("b4 = " + b4);

        boolean b5 = true || true && false;
        System.out.println("b5 = " + b5);

        boolean b6 = true || false && false || false;
        System.out.println("b6 = " + b6);

        boolean b7 = ((true || false) && false) || false;
        System.out.println("b7 = " + b7);

        // Ejemplo Login
        String[] usernames = {"adrian", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username:");
        String u = scanner.next();

        System.out.println("Ingrese el password:");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int n = 0; n < usernames.length; n++) {
            esAutenticado = usernames[n].equals(u) && passwords[n].equals(p) || esAutenticado;
            /*if (usernames[n].equals(u) && passwords[n].equals(p)) {
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? "Bienvenido usuario: ".concat(u).concat("!") : "Username o contraseña incorrecto! \nLo sentimos, requiere autenticación";
        System.out.println(mensaje);

        /*if (esAutenticado) {
            System.out.println("Bienvenido usuario: ".concat(u).concat("!"));
        } else {
            System.out.println("Username o contraseña incorrecto!");
            System.out.println("Lo siento, requiere autenticación");
        }*/
    }
}