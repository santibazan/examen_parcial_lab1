
import java.util.Scanner;

public class Calculadora_SantiagoBazan {
    public static void main(String[] args){
        /*Definimos las variables numericas y para las opciones*/
        int num1, num2, op;

        Scanner leer= new Scanner(System.in);

        /*Le pedimos al usuario que ingrese los datos mediante la funcion Scanner*/
        System.out.println("Ingrese el primer numero: ");
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2=leer.nextInt();

        /*Le pedimos al usuario que ingrese la opcion que desee*/
        System.out.println("Menu de opciones.");
        System.out.println("Ingrese 1 para entrar en la suma.");
        System.out.println("Ingrese 2 para entrar en la surestama.");
        System.out.println("Ingrese 3 para entrar en la multiplicacion.");
        System.out.println("Ingrese 4 para entrar en la division.");
        System.out.println("Ingrese 5 para entrar en la secuencia de operaciones.");
        System.out.println("Ingrese 6 para salir de la calculadora.");
        op=leer.nextInt();

        /*Aca el usuario entra a la opcion que eligio*/
        /*Menu de sumas*/
        if(op==1){
            System.out.println("Ha elegido la opcion suma.");
            int suma;
            suma=num1+num2;
            System.out.println("La suma entre "+num1+" y "+num2+" es "+suma);

        }
        
        /*Menu de resta*/
        else if (op==2) {
            System.out.println("Ha elegido la opcion resta.");
            int resta;
            resta=num1-num2;
            System.out.println("La resta entre "+num1+" y "+num2+" es "+resta);
        }
        /*Menu de multiplicacion*/
        else if (op==3) {
            System.out.println("Ha elegido la opcion multiplicacion.");
            int multiplicacion;
            multiplicacion=num1*num2;
            System.out.println("La multiplicacion entre "+num1+" y "+num2+" es "+multiplicacion);
        }
        /*Menu de division*/
        else if (op==4) {
            System.out.println("Ha elegido la opcion dividir.");
            float dividir;
            dividir=num1/num2;
            if (num2==0){
                System.out.println("No se pueden realizar la division por 0");
            }
            else {
                System.out.println("La division entre "+num1+" y "+num2+" es "+dividir);
            }

        }
        /*Menu de secuencia de operaciones*/
        else if (op==5) {
            System.out.println("Ha elegido la opcion secuencia de operaciones.");

            float suma, resta, multiplicacion, division;
            suma=num1+num2;
            resta=suma-num2;
            multiplicacion=resta*num2;
            division=multiplicacion*num2;

            System.out.println("La suma entre "+num1+" y "+num2+" es "+suma);
            System.out.println("La resta entre "+suma+" y "+num2+" es "+resta);
            System.out.println("La multiplicacion entre "+resta+" y "+num2+" es "+multiplicacion);
            if (num2==0){
                System.out.println("No se pueden realizar la division por 0");
            }
            else {
                System.out.println("La division entre "+multiplicacion+" y "+num2+" es "+division);
            }
        }
        /*Menu de salida*/
        else if (op==6) {
            System.out.println("Ha elegido la opcion de salir.");
            System.out.println("Saliendo de la calculadora. Muchas gracias");
        }
        /*En esta parte utilizamos una validacion para aclararle al usuario de que ha ingresado una opcion incorrecta*/
        else{
            System.out.println("Opcion invalida");
        }

    }
}

