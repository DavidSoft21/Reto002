/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.misiontic2022.c2.reto002;

/**
 *
 * @author david
 */
public class App {
    
    public static void main(String arg[]){
        
        ProductosAlimentarios listaProductosAlimentarios1[] = new ProductosAlimentarios[5];
        listaProductosAlimentarios1[0] = new ProductosAlimentarios();
        listaProductosAlimentarios1[1] = new Bebidas(200.0,10,'n');
        listaProductosAlimentarios1[2] = new Refrigerados(140.0,20);
        listaProductosAlimentarios1[3] = new Bebidas(120.0,10,'I');
        listaProductosAlimentarios1[4] = new Refrigerados(110.0,7);
        PrecioTotal solucion1 = new PrecioTotal(listaProductosAlimentarios1);
        solucion1.mostrarTotal();
        System.out.println();

    }
    
    
    
}
