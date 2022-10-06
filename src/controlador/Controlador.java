
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Lista;
import modelo.Nodo;
import vista.Vista;


public class Controlador implements ActionListener{
    
    private Vista vi;
    private Lista li;
    private Nodo no;
    private int con;

    

    public Controlador(Lista li, Vista vi) {
          this.vi = vi;
        this.li = li;
        this.no = no;
        this.con = 0;
        
        
         //botones
        this.vi.btnmostrar.addActionListener(this);
        this.vi.btnagregar.addActionListener(this);
        this.vi.btnagregarInicio.addActionListener(this);
    }

    
    
    
    
    
     public void Iniciar() {
        vi.setTitle("agregar valor a nodos");
        vi.setLocationRelativeTo(null);
    }
     
     
     
     
     
    public void agregarAlFinal(){
         
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setInformacion(vi.txtagregar.getText());
        // Consulta si la lista esta vacia.
        if (li.esVacia()) {
            // Inicializa la lista agregando como inicio al nuevo nodo.
            li.setUltimo(nuevo);
            li.setPrimero(nuevo);
            con++;
        // Caso contrario recorre la lista hasta llegar al ultimo nodo
        //y agrega el nuevo.
        } else{
            // Crea ua copia de la lista.
           // Nodo aux = li.getUltimo();
            
            li.getUltimo().setSiguiente(nuevo);
            li.setUltimo(nuevo);
            con++;
            // Recorre la lista hasta llegar al ultimo nodo.
           // while(aux.getSiquiente() != null){
            //    aux = aux.getSiquiente();
            }
            // Agrega el nuevo nodo al final de la lista.
           // aux.setSiguiente(nuevo);
        }
        // Incrementa el contador de tamaño de la lista
       // li.setUltimo((li.getUltimo()+1)); 
     public void agregarAlmedio(){
         
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setInformacion(vi.txtagregar.getText());
        // Consulta si la lista esta vacia.
        if (li.esVacia()) {
            
            li.setUltimo(nuevo);
            li.setPrimero(nuevo);
            
            con++;
       
        } else{
            // Crea ua copia de la lista.
           Nodo aux = li.getPrimero();
            
         
            // Recorre la lista hasta llegar al ultimo nodo.
            while(aux.getSiquiente() != null ){
                aux = aux.getSiquiente();
                
                
                
            }
            // Agrega el nuevo nodo al final de la lista.
           // aux.setSiguiente(nuevo);
        }
     }
        // Incrementa el contador de tamaño de la lista
       // li.setUltimo((li.getUltimo()+1)); 
   
     public void listar(){
         String otra="";
        // Verifica si la lista contiene elementoa.
        if (!li.esVacia()) {
            // Crea una copia de la lista.
            Nodo aux = li.getPrimero();
            // Posicion de los elementos de la lista.
            int i = 0;
            // Recorre la lista hasta el final.
            while(aux != null){
                // Imprime en pantalla el valor del nodo.
               otra +=aux.getInformacion() +"\n";
                // Avanza al siguiente nodo.
                aux = aux.getSiquiente();
                // Incrementa el contador de la posión.
                i++;
            }
            vi.txtmostrar.setText( otra);
             //vi.txtmostrar.setText(i + ".[ " + otra + " ]" + " ->  ");
        }
    }

        


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vi.btnagregar){
            agregarAlFinal();
        }else if(e.getSource()==vi.btnmostrar){
            listar();
        }else if(e.getSource()==vi.btnagregarInicio){
            li.agregaralinicio(vi.txtagregar.getText());
        }
    }

}
