package tema2_prueba;

import java.util.Scanner;

public class PiramideSumas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp;

        do {
            int num = leerEntero(sc, "Introduzca un número: "); //FMTS20251031 - Faltaba el ';'

            while (num < 0 || num > 20) { //FMTS20251031 - El operador lógido debía ser un OR en lugar de un AND.
                num = leerEntero(sc, "**Valor fuera de rango** Introduzca un número entre 0 y 20: ");
            }

            System.out.println("\nSu pirámide de sumas es la siguiente:\n" + piramide(num));

            System.out.print("¿Quiere hacer otra pirámide? (s/n) ");
            resp = sc.next().trim().toUpperCase(); //FMTS20251031 - Sobraba la declaración de la variable porque ya está declarada al principio del código.

        } while (resp.equals("S"));  //FMTS20251031 - Faltaba cerrar la instrucción con ');'
        borrarConsola();
        System.out.println("¡¡¡PROGRAMA FINALIZADO!!!");
        
        sc.close();

    }

    private static int leerEntero(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextInt()) {
            System.out.print("**Valor no válido** Introduzca un número entero: ");
            sc.next();
        }
        return sc.nextInt();
    }

    public static void borrarConsola() {
        for (int i = 0; i < 50; i++) { //FMTS20251031 - Había una ',' donde debía haber un ';'
            System.out.println();
        }
    }

    public static String piramide(int num) {
        String res = "";
        int n = num;

        while (n > 0) {
            int cont = 1;
            int total = 0;
            res += n + " => 0 ";

            while (cont <= n) {
                res += "+ " + cont + " ";
                total += cont;
                cont += 1;
                }
            if (n != 0) {
                res += "= " + total;
            }

            res += "\n";
            n -= 1;
        }

        return res; //FMTS20251031 - El nombre de la variable es 'res'.
    }

}