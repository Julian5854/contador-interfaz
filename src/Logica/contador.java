/*
 * clase contador.java
 * @version 1.0
 */
package Logica;

/**
 *
 * @author 20182020051
 */
public class contador {
    private int valor;
    
    public contador(){
        this.valor = 0;
        
    }
    
    /**
     * Metodo que retorna el valor del contador
     * @return el valor del contador
     */
    public int getValor() {
        return valor;
    }
    
    /**
     * metodo que establece el valor del contador
     * @param valor: entero que se setea en el atributo de la clase 
     */    
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    /**
     * Metodo que avanza el valor del contador
     */
    public void avanzar (){
        this.valor += 1;        
    }
    
    /**
     * Metodo que retrocede el valor del contador
     */
    public void retroceder (){
        this.valor -= 1;        
    }
    
    
    /**
     * Metodo que reinicia el valor del contador
     */
    public void borrar (){
        this.valor = 0;        
    }
}
