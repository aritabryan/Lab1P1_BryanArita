
package lab1p1_bryanarita;

import java.util.Scanner;


public class Lab1P1_BryanArita {

    
    public static void main(String[] args) {
        
        Scanner cod = new Scanner (System.in);
        
        int numero = 2;
        char character = 'a';
        double doble = 1.25;
        boolean VoF = true;
        System.out.println("Elija el ejercicio: ");
        numero = cod.nextInt();
        
        if (numero == 1){
            int num1 =15;
            int num2 =30;
            int resultado;
            resultado = 15*30;
            System.out.print("Resultado: ");
            System.out.println(resultado);
           
        
        }else if (numero == 2){ 
            System.out.println("Ingrese un numero entero: ");
            int numeroUsuario = cod.nextInt();
            System.out.println("Ingrese un numero entero: ");
            int numeroUsuario2 = cod.nextInt();
            System.out.println("Ingrese un numero entero: ");
            int numeroUsuario3 = cod.nextInt ();
            
            double promedio = (numeroUsuario+numeroUsuario2+numeroUsuario3)/3;
            
            System.out.println( "Promedio: "+ promedio);
            
        }else{
            System.out.println("Salio del pograma");
           
    }
    
}
}
