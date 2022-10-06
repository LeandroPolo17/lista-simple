
package modelo;

import java.util.HashSet;
import java.util.Set;


public class Lista {
    private Nodo primero;
    private Nodo ultimo;

    public Lista() {
        this.primero = null;
        this.ultimo = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
    //metodos

   public boolean esVacia(){
        return primero == null;
    }
  
    public Nodo getTamanio(){
        return ultimo;
    }
    
   //metodos
    
    public void agregaralinicio(String dato){
        
        Nodo nuevo = new Nodo();
        nuevo.setInformacion(dato);
        
      if(esVacia()){
          setPrimero(nuevo);
          setUltimo(nuevo);
          
         
      } else{
          
          nuevo.setSiguiente(getPrimero());
          setPrimero(nuevo);
      }       
        
    }
   
    
}
