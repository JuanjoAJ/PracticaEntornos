import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numUno, numDos;
        String op;
        System.out.println("Introduzca primer número");
        numUno=scanner.nextInt();
        System.out.println("Introduzca segundo número");
        numDos=scanner.nextInt();
        System.out.println("Selecciona la operación matemática: \n\n \t+ \t\t- \t\tx \t\t/");
        op=scanner.next();


       switch (op){
            case "+":

                System.out.printf("La suma entre %d y %d da un resultado de %d",numUno,numDos, suma(numUno,numDos));
                break;

            case "-":

                System.out.printf("La resta entre %d y %d da un resultado de %d",numUno,numDos, resta(numUno,numDos));
                break;

           case "x":
               System.out.printf("La multiplicación entre %d y %d da un resultado de %d",numUno,numDos, mult(numUno,numDos));
               break;

           case "/":
               System.out.printf("La división entre %d y %d da un resultado de %.2f",numUno,numDos, div(numUno,numDos));
               break;

           default:
               System.out.println("Lo siento, esa operación aún no la tenemos contemplada");
               break;



        }


    }
}
