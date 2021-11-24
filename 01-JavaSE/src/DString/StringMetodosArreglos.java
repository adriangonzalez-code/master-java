package DString;

public class StringMetodosArreglos {

    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;

        for (int i = 0; i < largo; i++) {
            System.out.print(arreglo[i]);
        }

        System.out.println();

        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;

        for (int j = 0; j < l; j++) {
            System.out.println("arreglo2[j] = " + arreglo2[j]);
        }

        String archivo = "alguna.imagen.nuevo.json";
        String[] archivoArr = archivo.split("\\."); // [.]
        l = archivoArr.length;
        System.out.println();

        for (int j = 0; j < l; j++) {
            System.out.println("archivoArr[j] = " + archivoArr[j]);
        }

        System.out.println("archivoArr[archivoArr.length - 1] = " + archivoArr[archivoArr.length - 1]);
    }
}