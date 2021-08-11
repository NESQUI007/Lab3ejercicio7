package lab3ejercicio7;
import java.util.Scanner;
public class Lab3ejercicio7 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
        int hora, Dias1, Dias2, Semana, hora1;
         
        System.out.println("Ingrese el Numero de Horas");
        hora = entrada.nextInt();
        Dias1 = hora / 24;
        Semana = Dias1 / 7;
        Dias2 = (Dias1-(Semana*7));
        hora1 = hora - (((Semana *7)*24)+(Dias2*24));
        System.out.println("Hay "+Semana+" Semanas con "+ Dias2+" Dias y "+ hora1 + " horas.");
}
    }
