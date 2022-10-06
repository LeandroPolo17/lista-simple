
package modelo;

public class Nodo {
    private Object informacion;
    private Nodo siquiente;

    public Nodo() {
        this.informacion = "";
        this.siquiente = null;
    }
    

    public Object getInformacion() {
        return informacion;
    }

    public void setInformacion(Object informacion) {
        this.informacion = informacion;
    }

    public Nodo getSiquiente() {
        return siquiente;
    }

    public void setSiquiente(Nodo siquiente) {
        this.siquiente = siquiente;
    }
    
    public void setSiguiente(Nodo siguiente) {
        this.siquiente = siguiente;
    }   
    
    
    
    
}
