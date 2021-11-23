package DString;

public class StringTestRendimientoConcat {

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "a";
        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            // c = c.concat(a).concat(b).concat("\n");  // Demora mínimo 3409 milisegundos
            // c += a+b+"\n";                           // Demora mínimo 1297 milisegundos
            // sb.append(a).append(b).append("\n");     // Demora mínimo 7 milisegundos

        }

        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}