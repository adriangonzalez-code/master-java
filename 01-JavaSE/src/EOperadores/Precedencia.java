package EOperadores;

public class Precedencia {

    public static void main(String[] args) {
        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = (i + j + k) / 3d;
        System.out.println("promedio = " + promedio);

        promedio = i + j + k / 3d * 10; // primero divide, luego multiplica y por último suma
        System.out.println("promedio = " + promedio);

        promedio = ++i + j-- + k / 3d * 10; // Primero incrementa o decrementa, después divide y por último suma
        System.out.println("promedio = " + promedio);
    }
}