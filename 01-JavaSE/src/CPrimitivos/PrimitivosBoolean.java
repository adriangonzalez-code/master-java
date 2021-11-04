package CPrimitivos;

public class PrimitivosBoolean {

    public static void main(String[] args) {

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double d = 98765.43e-3; // 98.76543
        System.out.println("d = " + d);

        float f = 1.23452e2f; // 123.4522
        System.out.println("f = " + f);

        datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3 - 2 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}