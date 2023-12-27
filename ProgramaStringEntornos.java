import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* Crea un programa que pida 10 palabras por consola y las guarde en un array de String.
 *  Una vez hecho esto saldrá un menú que me dará las siguientes opciones:
 * - Ver todas las palabras: mostrarla todas las palabras del array
 * - Obtener una palabra al azar: mostrará una palabra de las que existen en el array
 * - Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras
 * - Ver media de letras: mostrará el número medio de letras entre todas las palabas
 * - Ver palabra con más letras
 * - Ver palabra con menos letras
 */
public class ProgramaStringEntornos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca palabra");
            array[i] = scanner.next();
        }
        System.out.println("Elija una de las siguientes opciones: \n 1) Ver todas las palabras: \n 2) Obtener una palabra al azar: \n 3) Ver número de letras:  \n 4) Ver media de letras: "
                + "\n 5) Ver palabra con más letras: \n 6) Ver palabra con menos letras");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:

                todasPalabras(array);
                break;

            case 2:
                System.out.println(palabraAzar(array));

                break;
            case 3:
                System.out.println(totalLetras(array));
                break;

            case 4:
                System.out.println(mediaLetras(array));

                break;

            case 5:
                System.out.println(palabraLarga(array));
                break;

            case 6:
                System.out.println(palabraCorta(array));

                break;

            default:
                System.out.println("Opción no contemplada");
                break;


        }


    }

    public static void todasPalabras(String[] array) {
        for (String item :
                array) {
            System.out.print("\t" + item);
        }
    }

    public static String palabraAzar(String[] array) {
        Random r = new Random();

        return array[r.nextInt(0, array.length)];
    }

    /*- Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras*/
    public static int totalLetras(String[] array) {
        int contador = 0;
        for (String item :
                array) {
            contador += item.length();
        }
        return contador;

    }

    public static int mediaLetras(String[] array) {
        int contador = 0;
        for (String item : array) {
            contador += item.length();
        }
        return contador / array.length;
    }
    /*- Ver palabra con más letras*/
    public static String palabraLarga(String[] array) {
        String palabraLarga = "";
        int longitudMaxima = 0;

        for (String palabra : array) {
            int longitudPalabra = palabra.length();
            if (longitudPalabra > longitudMaxima) {
                longitudMaxima = longitudPalabra;
                palabraLarga = palabra;
            }
        }

        return palabraLarga;
    }
    public static String palabraCorta(String[] array){
        Arrays.sort(array);
        return array[0];
    }

}