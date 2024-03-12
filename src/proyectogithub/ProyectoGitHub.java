/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectogithub;

/**
 *
 * @author Equipo Yefry
 */
import java.util.Scanner;
import java.math.*; 

public class ProyectoGitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
     
     int a;
     
     System.out.println("ingrese el primer numero");
     Scanner leerDato = new Scanner (System.in);
     a=leerDato.nextInt ();
     
     int b;
     System.out.println("ingrese el primer numero");
     Scanner leerDatos = new Scanner (System.in);
     b=leerDatos.nextInt ();

     int c;
     c=a+b;
     System.out.println("la suma es="+c);
     
     int d;
     d=a-b;
     System.out.println("la resta es="+d);
     
     int e;
     e=a*b;
     System.out.println("la multiplicacion es="+e);
     
     int f;
     
     f=Math.min(a, b);
     System.out.println("el valor minimo es="+f);
     
     
     
     
     
     
     
     
     
     
     
     
     
    }
    
    
    
}
