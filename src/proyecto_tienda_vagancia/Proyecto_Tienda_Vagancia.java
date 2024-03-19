/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_tienda_vagancia;
import java.util.Scanner;
import java.math.*;

/**
 *
 * @author Equipo Yefry
 */
public class Proyecto_Tienda_Vagancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double Cantidadarroz,Cantidadhuevos,Cantidadaceite,Cantidadleche,Cantidadazucar,Cantidadpanela,Cantidadtotal;
        double arroz,huevos,aceite,leche,azucar,panela,z,numerorifa;
        arroz=3000;
        huevos=15000;
        aceite=5000;
        leche=2000;
        azucar=4000;
        panela=8000;
                
        double totalarroz,totalhuevos,totalaceite,totalleche,totalazucar,totalpanela,total,descuento,totaldescuento;
        System.out.println("Bienvenidos a la tienda la vagancia");
        System.out.println("ingrese la cantidad de arroz");
        Scanner leerarroz=new Scanner (System.in);
        Cantidadarroz = leerarroz.nextInt ();
        totalarroz=arroz*Cantidadarroz;
        
        System.out.println ("ingrese la cantida de huevos");
        Scanner leerhuevos=new Scanner (System.in);
        Cantidadhuevos = leerhuevos.nextInt();
        totalhuevos=huevos*Cantidadhuevos;
        
        
        System.out.println("ingrese la cantidad de aceite");
        Scanner leeraceite=new Scanner (System.in);
        Cantidadaceite = leeraceite.nextInt ();
        totalaceite=aceite*Cantidadaceite;
        
        System.out.println("ingrese la cantidad de leche");
        Scanner leerleche=new Scanner (System.in);
        Cantidadleche = leerleche.nextInt ();
        totalleche=leche*Cantidadleche;
        
        System.out.println("ingrese la cantidad de azucar");
        Scanner leerazucar=new Scanner (System.in);
        Cantidadazucar = leerazucar.nextInt ();
        totalazucar=azucar*Cantidadazucar;
        
        System.out.println("ingrese la cantidad de panela");
        Scanner leerpanela=new Scanner (System.in);
        Cantidadpanela = leerpanela.nextInt ();
        totalpanela=panela*Cantidadpanela;
        
        total=totalpanela+totalazucar+totalleche+totalaceite+totalhuevos+totalarroz;
        System.out.println("El total a pagar es="+total);
        
        if(total>50000){
            System.out.println("participa en una rifa de un camaro zL1");
        }
        else {
            System.out.println("no paticipas en la rifa de un camarozL1");
        }
        numerorifa=78;
        
        z=(int)(Math.random()*100+1);
        System.out.println("el numero ganador es="+z);
        
        
        if(z==numerorifa){
            System.out.println("ganaste un camaro zL1");
        }
        else {
            System.out.println("sigue intentandolo");
        }
        
        
        if(total>100000){
            System.out.println("te daremos un descuento del 30%");
            descuento=total*0.30;
            totaldescuento=total-descuento;        
            System.out.println("lo que tienes que pagar es=");
        }
        else {
            System.out.println("no te vamos a dar el descuento");
            System.out.println("tienes que pagar="+total);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
                
                
                
                
                
                
        
        
    }
    
}
