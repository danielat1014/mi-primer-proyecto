import java.util.Scanner;

public class App {

   //public static void main(String[] args) throws Exception {

    /*     int a = 10;
        int b = 3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); //division entera
        System.out.println(a%b); //modulo(residuo)

        //operadores de asignacion abreviados

        int x = 10;

        x += 5;
        x -= 3;
        x *= 2;
        x /= 4;
        x++;
        x--;


        //operadores de comparacion
        int edad = 20;

        System.out.println(edad == 20);
        System.out.println(edad != 20);
        System.out.println(edad > 20);
        System.out.println(edad < 20);
        System.out.println(edad >= 20);
        System.out.println(edad <= 20);

        //operadores logicos

        boolean mayorDeEdad = true;
        boolean tieneCarnet  = false;

        System.out.println(mayorDeEdad && tieneCarnet);
        System.out.println(mayorDeEdad || tieneCarnet);
        System.out.println(!mayorDeEdad);  
        
        */

        /*Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese Base  ");
        double base = sc.nextDouble();

        System.out.println("Ingrese altura  ");
        double altura = sc.nextDouble();
        
        double area = base * altura;

        System.out.println("El área del rectángulo es: " + area);

        sc.close();*/

        /*Scanner sc = new Scanner (System.in);

        System.out.println("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.println("Nota 3: ");
        double nota3 = sc.nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("El promedio es: " + promedio);

        sc.close();*/

      /*   int nota = 75;

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Bueno");
        } else if (nota >= 60) {
            System.out.println("Aprobado");
        } else{
            System.out.println("Reprobado");
        }
    */

    /*  if sin llaves:

        if (edad >= 18)
        System.out.println("Mayor de edad");        

    */

    /*operador ternario      
    int edad = 20;

    String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
    System.out.println(mensaje);
    */

    /* ejemplo switch ->> según el valor de una variable
    Scanner sc = new Scanner (System.in);

    System.out.println("Ingrese Dia de la semana: ");
        int dia = sc.nextInt();

    String nombreDia;

    switch (dia) {
        case 1:
            nombreDia = "Lunes";
            break;
        case 2:
            nombreDia = "Martes";
            break;
        case 3:
            nombreDia = "Miércoles";
            break;
        case 4:
            nombreDia = "Jueves";
            break;
        case 5:
            nombreDia = "Viernes";
            break;
        case 6:
            nombreDia = "Sábado";
            break;
        case 7:
            nombreDia = "Domingo";
            break;
        default:
            nombreDia = "Día no inválido";
            break;    
    }  

    System.out.println(nombreDia);

    sc.close();  */

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número 1: ");
        double a = sc.nextDouble();

        System.out.println("Operación (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.println("Número 2: ");
        double b = sc.nextDouble();

        double resultado;

        switch (op) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Error: División por cero");
                }
                break;
            default:
                System.out.println("Operación no válida");
                
        sc.close();

        }
        */

        /*  for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración: " + i);
        }
        */

        /*for (int i = 0; i <= 10; i+=2) {
            System.out.println("Iteración: " + i);
        }
        */

        /*for (int i = 0; i <= 20; i++) {
            if (i%2 == 0) {
                System.out.println("Iteración: " + i);
            }
        }
        */
        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("¿De que numero quieres la tabla?: ");
            int numero = sc.nextInt();

            System.out.println("\nTabla del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

            sc.close();
        }

    }