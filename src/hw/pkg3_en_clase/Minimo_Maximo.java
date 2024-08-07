package hw.pkg3_en_clase;
import java.util.Scanner;
public class Minimo_Maximo {

    public static void main(String[] args) {
       Scanner lea=new Scanner (System.in);
        
int menu=0;
       while (menu!=4){
           System.out.println("------ Menu Principal ------"+
                       "\n 1 Piramide"
                     + "\n 2 mcm y MCD"
                     + "\n 3 Numero Perfecto"
                     + "\n 4 Salir del programa"
                     + "\n Elija una opcion del (1 al 4)");
           menu=lea.nextInt();
           lea.nextLine();
               
          //menu 1 Piramide
          if (menu==1){
              System.out.println("------ Piramide ------");
              int AreaMayor=0, triangulo=0;
              
              for(int i=1; i<9; i++){
                  System.out.println("La base del triangulo #: "+i);
                  int base=lea.nextInt();
                  
                  System.out.println("La altura del traingulo #: "+i);
                  int altura=lea.nextInt();
                  int area=(base*altura)/2;
                  
                  if(area>AreaMayor){
                      AreaMayor=area;
                      triangulo=i;
                  }
              }
              System.out.println("La area mayor es: "+AreaMayor+" en el triagulo # "+triangulo);
              
              
           //menu 2 de mcm y MCD        
           }else if (menu==2){
               System.out.println("------ mcm y MCD ------");
               System.out.println("Ingrese el primer numero:");
               int numero1=lea.nextInt();
               System.out.println("Ingrese el segundo numero: ");
               int numero2=lea.nextInt();
               
               int num1=numero1, num2=numero2, tem=0;
               for(;num2!=0;){
                   tem=num2;
                   num2=num1%num2;
                   num1=tem;
               }
               int calculoMCD=num1;
               int calculomcm=(numero1*numero2)/calculoMCD;
                     
               System.out.println("El mcm es: "+calculomcm);
               System.out.println("EL MCD es: "+calculoMCD);        
               
           //menu 3 Numero perfecto
           }else if (menu==3){
             System.out.println("----------- Numero Perfecto -------------");
             System.out.println("Ingrese un numero:");
             int numero=lea.nextInt();
       
             if (numero <=0){
                System.out.println(numero + "No es un numero perfecto");
        } else {
             int suma=0;
             for (int i=1; i<=numero/2; i++){
                if (numero % i==0) {
                    suma+=i;
                }
            }
            
            if (suma==numero){
                System.out.println(" Es un numero perfecto: "+numero);
            }else{
                System.out.println(" No es un numero perfecto: "+numero);
            }
        }
    
            //menu 4  para salir
           }else if (menu==4){
               
                 System.out.println("------ FIN DEL PROGRAMA ------");
                 System.out.println("Gracias por su visita.");
               
            }else{
               System.out.println("Seleccione una opcion valida");
           }
            
       }
    }
    }
