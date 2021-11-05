package DString;

public class EjemploString {

    public static void main(String[] args) {

        String curso = "Programación Java";
        String curso2 = new String("p" +
                "rogramación java");

        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("esIgual = " + esIgual);
    }
}