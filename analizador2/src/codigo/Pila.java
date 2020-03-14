/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author candelariasarahi
 */
public class Pila {
    private Nodo UltimoValor;
    public Pila(){
        UltimoValor=null;
    }
    public void Insertar(char valor){
        Nodo nuevo_n=new Nodo();
        nuevo_n.inf=valor;
        if(UltimoValor==null){
            nuevo_n.siguiente=null;
            UltimoValor=nuevo_n;
        }else{
            nuevo_n.siguiente=UltimoValor;
            UltimoValor=nuevo_n;
        }
               
    }
    public char Extraer(){
        if(UltimoValor != null){
            char inf=UltimoValor.inf;
            UltimoValor=UltimoValor.siguiente;
            return inf;
        }else{
            return Character.MAX_VALUE;
            
        }
    }
    public boolean PilaVacia(){
        return UltimoValor== null;
        
    }
}
