
package modelo;

import controlador.Controlador;
import vista.Vista;


public class Principal {
    public static void main(String[] args){
        Lista li = new Lista();
        Vista vi = new Vista();
        Controlador co = new Controlador(li, vi);
        co.Iniciar();
        vi.setVisible(true);
    }
}
