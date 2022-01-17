package EOperadores;

import java.util.Scanner;

public class Ternario {

    public static void main(String[] args) {
        // variable = condicion ? si es verdadero : si es falso;

        String variable = 7 == 7 ? "Si es verdadero" : "Si es falso";
        System.out.println("variable = " + variable);

        Scanner s = new Scanner(System.in);
        String estado = "";
        double promedio = 0.0;
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        System.out.println("Ingresa la nota de matemáticas entre 2.0 y 7.0:");
        matematicas = s.nextDouble();

        System.out.println("Ingresa la nota de ciencias entre 2.0 y 7.0:");
        ciencias = s.nextDouble();

        System.out.println("Ingresa la nota de historia entre 2.0 y 7.0:");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);

        // Ejercicio para obtener el número mayor usando el operador ternario.
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese un segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese un tercer número:");
        int num3 = scanner.nextInt();

        System.out.println("Ingrese un cuarto número:");
        int num4 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("El número mayor es: " + max);
    }
}