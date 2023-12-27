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
        System.out.println("Selecciones la operación matemática");
        op=scanner.next();


        switch (op){
            case "+":

                System.out.println(suma(numUno,numDos));
                break;

            case "-":
                



        }


    }
}
