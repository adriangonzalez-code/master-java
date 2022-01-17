package EOperadores;

public class InstanceOf {

    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase String... que tal!";
        Integer num = 7;
        Boolean b1 = texto instanceof String;

        System.out.println("Texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Texto es del tipo String = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b1);

        Double decimal = 45.54;

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + decimal);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);

        Object text = "Creando un objeto de la Clase String... que tal!";
        b1 = text instanceof String;

        System.out.println("Text es del tipo String = " + b1);

        b1 = text instanceof Integer;
        System.out.println("text es del tipo Integer = " + b1);

        Number num1 = 7;
        b1 = num1 instanceof Integer;
        System.out.println("num1 es de tipo Integer = " + b1);

        b1 = num1 instanceof Long;
        System.out.println("num1 es de tipo Long = " + b1);

        b1 = num1 instanceof Double;
        System.out.println("num1 es de tipo Double = " + b1);

        Number decimal1 = 45.54;
        b1 = decimal1 instanceof Double;
        System.out.println("decimal es de tipo Double = " + b1);

        b1 = decimal1 instanceof Float;
        System.out.println("decimal es de tipo Float = " + b1);

        b1 = decimal1 instanceof Number;
        System.out.println("decimal es de tipo Number = " + b1);
    }
}