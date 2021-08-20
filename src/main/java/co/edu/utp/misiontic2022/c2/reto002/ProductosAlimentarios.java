
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.misiontic2022.c2.reto002;

/**
 *productos alimentarios

 * @author david
 */
 class ProductosAlimentarios {
    
    private final double PRECIO_BASE = 80.0;
    private final Integer PESO_BASE = 5;
    private final char TIPO_ALIMENTO = 'N';
    
    private double precioBase;
    private Integer peso;
    private char tipoAlimento;
    
    
    ProductosAlimentarios (){  
        this.precioBase = PRECIO_BASE;
        this.peso = PESO_BASE;
        this.tipoAlimento = TIPO_ALIMENTO;
        
    }
    
    ProductosAlimentarios (double precioBase, Integer peso){
        this.precioBase = precioBase;
        this.peso = peso;
        this.tipoAlimento = TIPO_ALIMENTO;
    }
    
    ProductosAlimentarios (double precioBase, Integer peso, char tipoAlimento){
        
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarTipoAlimento(tipoAlimento);
        
    }
    
    public void comprobarTipoAlimento(char tipoAlimento){
        
        if((tipoAlimento == 'C') || (tipoAlimento == 'N')){
            this.tipoAlimento = tipoAlimento;
        }else{
            this.tipoAlimento = TIPO_ALIMENTO;
        }
        
    }
    
    public double calcularPrecio(){
        
        Integer varPeso = 0;
        Integer varTipoAlimento = 0;
        double precioFinal = 0.0;
        
        if(tipoAlimento == 'N'){
            varTipoAlimento = 40;
        }else{
            varTipoAlimento = 20;
        }
        
        
        if(peso >= 0 && peso <= 9){
            varPeso = 6;
        }else if(peso > 9 && peso <= 16){
            varPeso = 8;
        }else if(peso > 16){
            varPeso = 20;
        }
        
       precioFinal = varPeso + varTipoAlimento + precioBase;
        
        return precioFinal;
    }
    
    
    
    
}


 class Refrigerados extends ProductosAlimentarios{
    
   private final double TEMPERATURA = 10;
   private double temperatura;
   
   Refrigerados(){
        super();
        this.temperatura = TEMPERATURA;
   }
   
   Refrigerados(double precioBase, Integer peso){
        super(precioBase,peso);
        this.temperatura = TEMPERATURA;
        
   }
      
   Refrigerados(double precioBase, Integer peso, Integer temperatura){
        super(precioBase,peso);
        this.temperatura = temperatura;
   }
   
   public double calcularPrecio(){
       
       double varRefrigerado = 0.0;
       double precioFinal = 0.0;
        
        if(temperatura >= 5 && temperatura < 10){ 
            
            varRefrigerado = 20;
                    
        }else if(temperatura >= 10 && temperatura <= 15){
            
            varRefrigerado = 18;
        }else if(temperatura < 5 || temperatura > 15){
            varRefrigerado = 5;
        }
        precioFinal = super.calcularPrecio() + varRefrigerado;
        return precioFinal;
        
   }
    
   
   
}

class Bebidas extends ProductosAlimentarios{
    
    private final char LUGAR_ORIGEN = 'N';
    private char lugarOrigen;
    
    Bebidas(){
        super();
        this.lugarOrigen = LUGAR_ORIGEN;
    }
    
    Bebidas(double precioBase, Integer peso){
        super(precioBase,peso);
        this.lugarOrigen = LUGAR_ORIGEN;
    }
        
    Bebidas(double precioBase, Integer peso, char lugarOrigen){
        super(precioBase,peso);
        comprobarLugarOrigen(lugarOrigen);
    }
    
    public void comprobarLugarOrigen(char lugarOrigen){
        
        if((lugarOrigen == 'N') || (lugarOrigen == 'I')){
            this.lugarOrigen = lugarOrigen;
        }else{
            this.lugarOrigen = LUGAR_ORIGEN;
        }
        
    }
    
    public double calcularPrecio(){
        
        double varBebida = 0.0;
        double precioFinal = 0.0;
        
        if(lugarOrigen == 'N'){ 
            
            varBebida = 5;
                    
        }else{
            
            varBebida = 15;
        }
        precioFinal = super.calcularPrecio() + varBebida;
        return precioFinal;
    }
    
    
}



 class PrecioTotal {
    
    private double tProductosAlimentarios;
    private double tBebidas;
    private double tRefrigerados;
    private ProductosAlimentarios listaProductosAlimentarios[];
    
    PrecioTotal(){
        this.tProductosAlimentarios = 0;
        this.tBebidas = 0;
        this.tRefrigerados = 0;
    }
    
    PrecioTotal(ProductosAlimentarios listaProductosAlimentarios[]){
        this.tProductosAlimentarios = 0;
        this.tBebidas = 0;
        this.tRefrigerados = 0;
        this.listaProductosAlimentarios = listaProductosAlimentarios;
    }
    
    
    PrecioTotal(double tProductosAlimentarios,double tBebidas,double tRefrigerados,ProductosAlimentarios listaProductosAlimentarios[]){
        this.tProductosAlimentarios = tProductosAlimentarios;
        this.tBebidas = tBebidas;
        this.tRefrigerados = tRefrigerados;
        this.listaProductosAlimentarios = listaProductosAlimentarios;
    }
    
    public void mostrarTotal(){
        
        
        for(ProductosAlimentarios element: listaProductosAlimentarios){
            
            if(element instanceof ProductosAlimentarios){
                tProductosAlimentarios +=   element.calcularPrecio();
            }
            
            if(element instanceof Bebidas){
                tBebidas +=  element.calcularPrecio();
            }
            
            if(element instanceof Refrigerados){
                tRefrigerados +=  element.calcularPrecio();
            }
            
        }
        
        System.out.println("El precio total de los Productos Alimentarios es de " +
tProductosAlimentarios);
 System.out.println("La suma del precio de las Bebidas es de " + tBebidas);
 System.out.println("La suma del precio de los Refrigerados es de " +
tRefrigerados);
 }
        
        
 }
    
    
    
    

