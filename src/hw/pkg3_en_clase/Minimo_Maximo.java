package hw.pkg3_en_clase;
import java.util.Scanner;
public class Minimo_Maximo {

    public static void main(String[] args) {
       Scanner lea=new Scanner (System.in);
        
       System.out.println("Ingrese el primer numero:");
       int numero1=lea.nextInt();
       System.out.println("Ingrese el segundo numero: ");
       int numero2=lea.nextInt();
       
       int calculom=numero1*numero2;
       int calculoM=numero1/numero2;
       
       System.out.println("El mcm es: "+calculom);
       System.out.println("EL MCD es: "+calculoM);
       
       
    }
    
}
