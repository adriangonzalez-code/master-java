package DString;

public class StringMetodos {

    public static void main(String[] args) {

        String nombre = "Adrián";

        /*Conocer el número de caracteres*/
        System.out.println("nombre.length() = " + nombre.length());

        /*Convertir a Mayúsculas*/
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());

        /*Convertir a Minúsculas*/
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

        /*Para comparar el valor de un String*/
        System.out.println("nombre.equals(\"Adrián\") = " + nombre.equals("Adrián")); // True
        System.out.println("nombre.equals(\"Adrián\") = " + nombre.equals("adrián")); // False
        System.out.println("nombre.equalsIgnoreCase(\"adrián\") = " + nombre.equalsIgnoreCase("adrián")); // True
        System.out.println("nombre.compareTo(\"Adrián\") = " + nombre.compareTo("Adrián"));
        System.out.println("nombre.compareTo(\"adrian\") = " + nombre.compareTo("adrian"));

        /*Retorna el caracter*/
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length() - 1) = " + nombre.charAt(nombre.length() - 1));

        /*Retornar una parte del String*/
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(4) = " + nombre.substring(4));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(4, 6) = " + nombre.substring(4, 6));
        System.out.println("nombre.substring(5) = " + nombre.substring(5));
        System.out.println("nombre.substring(nombre.length() - 1) = " + nombre.substring(nombre.length() - 1));
        System.out.println("nombre.substring(nombre.length() - 2) = " + nombre.substring(nombre.length() - 2));

        String trabalenguas = "trabalenguas";

        /*Reemplaza un caracter por otro*/
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));

        /*Retorna la primera posición de un caracter o cadena*/
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z'));
        System.out.println("trabalenguas.indexOf('lenguas') = " + trabalenguas.indexOf("lenguas"));

        /*Retorna la última posición de un caracter o una cadena*/
        System.out.println("trabalenguas.lastIndexOf('A') = " + trabalenguas.lastIndexOf('a'));

        /*Retorna true si la secuencia se contiene en una cadena*/
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));

        /*Validar si una cadena empieza con...*/
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"trabas\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.startsWith(\"t\") = " + trabalenguas.startsWith("t"));

        /*Validar si una cadena finaliza con...*/
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));

        /*Eliminar espacios en blanco en ambos extremos de la cadena*/
        System.out.println("   trabalenguas     ");
        System.out.println("   trabalenguas     ".trim());
    }
}