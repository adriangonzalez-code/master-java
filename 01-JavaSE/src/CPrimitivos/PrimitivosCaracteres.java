package CPrimitivos;

public class PrimitivosCaracteres {

    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;

        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r'; //Windows

        System.out.println("Char corresponde en byte:" + espacio + Character.BYTES);
        System.out.println("Char corresponde en bites = " + retroceso + retroceso + Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + tabulador + Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + retornoCarro + nuevaLinea + Character.MAX_VALUE);
        System.out.println("System.getProperty(\"line.separator\") = " + System.getProperty("line.separator") + "Some word");
    }
}